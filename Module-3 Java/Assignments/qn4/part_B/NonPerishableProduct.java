package com.java.Assignment_01.qn4.part_B;

public class NonPerishableProduct extends Product {

    private String category;

    public NonPerishableProduct(int id, String name, String mfgDate,
                                double price, String category) {
        super(id, name, "NonPerishable", mfgDate, price);
        this.category = category;
    }

    @Override
    public double calculateTax() {
        return (price * 0.15) + 100;
    }
}