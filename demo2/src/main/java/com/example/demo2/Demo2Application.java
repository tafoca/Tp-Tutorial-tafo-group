package com.example.demo2;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo2.dao.EntityRepository;
import com.example.demo2.entities.Product;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Demo2Application.class, args);
		EntityRepository<Product> produitDao = ctx.getBean(EntityRepository.class);
		produitDao.save(new Product("Prod xd1", 2500, 8));
		produitDao.save(new Product("Prod xd2", 200, 18));
		produitDao.save(new Product("Prod xd3", 5000, 6));
		
		List<Product> products = produitDao.findAll() ;
		for (Product p : products) {
			System.out.println(p);
		}


	}
	

}
