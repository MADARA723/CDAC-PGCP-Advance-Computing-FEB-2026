package com.Basics;

// Class → blueprint for creating objects
public class Person {

    // private → data hiding (Encapsulation)
    private int sid;        // id
    private String pname;   // name
    private String mob;     // mobile

    // Default constructor → runs when no values passed
    public Person() {
        System.out.println("Default constructor");
    }

    // Parameterized constructor → initialize object
    public Person(int sid, String pname, String mob) {

        // this → refers to current object variables
        this.sid = sid;       
        this.pname = pname;
        this.mob = mob;
    }

    // Getter → read data
    public int getSid() {
        return sid;
    }

    // Setter → modify data (can add validation)
    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    // Override → change default Object class behavior
    @Override
    public String toString() {

        // object → readable string
        return "Person [sid=" + sid + ", pname=" + pname + ", mob=" + mob + "]";
    }
}													