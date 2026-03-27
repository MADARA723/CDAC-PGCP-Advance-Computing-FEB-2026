import java.util.Scanner;

class Addnumbers2
{
   public static void main(String [] args)
         {
            Scanner sc=new Scanner(System.in);//waits for keyboard to take an element 
            System.out.println("Enter the Number");
            int a=sc.nextInt();//Input variable
            System.out.println("Enter the Number");
            int b=sc.nextInt();
            System.out.println("Enter the String");
            String s=sc.next();
//Should have to add dummy nextLine after next() because it
//will not wait fir next input statement
             
            String dummy=sc.nextLine();
           //Strring always reads data  till spaces
        System.out.println("Enter the address");
String addr=sc.nextLine();//String accept with spaces
System.out.println("NAme : "+ s + "Address : "+ addr);

        }
}


