package com.demo.service;

import java.util.List;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.model.Product;

public class ProductServiceImpl
implements ProductService {

    ProductDao dao = new ProductDaoImpl();

    @Override
    public boolean addProduct(Product p) {
        return dao.saveProduct(p);
    }

    @Override
    public List<Product> getAllProducts() {
        return dao.getAllProducts();
    }

    @Override
    public Product getProductById(int pid) {
        return dao.getProductById(pid);
    }

    @Override
    public boolean updateProduct(Product p) {
        return dao.updateProduct(p);
    }

    @Override
    public boolean deleteProduct(int pid) {
        return dao.deleteProduct(pid);
    }
}