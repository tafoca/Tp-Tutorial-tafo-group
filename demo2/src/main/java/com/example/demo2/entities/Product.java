package com.example.demo2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue
	Long id;
	@Column(length = 70)
	String designation;
	double price;
	int quantity;
	@ManyToOne
	@JoinColumn(name = "ID_CAT")
	Category catagory;
	
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
	
	
	public Product(String designation, double price, int quantity, Category catagory) {
		super();
		this.designation = designation;
		this.price = price;
		this.quantity = quantity;
		this.catagory = catagory;
	}
	public Category getCatagory() {
		return catagory;
	}
	public void setCatagory(Category catagory) {
		this.catagory = catagory;
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
