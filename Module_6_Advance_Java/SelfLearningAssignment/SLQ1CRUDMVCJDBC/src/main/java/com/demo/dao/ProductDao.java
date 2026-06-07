package com.demo.dao;

import java.util.List;
import com.demo.model.Product;

public interface ProductDao {

    boolean saveProduct(Product p);

    List<Product> getAllProducts();

    Product getProductById(int pid);

    boolean updateProduct(Product p);

    boolean deleteProduct(int pid);
} 