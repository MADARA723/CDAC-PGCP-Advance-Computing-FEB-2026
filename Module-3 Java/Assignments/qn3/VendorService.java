package com.java.Assignment_01.qn3;

import java.util.ArrayList;
import java.util.List;

public class VendorService {

    private List<TelecomVendor> vendors = new ArrayList<>();

    public void addVendor(TelecomVendor vendor) {
        vendors.add(vendor);
    }

    public void displayAllVendors() {
        for (TelecomVendor v : vendors) {
            System.out.println("ID: " + v.getId());
            System.out.println("Name: " + v.getName());
            System.out.println("Products: " + v.getProducts());
            System.out.println("----------------------");
        }
    }
}