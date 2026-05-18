package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //== @ComponentScan + AutoConfiguration
public class Springboot1Application {

	public static void main(String[] args)
	{
		SpringApplication.run(Springboot1Application.class, args);
	}

}
