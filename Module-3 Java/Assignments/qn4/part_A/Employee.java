package com.java.Assignment_01.qn4.part_A;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private double sal;
    private String dept;
    private String designation;

    public Employee(int id, String name, double sal, String dept, String designation) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
        this.designation = designation;
    }

    public int getId() { return id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        return id == e.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sal + " " + dept + " " + designation;
    }
}