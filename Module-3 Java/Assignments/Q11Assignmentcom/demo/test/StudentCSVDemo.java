package Q11Assignmentcom.demo.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Q11Assignmentcom.demo.student.Student;

public class StudentCSVDemo {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Student Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit & Save CSV");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student ID : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Degree : ");
                    String degree = sc.nextLine();

                    System.out.print("Enter Email : ");
                    String email = sc.nextLine();

                    Student s = new Student(id, name, degree, email);
                    studentList.add(s);

                    System.out.println("Student Added Successfully.");
                    break;

                case 2:
                    System.out.println("\nStudent Records");
                    for (Student st : studentList) {
                        System.out.println(st);
                    }
                    break;

                case 3:
                    saveToCSV(studentList);
                    System.out.println("Data Saved Successfully.");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }

    private static void saveToCSV(ArrayList<Student> studentList) {

        try (FileWriter fw = new FileWriter("students.csv")) {

            fw.write("StudentID,Name,Degree,Email\n");

            for (Student s : studentList) {
                fw.write(s.toCSV() + "\n");
            }

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}