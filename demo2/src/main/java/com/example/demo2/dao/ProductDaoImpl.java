package com.example.demo2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo2.entities.Product;

@Repository
@Transactional
public class ProductDaoImpl  implements EntityRepository<Product>{
	@PersistenceContext
	private EntityManager em;
	

	@Override
	public Product save(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByDesignation(String desig) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
