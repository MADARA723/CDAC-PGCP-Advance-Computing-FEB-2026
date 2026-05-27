package com.Basics;

// concrete class → object can be created
// extends → inherits Employee → Person
public class ContractEmp extends Employee {

    // private → encapsulation
    private float hrs;       // working hours
    private double charges;  // charges per hour

    // Default constructor
    public ContractEmp() {
        // super() → calls Employee default constructor
        super();
    }

    // Parameterized constructor
    public ContractEmp(int id, String nm, String m, String dept, String desg, float hrs, double charges) {

        // super → call parent constructor chain
        super(id, nm, m, dept, desg);

        // initialize contract employee data
        this.hrs = hrs;
        this.charges = charges;
    }

    // Getter → read hours
    public float getHrs() {
        return hrs;
    }

    // Setter → modify hours
    public void setHrs(float hrs) {
        this.hrs = hrs;
    }

    // Getter → read charges
    public double getCharges() {
        return charges;
    }

    // Setter → modify charges
    public void setCharges(double charges) {
        this.charges = charges;
    }

    // Override → extend parent toString()
    @Override
    public String toString() {

        // super → includes Person + Employee data
        return super.toString() + " ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
    }

    // Override abstract method from Employee
    @Override
    public double calculateSal() {

        System.out.println("in contract calculate Charges");

        // salary = hours × charges per hour
        return hrs * charges;
    }
}