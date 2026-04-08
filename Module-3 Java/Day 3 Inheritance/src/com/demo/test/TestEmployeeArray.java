package com.demo.test;

import java.util.Scanner;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

public class TestEmployeeArray {
	
	public static void main(String[] args)
	{
		int choice =0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("\n 1. add new Employee \n 2. delete Employee \n 3.Search Employee \n 4. Update Employee Salary");
			System.out.println("5. display All \n 6.display by Name \n 7. Calculate net Salary 	\n 8. exit \n choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
	    	  case 1->
			  {
				System.out.println("\n 1.SalariedEmp \n 2.ContractEmp \n 3.Vendor");
			    int ch=sc.nextInt();
			    boolean status=EmployeeService.addNewEmployee(ch);
			    if (status)
			    {
			    	System.out.println("Employee Added Successfully");
			    }
			    else
			    {
			    	System.out.println("Employee not added");
			    }
			
			  }
	    	  case 2->{
	    		  System.out.println("Enter the id");
				    int id=sc.nextInt();
				    boolean status=EmployeeService.deleteById(id);
				    if (status)
				    {
				    	System.out.println("Employee Added Successfully");
				    }
				    else
				    {
				    	System.out.println("Employee not found");
				    }
	    		  
	    	  }
	    	  case 3->{
	    		  System.out.println("Enter the id");
				    int id=sc.nextInt();
				    Employee e=EmployeeService.findById(id);
				    if (e!=null)
				    {
				    	System.out.println("Employee deleted Successfully");
				    }
				    else
				    {
				    	System.out.println("Employee not found");
				    }
	    		  
	    	  }
	    	  case 4->{
	    		  System.out.println("Enter the id");
	    		  int id=sc.nextInt();
	    		  System.out.println("Enter the updated salary");
	    		  double sal=sc.nextDouble();
				    boolean status =EmployeeService.updateById(id,sal);
				    if (status)
				    {
				    	System.out.println("Employee Added Successfully");
				    }
				    else
				    {
				    	System.out.println("Employee not found");
				    }
	    		  
	    	  }
	    	  case 5->{
	    		  Employee [] emparr=EmployeeService.getAll();
	    		  for(Employee e:emparr)
	    		  {
	    			  if(e!=null) 
	    			  {
	    			  System.out.println(e);
	    			  }
	    			  else
	    			  {
	    				  break;
	    			  }
	    		  }
	    		  
	    		  
	    	  }
	    	  case 6->{
	    		  System.out.println("Enter the name");
	    		  String name=sc.next();
	    		  Employee [] arr=EmployeeService.findByName(name);
	    		  if(arr!=null)
	    		  {
	    			  for(Employee e:arr)
	    			  {
	    				  if(e!=null)
	    				  {
	    					  System.out.println(e);
	    				  }else
	    				  {
	    					  break;
	    				  }
	    				  
	    			  }
	    		  }
	    		  else {
	    			  System.out.println("name not found");
	    		  }
	    		  
	    	  }
              case 7->{
            	  System.out.println("Enter the id");
	    		  int id=sc.nextInt();
	    		  double netsal=EmployeeService.findNetSalary(id);
	    		  if(netsal!=-1)
	    		  {
	    			  System.out.println("Net Salary for "+id+":"+netsal);
	    		  }else
	    		  {
	    			  System.out.println("Employee not found");
	    		  }
	    		  
	    	  }
			
			}
			
		}while(choice!=8);
	}

}
