package com.telusko.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.telusko.config.Password;

public class LaunchMain
{
	public static void main(String[] args)
	{
		//ApplicationContext
		//BeanFactory
		
		ApplicationContext container =new
				ClassPathXmlApplicationContext("applicationconfig.xml");
		
		Password pass=container.getBean(Password.class);
		System.out.println(pass.algoInfo());
	}

}
