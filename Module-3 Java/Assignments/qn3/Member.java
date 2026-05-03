package com.java.Assignment_01.qn3;

public class Member extends Person{
	
	private String typeOfMember;
	private float amountPaid;
	
	private static int counter=5000;
	
	public String getTypeOfMember() {
		return typeOfMember;
	}
	public void setTypeOfMember(String typeOfMember) {
		this.typeOfMember = typeOfMember;
	}
	public float getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Member.counter = counter;
	}
	public Member()
	{
		super();
	}
	public Member(String name, String mobno, String emailId, String typeOfMember, float amountPaid) {
		super(name, mobno, emailId, ++counter);
		this.typeOfMember = typeOfMember;
		this.amountPaid = amountPaid;
	}
	
	

}
