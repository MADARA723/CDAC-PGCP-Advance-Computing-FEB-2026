package com.java.Assignment_01.qn3;

public class IndividualCustomer extends Customer {

    private String phoneNumber;

    public IndividualCustomer() {}

    public IndividualCustomer(String name, String mobno, String emailId, int id,
                              String creditClass, double discount, String plan,
                              String phoneNumber) {
        super(name, mobno, emailId, id, creditClass, discount, plan);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
         return phoneNumber;
          }
    public void setPhoneNumber(String phoneNumber) { 
        this.phoneNumber = phoneNumber;
         }
}