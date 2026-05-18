package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchMain {
	
	//There are 2 ways to initiate the Spring IOC(Inversion of Control)  conatiner
	//1. Application Context - widely used
	//2. bean Factory 
	public static void main(String[] args)
	{
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");
	}

}
