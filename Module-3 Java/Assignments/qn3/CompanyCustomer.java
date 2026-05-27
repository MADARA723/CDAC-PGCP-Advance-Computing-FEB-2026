package com.java.Assignment_01.qn3;

import java.util.List;

public class CompanyCustomer extends Customer {

    private String relationshipManager;
    private double creditLine;
    private int extensions;
    private List<String> numbers;

    public CompanyCustomer() {}

    public CompanyCustomer(String name, String mobno, String emailId, int id,
                           String creditClass, double discount, String plan,
                           String relationshipManager, double creditLine,
                           int extensions, List<String> numbers) {
        super(name, mobno, emailId, id, creditClass, discount, plan);
        this.relationshipManager = relationshipManager;
        this.creditLine = creditLine;
        this.extensions = extensions;
        this.numbers = numbers;
    }

    public String getRelationshipManager() {
         return relationshipManager; 
         }
    public void setRelationshipManager(String relationshipManager) {
         this.relationshipManager = relationshipManager;
          }

    public double getCreditLine() {
         return creditLine;
          }
    public void setCreditLine(double creditLine) {
         this.creditLine = creditLine;
          }

    public int getExtensions() {
         return extensions;
          }
    public void setExtensions(int extensions) {
         this.extensions = extensions;
          }

    public List<String> getNumbers() {
         return numbers;
          }
    public void setNumbers(List<String> numbers) { 
        this.numbers = numbers; 
        }
}