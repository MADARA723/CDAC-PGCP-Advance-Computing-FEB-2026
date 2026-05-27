package com.java.Assignment_01.qn4.part_B;

import java.util.*;

public class StudentMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<Student, List<String>> map = new HashMap<>();

        while (true) {
            System.out.println("1.Add Student \n2.Add Skill \n3.Delete Student");
            System.out.println("4.Delete Skill \n5.Display by Skill \n6.Display by Degree \n7.Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Student s = new Student(sc.nextInt(), sc.next(), sc.next());
                    map.put(s, new ArrayList<>());
                    break;

                case 2:
                    int id = sc.nextInt();
                    String skill = sc.next();
                    for (Student st : map.keySet()) {
                        if (st.getSid() == id) {
                            map.get(st).add(skill);
                        }
                    }
                    break;

                case 3:
                    id = sc.nextInt();
                    map.keySet().removeIf(st -> st.getSid() == id);
                    break;

                case 4:
                    id = sc.nextInt();
                    skill = sc.next();
                    for (Student st : map.keySet()) {
                        if (st.getSid() == id) {
                            map.get(st).remove(skill);
                        }
                    }
                    break;

                case 5:
                    skill = sc.next();
                    for (Student st : map.keySet()) {
                        if (map.get(st).contains(skill)) {
                            System.out.println(st);
                        }
                    }
                    break;

                case 6:
                    String deg = sc.next();
                    for (Student st : map.keySet()) {
                        if (st.getDegree().equalsIgnoreCase(deg)) {
                            System.out.println(st);
                        }
                    }
                    break;

                case 7:
                    return;
            }
        }
    }
}