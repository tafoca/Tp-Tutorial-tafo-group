package com.example.demo2.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
		em.persist(p);
		return p;
	}

	@Override
	public List<Product> findAll() {
		Query req = em.createQuery("select p from Product p");
		return req.getResultList();
	}

	@Override
	public List<Product> findByDesignation(String desig) {
		Query req = em.createQuery("select p from Product p where p.designation like :x");
		em.setProperty("x", desig);
		return req.getResultList();
	}

	@Override
	public Product findOne(Long id) {
		Product p = em.find(Product.class, id);
		return p;
	}

	@Override
	public Product update(Product p) {
		em.merge(p);
		return p;
	}

	@Override
	public void delete(Long id) {
		Product p = em.find(Product.class, id);
		em.remove(p);
	}

}
