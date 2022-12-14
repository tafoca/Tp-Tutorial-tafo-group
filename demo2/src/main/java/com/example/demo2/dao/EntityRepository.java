package com.example.demo2.dao;

import java.util.List;

import com.example.demo2.entities.Product;

public interface EntityRepository<T>{
	public T save(Product p);
	public List<T> findAll();
	public List<T> findByDesignation(String desig);
	public T findOne(Long id);
	public T update(T p);
	public void delete(Long id);
}
