package com.demo.service;

import java.util.Scanner;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class EmployeeService {
	static Employee[] emparr;
	static int count;
	static {
		emparr=new Employee[100];
		emparr[0]=new SalariedEmp(12,"xxxx","4444","hr","mgr",45678);
		emparr[1]=new ContractEmp(12,"yyyy","5555","hr","mgr",45,4523);
		count=2;
	}
	public static boolean addNewEmployee(int ch)
	{
	       Scanner sc=new Scanner(System.in);
	       if(count<emparr.length)
	       {
	    	   System.out.println("Enter the id");
	    	   int id=sc.nextInt();
	    	   System.out.println("Enter the name");
	    	   String name=sc.next();
	    	   System.out.println("Enter the mobile no");
	    	   String mob=sc.next();
	    	   System.out.println("Enter the  dept");
	    	   String dept=sc.next();
	    	   System.out.println("Enter the desg");
	    	   String desg=sc.next();
	    	   if(ch==1)
	    	   {
	    		   System.out.println("Enter sal");
	    		   double sal=sc.nextDouble();
	    		   
	    		   emparr[count]=new SalariedEmp(id,name,mob,dept,desg,sal);
	    		   
	    	   }else if(ch==2){
	    		   System.out.println("enter hrs");
	    		   float hrs=sc.nextFloat();
	    		   System.out.println("Enter charges");
	    		   double charges=sc.nextDouble();
	    		   emparr[count]=new ContractEmp(id,name,mob,dept,desg,hrs,charges);
	    		   
	    	   }else if(ch==3) {
	    		   //vendor
	    	   }
	    	   count++;
	    	   return true;
	       }
	   return false;
		
	}
   public static Employee[] getAll() {
	   return emparr;
   }
   public static Employee findById(int id)
   {
	  int pos=searchById(id);
	  if(pos!=-1)
	  {
		  return emparr[pos];
	  }
	  return null;
   }
   private static int searchById(int id) {
	// TODO Auto-generated method stub
	   for(int i=0;i<count;i++)
	   {
		   if(emparr[i].getId()==id)
		   {
			   return i;
		   }
	   }
	return -1;
   }
   public static Employee[] findByName(String nm)
   {
	   Employee[] arr=new Employee[count];
	   int cnt=0;
	   for(int i=0;i<count;i++)
	   {
		   if(emparr[i].getName().equals(nm))
		   {
			   arr[cnt]=emparr[i];
			   cnt++;
		   }
		   
	   }
	   if(cnt>0)
	   {
		   return arr;
	   }
	   return null;
   }
  public static  boolean updateById(int id,double sal)
  {
	  Employee e=findById(id);
	  if(e!=null) {
		  if(e instanceof SalariedEmp)
		  {
			  ((SalariedEmp)e).setSal(sal);
		  }else if(e instanceof ContractEmp)
		  {
			  ((ContractEmp)e).setCharges(sal);
		  }
		  return true;
	  }
	  return false;
  }
  public static double findNetSalary(int id)
  {
	  Employee e=findById(id);
		if(e!=null)
		{
			return e.calculateSal();
		}
		 return -1; 
			  
  }
  public static boolean deleteById(int id)
  {
	  int pos=searchById(id);
	  if(pos!=-1)
	  {
		  for(int i=pos;i<count;i++)
		  {
			  emparr[i]=emparr[i+1];
			  
		  }
		  count--;
		  return true;
		  
	  }
	  return false;
  }
}
