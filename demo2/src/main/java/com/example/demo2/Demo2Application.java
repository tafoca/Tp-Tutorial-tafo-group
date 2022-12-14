package com.example.demo2;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo2.dao.CategoryRepository;
import com.example.demo2.dao.ProduitRepository;
import com.example.demo2.entities.Category;
import com.example.demo2.entities.Product;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Demo2Application.class, args);
		ProduitRepository produitDao = ctx.getBean(ProduitRepository.class);
		CategoryRepository categoryRepository =  ctx.getBean(CategoryRepository.class);
		Category c1 =  new Category("Computer");
		Category c2 =  new Category("Imprimante");
		Category c3 =  new Category("Software");
		categoryRepository.save(c1);
		categoryRepository.save(c2);
		categoryRepository.save(c3);
		
		produitDao.save(new Product("Prod xd1", 2500, 8,c1));
		produitDao.save(new Product("Prod xd2", 200, 18,c2));
		produitDao.save(new Product("Prod xd3", 5000, 6,c3));
		
		
		
		List<Product> products = produitDao.productByMC("%2%") ;
		for (Product p : products) {
			System.out.println(p);
		}


	}
	

}
