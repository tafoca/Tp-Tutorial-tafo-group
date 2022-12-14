package com.example.demo2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue
	Long id;
	@Column(length = 70)
	String designation;
	double price;
	int quantity;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String designation, double price, int quantity) {
		super();
		this.designation = designation;
		this.price = price;
		this.quantity = quantity;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", designation=" + designation + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}
	
	
	
	

}
