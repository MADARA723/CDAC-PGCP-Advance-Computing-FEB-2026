package com.java.Assignment_01.qn3;

import java.util.Scanner;

public class ExamApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Question[] javaQ = {
            new Question(1, "Java is?", "Language", "OS", "Browser", "DB", 1, 1),
            new Question(2, "JVM stands for?", "Java Virtual Machine", "Java Vendor Machine", "Just Virtual Machine", "None", 1, 1),
            new Question(3, "Keyword to inherit?", "this", "super", "extends", "implements", 3, 1),
            new Question(4, "Java is?", "Platform dependent", "Platform independent", "Both", "None", 2, 1),
            new Question(5, "Main method return type?", "int", "void", "String", "double", 2, 1)
        };

        Question[] htmlQ = {
            new Question(1, "HTML stands for?", "Hyper Text Markup Language", "High Text Machine", "Hyper Tool", "None", 1, 1),
            new Question(2, "Tag for link?", "<a>", "<p>", "<h1>", "<img>", 1, 1),
            new Question(3, "Tag for image?", "<img>", "<div>", "<span>", "<link>", 1, 1),
            new Question(4, "HTML is?", "Programming", "Markup", "OS", "DB", 2, 1),
            new Question(5, "Tag for paragraph?", "<p>", "<h1>", "<br>", "<li>", 1, 1)
        };

        Exam javaExam = new Exam(1, "Java Test", "Java", "10-04-2026", javaQ);
        Exam htmlExam = new Exam(2, "HTML Test", "HTML", "10-04-2026", htmlQ);

        boolean flag = true;

        while (flag) {

            System.out.println("Select Exam:");
            System.out.println("1. Java");
            System.out.println("2. HTML");

            int choice = sc.nextInt();
            int marks = 0;

            if (choice == 1) {
                System.out.println("Starting Java Test...");
                marks = javaExam.conductExam();
            } else if (choice == 2) {
                System.out.println("Starting HTML Test...");
                marks = htmlExam.conductExam();
            } else {
                System.out.println("Invalid choice");
                continue;
            }

            System.out.println("Your Marks: " + marks);

            if (marks >= 3) {
                System.out.println("Congratulations you completed the test");
            } else {
                System.out.println("Better luck next time");
            }

            System.out.println("Do you want to continue? (yes/no)");
            String input = sc.next();

            if (!input.equalsIgnoreCase("yes")) {
                flag = false;
            }
        }
    }
}