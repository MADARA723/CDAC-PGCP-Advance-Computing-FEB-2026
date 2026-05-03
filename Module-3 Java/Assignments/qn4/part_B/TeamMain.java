package com.java.Assignment_01.qn4.part_B;

import java.util.*;

public class TeamMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Team> teams = new ArrayList<>();

        while (true) {
            System.out.println("1.Add Team 2.Delete Team 3.Delete Player 4.Display Batsman");
            System.out.println("5.Display by speciality 6.Add Player 7.Modify Coach 8.Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    teams.add(new Team(sc.nextInt(), sc.next(), sc.next()));
                    break;

                case 2:
                    int tid = sc.nextInt();
                    teams.removeIf(t -> t.getTid() == tid);
                    break;

                case 3:
                    tid = sc.nextInt();
                    int pid = sc.nextInt();
                    for (Team t : teams) {
                        if (t.getTid() == tid) t.removePlayer(pid);
                    }
                    break;

                case 4:
                    for (Team t : teams) t.displayBatsman();
                    break;

                case 5:
                    String sp = sc.next();
                    for (Team t : teams) t.displayBySpeciality(sp);
                    break;

                case 6:
                    tid = sc.nextInt();
                    Player p = new Player(sc.nextInt(), sc.next(), sc.next());
                    for (Team t : teams) {
                        if (t.getTid() == tid) t.addPlayer(p);
                    }
                    break;

                case 7:
                    tid = sc.nextInt();
                    String coach = sc.next();
                    for (Team t : teams) {
                        if (t.getTid() == tid) t.setCoach(coach);
                    }
                    break;

                case 8:
                    return;
            }
        }
    }
}