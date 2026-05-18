package com.telusko.databasedemo.service;

import org.springframework.stereotype.Service;

import com.telusko.databasedemo.Entity.Product;


@Service
public interface IProductService {
	
	Iterable<Product> getAllProductDetails();
	long getCountOfProducts();

}
