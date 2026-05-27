package com.java.Assignment_01.qn3;

public class SalariedEmployee extends Employee{
	
	
	double basicSalary=0;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
		setTotalSalary();
		
	}

	
	public SalariedEmployee(String name, String mobno, String emailId, String dateOfJoining, String department,
			String designation, double basicSalary) {
		super(name, mobno, emailId, dateOfJoining, department, designation);
		setBasicSalary(basicSalary);
	}

	public SalariedEmployee()
	{
		super();
	}
	
	@Override
	public void setTotalSalary() {
	    
	    double da = basicSalary * 0.10;
	    double hra = basicSalary * 0.15;
	    double pf = basicSalary * 0.12;

	    double totalSalary = basicSalary + da + hra - pf;

	    super.setTotalSalary(totalSalary);
	    
	}

	@Override
	public void display()
	{
		System.out.println("ID :- "+this.getId());
		System.out.println("Name :- "+this.getName());
		System.out.println("Email ID :- "+this.getEmailId());
		System.out.println("Mobile No. :- "+this.getMobno());
		System.out.println("Date Of Joining :- "+this.getDateOfJoining());
		System.out.println("Department "+this.getDepartment());
		System.out.println("Designation :- "+this.getDesignation());
		System.out.println("Hrs Worked :- "+this.getBasicSalary());
		System.out.println("Salary :- "+this.getTotalSalary());
	}
	
	
}
