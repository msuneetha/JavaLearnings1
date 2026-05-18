package com.telusko.webmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.telusko.webmvc.model.Product;

@Controller
public class ProductController 
{
	@GetMapping("/course-info")
	public String getProductInfo(Map<String, Object> map)
	{
		map.put("pid", 4);
		map.put("pname", "Laptop");
		map.put("pcost", 75000);
		
		return "courseinfo";
	}
	
	@GetMapping("/course-details")
	public String getProducts(Model model)
	{
		Product prod = new Product(12,"Desktop", 50000.00);
		model.addAttribute("prod", prod);
		return "course";
	}

}
