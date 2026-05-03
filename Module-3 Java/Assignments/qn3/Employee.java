package com.java.Assignment_01.qn3;

public abstract class  Employee extends Person {
	
	private static int counter=1000;
	private String dateOfJoining;
	private String department;
	private String designation;
	
	private double totalSalary=0;
	
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public  void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	public double getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	
	public abstract void setTotalSalary();
	public abstract void display();
	
	public Employee(String name, String mobno, String emailId,String dateOfJoining, String department,
			String designation) {
		super(name, mobno, emailId, ++counter);
		this.dateOfJoining = dateOfJoining;
		this.department = department;
		this.designation = designation;
	}
	public Employee()
	{
		super();
	}
	
}
