package com.java.Assignment_01.qn3;

import java.util.Scanner;

public class Exam {

    private int examId;
    private String name;
    private String topic;
    private String date;
    private Question[] questions;

    public Exam(int examId, String name, String topic, String date, Question[] questions) {
        this.examId = examId;
        this.name = name;
        this.topic = topic;
        this.date = date;
        this.questions = questions;
    }

    public int conductExam() {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (Question q : questions) {
            q.display();
            System.out.print("Enter your answer: ");
            int userAns = sc.nextInt();

            if (userAns == q.getAns()) {
                score += q.getMarks();
            }
        }
        return score;
    }

    public String getName() {
        return name;
    }
}