package com.restaurantapp.restaurant;

import com.restaurantapp.restaurant.service.IRestaurantService;
import com.restaurantapp.restaurant.entities.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RestaurantApplication {

    //private final IRestaurantService<T, ID>  IRestaurantService;

//    RestaurantApplication(IRestaurantService IRestaurantService) {
//        this.IRestaurantService = IRestaurantService;
//    }

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ConfigurableApplicationContext context =   SpringApplication.run(RestaurantApplication.class, args);
		
		
		IRestaurantService<Menu, Integer> service =   context.getBean(IRestaurantService.class);
		service.getAllMenuItems().forEach(c -> System.out.println(c));
		
		IRestaurantService<Customer, Integer> customers =   context.getBean(IRestaurantService.class);
		customers.getAllCustomers().forEach(c -> System.out.println(c));
		
		IRestaurantService<Customer, Integer> orders =   context.getBean(IRestaurantService.class);
		orders.getAllCustomerOrder(1).forEach(c -> System.out.println(c));
	}

}
