package Assignment1;

import java.util.Scanner;

class Student {
    int studId;
    String name;
    int m1, m2, m3;

    // Method to accept data
    void acceptData(Scanner sc) {
        System.out.print("Enter Student ID: ");
        studId = sc.nextInt();

        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter M1: ");
        m1 = sc.nextInt();

        System.out.print("Enter M2: ");
        m2 = sc.nextInt();

        System.out.print("Enter M3: ");
        m3 = sc.nextInt();
    }

    // Method to display data
    void display() {
        System.out.println("\nStudent Details:");
        System.out.println("____________");
        System.out.println("Student Id: " + studId);
        System.out.println("Name: " + name);
        System.out.println("M1: " + m1);
        System.out.println("M2: " + m2);
        System.out.println("M3: " + m3);
    }
}

public class StudentInfo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[2]; // array for 2 students

        
        for (int i = 0; i < 2; i++) {
            s[i] = new Student();
            System.out.println("\nEnter details for Student " + (i + 1));
            s[i].acceptData(sc);
        }

        // Display data
        for (int i = 0; i < 2; i++) {
            s[i].display();
        }

        sc.close();
    }
}