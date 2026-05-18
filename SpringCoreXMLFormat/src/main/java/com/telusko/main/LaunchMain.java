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
		
		//using the bean trying to get the dependency object
		
		//ICourses course = (ICourses)container.getBean("dev"); // here we need to downcast as this format returns of type Object 
		
		//course.registerTheCourse();
		
		Telusko tel = container.getBean(Telusko.class); // if u use this way no need to cast as it gives actual class 
		tel.register();
		
		Config con = container.getBean(Config.class);
		con.register();
		
	}

}
