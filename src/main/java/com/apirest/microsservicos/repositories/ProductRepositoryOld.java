package com.apirest.microsservicos.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.apirest.microsservicos.domain.Product;
import com.apirest.microsservicos.resources.exception.ResourceNotFoundException;

@Repository
public class ProductRepositoryOld{
	
	private List<Product> products = new ArrayList<>();
	private Integer lastId = 0;
	
	
	/** 
	 * @author victor
	 * @return List of Products 
	 */
	public List<Product> getAll(){
		return products;
	}
	
	public Optional<Product	> getById(Integer id) {
		return products.stream().filter(product -> product.getId() == id).findFirst();
	}
	
	public Product addProduct(Product product) {
		lastId ++;
		product.setId(lastId);
		products.add(product);
		return product;
	}
	
	public void deleteById(Integer id) {
		products.removeIf(product -> product.getId() == id);
	}
	
	public Product update(Product product) {
		Optional<Product> returnProduct =  getById(product.getId());
		
		if (returnProduct.isEmpty())
			throw new ResourceNotFoundException("Produto não encontrado");
		
		deleteById(product.getId());
		
		products.add(product);
		
		return product;
		
	}
	
}
