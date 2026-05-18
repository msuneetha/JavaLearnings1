package com.telusko.databasedemo.service;

import com.telusko.databasedemo.Entity.Product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telusko.databasedemo.repository.IProductRepo;

@Service
public class ProductService implements IProductService 
{
	@Autowired
	IProductRepo repo;
	@Override
	public Iterable<Product> getAllProductDetails() {
	
		return repo.findAll();
		
	}
	@Override
	public long getCountOfProducts() {
		// TODO Auto-generated method stub
		return repo.count();
	}
	@Override
	public List<Product> searchById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findByProductId(id);
	}
	@Override
	public List<Product> searchByCategory(String cat) {
		// TODO Auto-generated method stub
		return repo.findByCategory(cat);
	}

}
