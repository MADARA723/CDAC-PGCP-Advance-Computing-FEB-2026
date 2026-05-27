package Assignment1;

import java.util.Scanner;
//3. Write a menu driven program to maintain student information. Modify Student class created in previous assignment. 
//Add a member gpa in student class, add a function in student class to return GPA of a student
//calculateGPA()
//gpa=(1/3)*m1+(1/2)*m2+(1/4)*m3
//Create an array to store Multiple students.
//1. Display All Student
//2. Search by id
//3. Search by name
//4. calculate GPA of a student
//5. Exit

  

class Student1 {
	 int studId;
	    String name;
	    int m1, m2, m3;
	    float gpa;

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
	        System.out.println("GPA: "+calculateGPA());
	    }
	    float calculateGPA()
	    {
	    	return gpa=(1f/3)*m1+(1f/2)*m2+(1f/4)*m3;
	    }
	    
	}
	
   public class StudentInfo3{

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Student1[] s = new Student1[2]; // array for 2 students
                
	        int choice;
	        do {
	        	System.out.println("\n1. Accept Student Data");
	        	System.out.println("2. Display Stduent Data");
	        	System.out.println("3. Search Student By ID");
	        	System.out.println("4. Search Student by name");
	        	System.out.println("5. calculate GPA of a student ");
	        	System.out.println("6. Exit");
	        	System.out.println("Enter the choice : ");
	        	choice =sc.nextInt();
	        switch(choice)
	        {
	        case 1:
	        
	        
	        for (int i = 0; i < 2; i++) {
	            s[i] = new Student1();
	            System.out.println("\nEnter details for Student " + (i + 1));
	            s[i].acceptData(sc);
	        }
	        break;
	        
	        case 2:
	        // Display data
	        for (int i = 0; i < 2; i++) {
	        	if(s[i]!=null)
	            s[i].display();
	        	else
	        		System.out.println("Data Not available!");
	            
	            }
	        break;
	        
	        
	        	
	        	//Search By ID
	        case 3:
	        	System.out.println("Enter the Id to find");
	        	int id=sc.nextInt();
	        	for(int i=0;i<2;i++) {
	        		if(s[i].studId==id)
	        		s[i].display();
	        	}
	                break;
	        case 4:
	        	System.out.println("Enter ths Name to find Student details");
	        	sc.nextLine();
	        	String name=sc.nextLine();
	        	for(int i=0;i<2;i++) {
	        		if(s[i].name.equalsIgnoreCase(name))
	        		s[i].display();
	        	}
	                break;
	        case 5:
	        	System.out.println("get gpa of students by id");
	        		int idg=sc.nextInt();
	        		for(int i=0;i<2;i++) {
		        		if(s[i].studId==idg)
		        		s[i].calculateGPA();
	        		}
	        case 6:
	        	System.out.println("Exiting Program...........");
	        	break;
	        	
	        
	        default:
	        	System.out.println("Invalid Choice");
	          }
	        }while(choice!=6);
	        sc.close();
	        
	    }
   }