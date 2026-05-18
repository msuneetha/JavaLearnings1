package com.telusko.main;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//stereo type annotation
// this would create bean of this class .. and this is just a noraml class

@Component
public class Config {
	
	
	public Config() 
	{
		System.out.println("Config bean is created");
	}
	
	//Here we are creating the object but asking Spring framework to take care of this bean
	@Bean
	 public Password register() {
		 Password password = new Password();
		 password.setPassword("SHA");
		 System.out.println("The modified password is " + password.getPassword());
		 return password;
	 }

}
