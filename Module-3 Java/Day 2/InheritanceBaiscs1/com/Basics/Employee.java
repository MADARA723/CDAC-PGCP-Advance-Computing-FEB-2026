package com.Basics;

// abstract class → cannot create object, used for inheritance
public abstract class Employee extends Person {

    // private → encapsulation (data hiding)
    private String dept;   // department
    private String desg;   // designation

    // Default constructor
    public Employee() {
        // called when no parameters passed
        System.out.println("in Employee default constructor");
    }

    // Parameterized constructor
    public Employee(int id, String nm, String m, String dept, String desg) {

        // super → calls parent (Person) constructor
        super(id, nm, m);

        System.out.println("in Employee parametrised constructor");

        // initialize child class variables
        this.dept = dept;
        this.desg = desg;
    }

    // Getter → read dept
    public String getDept() {
        return dept;
    }

    // abstract method → must be implemented in child class
    abstract public double calculateSal();
    
    
    // Setter → modify dept
    public void setDept(String dept) {
        this.dept = dept;
    }

    // Getter → read designation
    public String getDesg() {
        return desg;
    }

    // Setter → modify designation
    public void setDesg(String desg) {
        this.desg = desg;
    }


    // method overriding → extending parent toString()
    @Override
    public String toString() {

        // super.toString() → get Person data
        return super.toString() + " Employee [dept=" + dept + ", desg=" + desg + "]";
    }
}