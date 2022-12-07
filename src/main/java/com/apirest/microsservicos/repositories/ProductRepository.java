package com.apirest.microsservicos.repositories;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.apirest.microsservicos.domain.Product;

@Repository
public class ProductRepository{
	
	private ArrayList<Product> products = new ArrayList<>(); 
	
}
