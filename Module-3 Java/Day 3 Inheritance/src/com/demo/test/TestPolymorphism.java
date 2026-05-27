package com.demo.test;

import java.util.Scanner;

import com.demo.model.ContractEmp;
import com.demo.model.Employee;
import com.demo.model.SalariedEmp;

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n 1.Salaried \n 2.Contract \n Vendor \n choice : \n ");
        int choice =sc.nextInt();
        Employee e=null;
        switch(choice)
        {
        case 1->
        {
        	e=new SalariedEmp(12,"Xxxm","44444","hr","mgr",454656);
        	System.out.println(((SalariedEmp)e).calculateBonus(0.3f));
        
        }
        case 2->
        {
        	e=new ContractEmp(13,"ettert","5555","hrs","mgr",87,3453);
        	
        }
        case 3->
        {
        	
        }
        case 4->
        {
        	sc.close();
        	System.out.println("Tahnks for Visiting..............................");
        	
        }
        default->
        {
        	System.out.println("Invalid  choice");
        	
        	
        }
        }
        System.out.println(e.calculateSal());
	}

}
