package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repository.ProductRepository;

@Component
public class ConsoleRunner implements CommandLineRunner{

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		
		//saving table
		/*repo.save(new Product(8,"AA",8.1));
		repo.save(new Product(9,"BB",7.1));
		repo.save(new Product(10,"CC",6.1));
		repo.save(new Product(11,"DD",5.1));
		repo.save(new Product(12,"EE",4.1));
		repo.save(new Product(13,"FF",3.1));
		repo.save(new Product(14,"GG",2.1));*/
		
		
		//Find all in List Object
		//List<Product> list=repo.findAll();
		//list.forEach(System.out::println);
		
		
		//Find all With Sort
		//repo.findAll(Sort.by(Direction.DESC,"prodCode"))
		//	.forEach(System.out::println);
		
		
		//Find all with Pageable
		//PageRequest p=PageRequest.of(1, 3);
		//repo.findAll(p).forEach(System.out::println);
		
		//Find all with Example
		/*
		Product p=new Product();
		p.setProdCost(7.1);
		Example<Product> ex=Example.of(p);
		repo.findAll(ex).forEach(System.out::println);*/
		
		//Find all with Example and sort
		/*
		 * Product p=new Product(); p.setProdCost(7.1); Example<Product>
		 * ex=Example.of(p); repo.findAll(ex, Sort.by(Direction.DESC,"prodCode"))
		 * .forEach(System.out::println);
		 */
		
		
		//Find all with Example and pageable
		
		Product p=new Product(); p.setProdCost(7.1); 
		Example<Product> ex=Example.of(p); 
		repo.findAll(ex, PageRequest.of(1, 2))
		 .forEach(System.out::println);
		
		
		
		
		
		
		
		

	}

}
