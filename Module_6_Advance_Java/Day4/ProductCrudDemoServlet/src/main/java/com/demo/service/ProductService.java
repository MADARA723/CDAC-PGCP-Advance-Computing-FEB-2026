package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getAll();
	
	public boolean addProduct(Product p);
	
	public Product getById(int pid);
}
