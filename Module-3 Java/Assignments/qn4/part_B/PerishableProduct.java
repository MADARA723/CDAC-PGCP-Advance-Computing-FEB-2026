package com.java.Assignment_01.qn4.part_B;

public class PerishableProduct extends Product {

    private String expDate;

    public PerishableProduct(int id, String name, String mfgDate,
                             double price, String expDate) {
        super(id, name, "Perishable", mfgDate, price);
        this.expDate = expDate;
    }

    @Override
    public double calculateTax() {
        return price * 0.05;
    }
}