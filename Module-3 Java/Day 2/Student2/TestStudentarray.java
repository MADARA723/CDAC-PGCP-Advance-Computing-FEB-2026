package Student2;

import Student1.Student;

public class TestStudentarray{
public static void main(String[] args) {
	Student[] sarr=new Student[5];
	StudentService.addNewStudent(sarr);
	StudentService.Displayall(sarr);
}
}