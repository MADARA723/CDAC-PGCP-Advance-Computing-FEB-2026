package com.demo.service;

import java.util.List;
import com.demo.model.Product;

public interface ProductService {

    boolean addProduct(Product p);

    List<Product> getAllProducts();

    Product getProductById(int pid);

    boolean updateProduct(Product p);

    boolean deleteProduct(int pid);
}