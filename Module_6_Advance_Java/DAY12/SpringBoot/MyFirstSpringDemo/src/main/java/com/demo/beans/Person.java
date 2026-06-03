package com.demo.beans;

public class Person {
	private String pid;
	private String pname;
	private Address addr;
	public Person() {
		super();
	}
	public Person(String pid, String pname, Address addr) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.addr = addr;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", addr=" + addr + "]";
	}
	

}
