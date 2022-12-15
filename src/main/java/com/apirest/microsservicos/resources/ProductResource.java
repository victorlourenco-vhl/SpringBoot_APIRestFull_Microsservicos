package com.apirest.microsservicos.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.microsservicos.domain.Product;
import com.apirest.microsservicos.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public List<Product> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Product> getById(@PathVariable Integer id) {
		return service.getById(id);
	}
	
	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@DeleteMapping("/{id}")
	public String deleteById(@PathVariable Integer id) {
		return "Produto com id " + id + " foi deletado!";
	}
	
	@PutMapping("/{id}")
	public Product update(@PathVariable Integer id, @RequestBody Product produt){
		return service.update(id, produt);
	}

	
}




