package com.java.Assignment_01.qn4.part_B;

public class Player {

    private int pid;
    private String name;
    private String speciality;

    public Player(int pid, String name, String speciality) {
        this.pid = pid;
        this.name = name;
        this.speciality = speciality;
    }

    public int getPid() { return pid; }
    public String getSpeciality() { return speciality; }

    @Override
    public String toString() {
        return pid + " " + name + " " + speciality;
    }
}