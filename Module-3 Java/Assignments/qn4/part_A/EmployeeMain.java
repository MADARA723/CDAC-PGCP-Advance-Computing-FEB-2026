package com.java.Assignment_01.qn4.part_A;

import java.util.*;

public class EmployeeMain {

    public static void main(String[] args) {

        HashSet<Employee> set = new HashSet<>();

        set.add(new Employee(1, "A", 20000, "IT", "Dev"));
        set.add(new Employee(2, "B", 30000, "HR", "Mgr"));
        set.add(new Employee(1, "C", 40000, "IT", "Lead"));

        System.out.println("HashSet:");
        for (Employee e : set) {
            System.out.println(e);
        }

        TreeMap<Integer, Employee> map = new TreeMap<>();

        for (Employee e : set) {
            map.put(e.getId(), e);
        }

        System.out.println("\nTreeMap:");
        for (Employee e : map.values()) {
            System.out.println(e);
        }
    }
}