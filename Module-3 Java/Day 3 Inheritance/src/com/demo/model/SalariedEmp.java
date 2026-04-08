package com.demo.model;

public class SalariedEmp extends Employee {
	
	private double sal;
	private double bonus;
	public SalariedEmp()
	{
		System.out.println("in default constrcutor of Salaried Emp");
	}

	public SalariedEmp(int id,String name,String mob,String dept ,String desg,double sal ) { 
		super(id,name,mob,dept,desg);
		this.sal = sal;
		this.bonus = bonus;
	}


	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	

	@Override
	public String toString() {
		return super.toString()+"SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}

	@Override
	public double calculateSal() {
		// TODO Auto-generated method stub
		System.out.println("In Salariedemp calculatesal");
		return sal+0.10*sal+0.15-0.08*sal+bonus;
	}
	
	public double calculateBonus(float perc)
	{
		bonus=sal*perc;
		return bonus;
		
	}

}
