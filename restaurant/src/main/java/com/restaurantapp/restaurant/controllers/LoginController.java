package com.restaurantapp.restaurant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.restaurantapp.restaurant.model.Registration;
import com.restaurantapp.restaurant.service.IRestaurantService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController<T, ID> 
{
	@Autowired
	private IRestaurantService<T, ID> customer;

	@GetMapping("/login")
	public String login(Model model)
	{
		return "login";
	}
	
	
	@PostMapping("/login")
	public String loginPage(@RequestParam String username, @RequestParam String password, Model model, HttpSession session)
	{
		//System.out.println(model);
		System.out.println(username + password);
		boolean isValid = customer.customerLogin(username, password);
		System.out.println(isValid);
		if (isValid)
		{
			session.setAttribute("username", username);
			return "redirect:/index";
		}
			
		else
			//model.addAttribute("error", "Login credentials are wrong. Please enter again");
			return "redirect:/login?error=true";
	}
	
	@GetMapping("/register")
	public String register(Model model)
	{
		model.addAttribute("registration", new Registration());
		return "register";
	}
	
	
	@PostMapping("/register")
	
	public String registrationPage(@ModelAttribute Registration registration, Model model)
	{
		customer.saveCustomer(registration);
		return "redirect:/index";
	}
}
