package com.telusko.databasedemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.databasedemo.Entity.Product;


@Service
public interface IProductService {
	
	Iterable<Product> getAllProductDetails();
	long getCountOfProducts();
	List<Product> searchById(Integer id);
	List<Product> searchByCategory(String cat);

}
