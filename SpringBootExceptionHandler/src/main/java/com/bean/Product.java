package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int id;
	private String ppname;
	private float pprice;
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
	public float getPprice() {
		return pprice;
	}
	public void setPprice(float pprice) {
		this.pprice = pprice;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", ppname=" + ppname + ", pprice=" + pprice + "]";
	}
	

}
