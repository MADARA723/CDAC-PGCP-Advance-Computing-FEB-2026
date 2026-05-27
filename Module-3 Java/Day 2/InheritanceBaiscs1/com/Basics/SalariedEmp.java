package com.Basics;

// concrete class → can create object
// extends → inherits Employee → Person
public class SalariedEmp extends Employee {

    // private → encapsulation
    private double sal;    // base salary
    private double bonus;  // bonus amount

    // Default constructor → runs when no values passed
    public SalariedEmp() {
        System.out.println("In default constructor of SalariedEmp");
    }

    // Parameterized constructor → initialize object
    public SalariedEmp(int id, String nm, String m, String dept, String desg, double sal,double bonus) {

        // super → call Employee (and Person) constructor
        super(id, nm, m, dept, desg);

        // initialize salary
        this.sal = sal;

        // bonus = 10% of salary
        this.bonus = sal * 0.10;
    }

    // Getter → read salary
    public double getSal() {
        return sal;
    }

    // Setter → modify salary
    public void setSal(double sal) {
        this.sal = sal;
    }

    // Getter → read bonus
    public double getBonus() {
        return bonus;
    }

    // Setter → modify bonus
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Override → extend parent toString()
    @Override
    public String toString() {

        // super → includes Person + Employee data
        return super.toString() + " SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
    }

    // Override abstract method → runtime polymorphism
    @Override
    public double calculateSal() {

        System.out.println("in SalariedEmp calculateSal");

        // salary logic → base + allowances - deduction + bonus
        return sal + 0.10 * sal + 0.15 * sal - 0.08 * sal + bonus;
    }

    // Method overloading → same method, different parameter
    public double calculateBonus(float perc) {

        // dynamic bonus calculation
        bonus = sal * perc;
        return bonus;
    }
}