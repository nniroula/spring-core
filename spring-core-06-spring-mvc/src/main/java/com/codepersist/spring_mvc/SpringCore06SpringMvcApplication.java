package com.codepersist.spring_mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codepersist.spring_mvc.repositories.StudentServiceImplementation;
import com.codepersist.spring_mvc.repositories.StudentServicesI;


@SpringBootApplication
public class SpringCore06SpringMvcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCore06SpringMvcApplication.class, args);
		
		// get beans
		StudentServicesI stdServicesI = context.getBean(StudentServiceImplementation.class);
	}

}
