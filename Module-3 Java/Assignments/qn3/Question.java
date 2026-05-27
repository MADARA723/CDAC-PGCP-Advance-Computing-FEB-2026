package com.java.Assignment_01.qn3;

public class Question {

    private int qno;
    private String question;
    private String opt1, opt2, opt3, opt4;
    private int ans;
    private int marks;

    public Question(int qno, String question,
                    String opt1, String opt2, String opt3, String opt4,
                    int ans, int marks) {
        this.qno = qno;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
        this.marks = marks;
    }

    public int getAns() { 
        return ans;
         }
    public int getMarks() { 
        return marks;
         }

    public void display() {
        System.out.println(qno + ". " + question);
        System.out.println("1. " + opt1);
        System.out.println("2. " + opt2);
        System.out.println("3. " + opt3);
        System.out.println("4. " + opt4);
    }
}