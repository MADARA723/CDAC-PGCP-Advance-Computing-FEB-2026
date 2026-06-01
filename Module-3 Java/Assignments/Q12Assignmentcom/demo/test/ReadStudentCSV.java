package Q12Assignmentcom.demo.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import Q12Assignmentcom.demo.student.Student;

public class ReadStudentCSV {

    public static void main(String[] args) {

        ArrayList<Student> studentList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("students.csv"))) {

            String line;

            // Skip Header Line
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] data = line.split(",");

                int studId = Integer.parseInt(data[0]);
                String name = data[1];
                String degree = data[2];
                String email = data[3];

                Student student =
                        new Student(studId, name, degree, email);

                studentList.add(student);
            }

        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }

        System.out.println("\n===== Student Records =====");

        for (Student s : studentList) {
            System.out.println(s);
        }
    }
} 