package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface ProductDao {
	
	List<Product> findAll();
	
	public boolean saveProduct(Product p);
	
	public Product findById(int pid);
	

}
