package com.example.demo2.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Category implements Serializable {
@Id
@GeneratedValue
 Long id;
 String myCategory;
 @OneToMany(mappedBy = "catagory", fetch = FetchType.LAZY)
 Collection<Product> products;
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Category(String myCategory) {
	super();
	this.myCategory = myCategory;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getMyCategory() {
	return myCategory;
}
public void setMyCategory(String myCategory) {
	this.myCategory = myCategory;
}
public Collection<Product> getProducts() {
	return products;
}
public void setProducts(Collection<Product> products) {
	this.products = products;
}
@Override
public String toString() {
	return "Catagory [id=" + id + ", myCategory=" + myCategory + "]";
}
 
 
}
