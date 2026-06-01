package Q11Assignmentcom.demo.student;

public class Student {
    private int studId;
    private String name;
    private String degree;
    private String email;

    public Student(int studId, String name, String degree, String email) {
        this.studId = studId;
        this.name = name;
        this.degree = degree;
        this.email = email;
    }

    public int getStudId() {
        return studId;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return degree;
    }

    public String getEmail() {
        return email;
    }

    public String toCSV() {
        return studId + "," + name + "," + degree + "," + email;
    }

    @Override
    public String toString() {
        return "Student [studId=" + studId +
               ", name=" + name +
               ", degree=" + degree +
               ", email=" + email + "]";
    }
}