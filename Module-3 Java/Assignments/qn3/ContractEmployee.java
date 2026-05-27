package com.java.Assignment_01.qn3;

public class ContractEmployee extends Employee{
	
	
	private int noOfHrsWorked;
	private float perHrRate;
	public int getNoOfHrsWorked() {
		return noOfHrsWorked;
	}
	
	public void setNoOfHrsWorked(int noOfHrsWorked) {
		this.noOfHrsWorked = noOfHrsWorked;
		setTotalSalary();
	}
	
	public float getPerHrRate() {
		return perHrRate;
	}
	
	public void setPerHrRate(float perHrRate) {
		this.perHrRate = perHrRate;
		setTotalSalary();
	}
	
	public ContractEmployee(String name, String mobno, String emailId, String dateOfJoining, String department,
			String designation, int noOfHrsWorked, float perHrRate) {
		
		super(name, mobno, emailId,dateOfJoining, department, designation);
		this.noOfHrsWorked = noOfHrsWorked;
		this.perHrRate = perHrRate;
		setTotalSalary();
	}
	public ContractEmployee()
	{
		super();
	}
	
	@Override
	public void setTotalSalary() {
		double totalSalary = this.noOfHrsWorked*this.perHrRate;
		
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
		System.out.println("Hrs Worked :- "+this.getNoOfHrsWorked());
		System.out.println("Rate Per Hr :- "+this.getPerHrRate());
		System.out.println("Salary :- "+this.getTotalSalary());
	}
	
	
	
}
