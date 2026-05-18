package com.telusko.databasedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.telusko.databasedemo.Entity.Product;

public interface IProductRepo extends CrudRepository<Product, Integer>
{

}
