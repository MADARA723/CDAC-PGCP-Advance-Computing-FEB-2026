package com.java.Assignment_01.qn4.part_B;

import java.util.*;

public class MainApp {

    public static void main(String[] args) {

        TreeMap<Integer, Product> productMap = new TreeMap<>();


        Product p1 = new PerishableProduct(1, "Milk", "2026-04-01", 50.0, "2026-04-05");
        Product p2 = new NonPerishableProduct(2, "Laptop", "2026-03-15", 50000.0, "Electronics");
        Product p3 = new PerishableProduct(3, "Bread", "2026-04-07", 30.0, "2026-04-10");


        productMap.put(p1.id, p1);
        productMap.put(p2.id, p2);
        productMap.put(p3.id, p3);

        for (Map.Entry<Integer, Product> entry : productMap.entrySet()) {
            Product p = entry.getValue();

            System.out.println("ID: " + p.id);
            System.out.println("Name: " + p.name);
            System.out.println("Type: " + p.type);
            System.out.println("Mfg Date: " + p.mfgDate);
            System.out.println("Price: " + p.price);
            System.out.println("Tax: " + p.calculateTax());
            System.out.println("----------------------");
        }
    }
}