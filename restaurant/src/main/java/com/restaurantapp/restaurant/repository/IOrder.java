package com.restaurantapp.restaurant.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restaurantapp.restaurant.entities.Order;

@Repository
public interface IOrder extends CrudRepository<Order, Integer>
{
	List<Order> findAllByCustomerId(Integer custid);

}
