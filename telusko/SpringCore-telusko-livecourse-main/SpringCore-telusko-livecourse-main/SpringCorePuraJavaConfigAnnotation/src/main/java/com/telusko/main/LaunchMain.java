package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.telusko.config.Config;
import com.telusko.config.Password;

public class LaunchMain
{
	public static void main(String[] args)
	{
		//ApplicationContext
		//BeanFactory
		
		ApplicationContext container =new 
				AnnotationConfigApplicationContext(Config.class);
		
		Password pass=container.getBean(Password.class);
		System.out.println(pass.algoInfo());
	}

}
