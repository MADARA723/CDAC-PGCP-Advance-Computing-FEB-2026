package com.java.Assignment_01.qn3;

public abstract class Customer extends Person {

    private String creditClass;
    private double discount;
    private String plan;

    public Customer() {}

    public Customer(String name, String mobno, String emailId, int id,
                    String creditClass, double discount, String plan) {
        super(name, mobno, emailId, id);
        this.creditClass = creditClass;
        this.discount = discount;
        this.plan = plan;
    }

    public String getCreditClass() { return creditClass; }
    public void setCreditClass(String creditClass) { this.creditClass = creditClass; }

    public double getDiscount() { return discount; }
    public void setDiscount(double discount) { this.discount = discount; }

    public String getPlan() { return plan; }
    public void setPlan(String plan) { this.plan = plan; }
}