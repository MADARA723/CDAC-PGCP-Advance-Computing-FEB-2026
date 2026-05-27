package com.demo.model;

public class ContractEmp extends Employee{
	private float hrs;
	private double charges;
	

	public ContractEmp() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("In the default constrcutor of ContractEmp");
	}


	public ContractEmp(int id, String name, String mob, String dept, String desg,float hrs,double charges) {
		super(id, name, mob, dept, desg);
		// TODO Auto-generated constructor stub
		this.hrs=hrs;
		this.charges=charges;
		
	}

	public float getHrs() {
		return hrs;
	}


	public void setHrs(float hrs) {
		this.hrs = hrs;
	}


	public double getCharges() {
		return charges;
	}


	public void setCharges(double charges) {
		this.charges = charges;
	}
	


	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", charges=" + charges + "]";
	}


	@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		System.out.println("in contract emp");
		return hrs*charges;
	}

}
