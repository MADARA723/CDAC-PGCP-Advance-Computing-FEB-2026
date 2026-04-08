package com.demo.model;

public abstract class Employee extends Person{
	private String dept;
	private String desg;
	public Employee() {
		super();
		System.out.println("In default construrtor of Employee");
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String mob,String dept,String desg) {
		super(id, name, mob);
		// TODO Auto-generated constructor stub
		System.out.println("In the para constructor of Employee");
		this.dept=dept;
		this.desg=desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	abstract public double calculateSal();
	
	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
	

}
