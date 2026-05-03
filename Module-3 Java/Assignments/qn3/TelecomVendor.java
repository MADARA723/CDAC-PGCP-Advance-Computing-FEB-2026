package com.java.Assignment_01.qn3;

import java.util.List;

public class TelecomVendor extends Person {

    private List<String> products;

    public TelecomVendor() {}

    public TelecomVendor(String name, String mobno, String emailId, int id,
                         List<String> products) {
        super(name, mobno, emailId, id);
        this.products = products;
    }

    public List<String> getProducts() { return products; }
    public void setProducts(List<String> products) { this.products = products; }
}