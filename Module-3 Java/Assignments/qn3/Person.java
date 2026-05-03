package com.java.Assignment_01.qn3;

public class Person {
	
	
	private String name,mobno,emailId;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Person(String name, String mobno, String emailId, int id) {
		super();
		this.name = name;
		this.mobno = mobno;
		this.emailId = emailId;
		this.id = id;
	}

	public Person()
	{
		super();
	}
	
	

}
