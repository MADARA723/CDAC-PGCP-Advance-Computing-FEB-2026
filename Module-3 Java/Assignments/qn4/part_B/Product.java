package com.java.Assignment_01.qn4.part_B;

public abstract class Product {

    protected int id;
    protected String name;
    protected String type;
    protected String mfgDate;
    protected double price;

    public Product(int id, String name, String type, String mfgDate, double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.mfgDate = mfgDate;
        this.price = price;
    }

    public abstract double calculateTax();
}