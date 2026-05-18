package com.telusko.databasedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.databasedemo.service.ProductService;

@SpringBootApplication
public class DatabasedemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DatabasedemoApplication.class, args);
		
		ProductService  service = context.getBean(ProductService.class);
		
		//service.getAllProductDetails().forEach(p -> System.out.println(p));
		
		//service.searchById(4).forEach(p-> System.out.println(p));
		
		service.searchByCategory("Electronics").forEach(p-> System.out.println(p));
		
	}

}
