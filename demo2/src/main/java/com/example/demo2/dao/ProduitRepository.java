package com.example.demo2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo2.entities.Product;
/**
 * Generated dao with spring data module
 * not need create class , spring inject automaticaliccly implementation interface
 * @author fotso
 *
 */
public interface ProduitRepository extends JpaRepository<Product, Long> {
@Query("select p from Product p where p.designation like :x")
 public List<Product> productByMC(@Param("x") String desig);
 
}
