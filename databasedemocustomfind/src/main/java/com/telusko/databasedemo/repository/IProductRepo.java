package com.telusko.databasedemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.telusko.databasedemo.Entity.Product;


public interface IProductRepo extends JpaRepository<Product, Integer>
{

	List<Product> findByProductId(Integer id);
	@Query("FROM Product where category = :cat")
	List<Product> findByCategory(String cat);
}
