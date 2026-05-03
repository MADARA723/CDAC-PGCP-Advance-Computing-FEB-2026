package com.java.Assignment_01.qn3;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        VendorService vendorService = new VendorService();

        IndividualCustomer c1 = new IndividualCustomer(
                "Atharv", "98765430", "atharv@gail.com", 1,
                "A", 10.0, "Premium", "98765430"
        );

        CompanyCustomer c2 = new CompanyCustomer(
                "ABC Pvt Ltd", "9123456780", "abc@company.com", 2,
                "B", 15.0, "Corporate",
                "Rahul", 50000, 10,
                Arrays.asList("9001", "9002", "9003")
        );

        TelecomVendor v1 = new TelecomVendor(
                "Vendor1", "9999999999", "vendor@mail.com", 101,
                Arrays.asList("SIM Cards", "Routers", "Cables")
        );

        customerService.addCustomer(c1);
        customerService.addCustomer(c2);
        vendorService.addVendor(v1);

        customerService.displayAllCustomers();
        vendorService.displayAllVendors();
    }
}