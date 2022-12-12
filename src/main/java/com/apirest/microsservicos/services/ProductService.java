package com.apirest.microsservicos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.microsservicos.domain.Product;
import com.apirest.microsservicos.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public List<Product> getAll(){
		return repo.getAll();
	}
	
	public Optional<Product> getById(Integer id){
		return repo.getById(id);
	}
	
	public Product addProduct(Product product) {
		repo.addProduct(product);
		return product;
	}
	
	public void deletById(Integer id) {
		repo.deletById(id);
	}
	
	public Product update(Integer id, Product product) {
		product.setId(id);
		return repo.update(product);
	}

}
