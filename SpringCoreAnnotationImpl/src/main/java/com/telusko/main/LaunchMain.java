package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchMain {
	
	//There are 2 ways to initiate the Spring IOC(Inversion of Control)  conatiner
	//1. Application Context - widely used --> Its eager initialization
	//2. bean Factory --> Lazy load
	public static void main(String[] args)
	{
		//here we don't use any XML concept rather we would use class based config
		ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
		
		
		
		
	}

}
