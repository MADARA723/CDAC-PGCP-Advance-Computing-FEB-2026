package com.demo.MySpringBoot.Product;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	private int pid;
	private String name;
	private int qty;
	private double price;
	@DateTimeFormat (pattern="yyyy-MM-dd")
	private LocalDate mfgdate;
	
	private int cid;

	public Product() {
		super();
	}

	public Product(int pid, String name, int qty, double price, LocalDate mfgdate, int cid) {
		super();
		this.pid = pid;
		this.name = name;
		this.qty = qty;
		this.price = price;
		this.mfgdate = mfgdate;
		this.cid = cid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getMfgdate() {
		return mfgdate;
	}

	public void setMfgdate(LocalDate mfgdate) {
		this.mfgdate = mfgdate;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", qty=" + qty + ", price=" + price + ", mfgdate=" + mfgdate
				+ ", cid=" + cid + "]";
	}

	
	
}
