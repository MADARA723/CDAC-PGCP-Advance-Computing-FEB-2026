package com.java.Assignment_01.qn4.part_B;

import java.util.*;

public class Team {

    private int tid;
    private String tname;
    private String coach;
    private List<Player> players = new ArrayList<>();

    public Team(int tid, String tname, String coach) {
        this.tid = tid;
        this.tname = tname;
        this.coach = coach;
    }

    public int getTid() { return tid; }
    public List<Player> getPlayers() { return players; }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void removePlayer(int pid) {
        players.removeIf(p -> p.getPid() == pid);
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    public void displayBatsman() {
        for (Player p : players) {
            if (p.getSpeciality().equalsIgnoreCase("batsman")) {
                System.out.println(p);
            }
        }
    }

    public void displayBySpeciality(String s) {
        for (Player p : players) {
            if (p.getSpeciality().equalsIgnoreCase(s)) {
                System.out.println(p);
            }
        }
    }
}