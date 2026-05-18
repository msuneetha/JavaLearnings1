package com.telusko.webmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.telusko.webmvc.model.Product;

@Controller
public class ProductController 
{
	//get it via query parameters
	//There are 4 ways we can pass paramenters to the method
	//1. using the same name we dont need to use RequestParam annotation
	//using different name so map it with the @RequestParam
	//using the Map, if there are multiple parameters
	//using the POJO object/Model object if there are mixed parameters(data types)
	@GetMapping("/course-info")
	public String getQueryParam(@RequestParam Product allQueryParams, Map<String, Object> map)
	{
		map.put("pid", allQueryParams.getId());
		map.put("pname", allQueryParams.getName());
		map.put("pcost", allQueryParams.getCost());
		
		return "courseinfo";
	}
	
	//get it via path variable
	@GetMapping("/course-details/{id}/name/{name}/cost/{cost}")
	public String getProducts(Product prod, Model model)
	{
		model.addAttribute("prod", prod);
		return "course";
	}

}
