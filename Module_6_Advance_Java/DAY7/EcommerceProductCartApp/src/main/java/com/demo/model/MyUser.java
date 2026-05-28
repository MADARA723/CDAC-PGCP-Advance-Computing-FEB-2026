package com.demo.model;

public class MyUser {
	private String uname;
	private String psswd;
	
	private String role;

	public MyUser() {
		super();
	}

	public MyUser(String uname, String psswd, String role) {
		super();
		this.uname = uname;
		this.psswd = psswd;
		this.role = role;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPsswd() {
		return psswd;
	}

	public void setPsswd(String psswd) {
		this.psswd = psswd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "MyUser [uname=" + uname + ", psswd=" + psswd + ", role=" + role + "]";
	}
	
	

}
