package com.telusko.course_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CourseAppApplication {

	public static void main(String[] args)
	{
		ConfigurableApplicationContext container =
				SpringApplication.run(CourseAppApplication.class, args);
		Telusko telusko = container.getBean(Telusko.class);
		System.out.println(telusko.getTheCourse());
	}

}
