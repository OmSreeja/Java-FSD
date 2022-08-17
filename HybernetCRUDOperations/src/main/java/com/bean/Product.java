package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;
	private String ppname;
	private int pprice;
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", ppname=" + ppname + ", pprice=" + pprice + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPpname() {
		return ppname;
	}

	public void setPpname(String ppname) {
		this.ppname = ppname;
	}

	public int getPprice() {
		return pprice;
	}

	public void setPprice(int pprice) {
		this.pprice = pprice;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
