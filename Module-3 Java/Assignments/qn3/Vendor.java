package com.java.Assignment_01.qn3;

public class Vendor extends Employee{

	private int noOfEmployee;
	private float amount;
	public int getNoOfEmployee() {
		return noOfEmployee;
	}
	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
		setTotalSalary();
		
	}
	
	public Vendor()
	{
		super();
	}
	public Vendor(String name, String mobno, String emailId,String dateOfJoining, String department,
			String designation, int noOfEmployee, float amount) {
		super(name, mobno, emailId, dateOfJoining, department, designation);
		this.noOfEmployee = noOfEmployee;
		this.amount = amount;
		setTotalSalary();	
	}
	
	@Override
	public void setTotalSalary() {
		double totalSalary = (amount * noOfEmployee) + (amount * 0.18);

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
		System.out.println("No. Of Employees :- "+this.getNoOfEmployee());
		System.out.println("Amount :- "+this.getAmount());
		System.out.println("Salary :- "+this.getTotalSalary());
	}
}
