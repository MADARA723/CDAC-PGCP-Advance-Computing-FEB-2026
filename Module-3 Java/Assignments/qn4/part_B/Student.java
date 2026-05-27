package com.java.Assignment_01.qn4.part_B;

import java.util.Objects;

public class Student {

    private int sid;
    private String name;
    private String degree;

    public Student(int sid, String name, String degree) {
        this.sid = sid;
        this.name = name;
        this.degree = degree;
    }

    public int getSid() { return sid; }
    public String getDegree() { return degree; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        return sid == ((Student) o).sid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid);
    }

    @Override
    public String toString() {
        return sid + " " + name + " " + degree;
    }
}