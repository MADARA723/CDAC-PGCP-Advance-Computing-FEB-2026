package com.java.Assignment_01.qn3;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void displayAllCustomers() {
        for (Customer c : customers) {
            System.out.println("ID: " + c.getId());
            System.out.println("Name: " + c.getName());
            System.out.println("Email: " + c.getEmailId());
            System.out.println("Plan: " + c.getPlan());
            System.out.println("----------------------");
        }
    }

    public Customer findCustomerById(int id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}