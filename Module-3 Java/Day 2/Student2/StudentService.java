package Student2;
import java.text.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
import java.util.stream.Stream;



public class StudentService {
	public static void  addNewStudent(Student[] sarr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<sarr.length;i++)
		{
			System.out.println("Enter the id");
			int sid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Name");
			String nm=sc.nextLine();
			sc.nextLine();
			System.out.println("Enter the Marks1");
			int m1=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Marks2");
			int m2=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Marks3");
			int m3=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Date (dd/MM/yyyy)");
			String dt=sc.next();
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			Date jdt=null;
			try {
				jdt=sdf.parse(dt);
			
			}catch(ParseException e) {
				e.printStackTrace();
				
			}
			sarr[i]=new Student(sid,nm,m1,m2,m3,jdt);
			
			//convert String to java date
		}
		
	}
	public static void Displayall(Student[] sarr) {
		for(Student s:sarr) {
			System.out.println(s);
		}
		//java 1.8
		Stream.of(sarr).forEach(s1->System.out.println(s1));
		Stream.of(sarr).forEach(System.out::println);
	}
	
	
}