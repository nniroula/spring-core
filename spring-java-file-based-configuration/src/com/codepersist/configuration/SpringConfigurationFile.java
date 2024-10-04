package com.codepersist.configuration;
import com.codepersist.pojo.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringConfigurationFile {

	// create bean using @Bean annotation
	@Bean
	public Student stdId1() {  // in xml stdId1 is id for an object. here, it becomes name of bean object
		Student std = new Student();
		// set values for std object
		std.setName("Nabin");
		std.setRollno(100);
		std.setEmail("nabin@codepersist.com");
		
		return std;
	}
	
	// create another bean object
	@Bean(name="std2Object")
	public Student stdId2() {
		Student std2 = new Student();
		std2.setName("Steve");
		std2.setRollno(99);
		std2.setEmail("steve@codepersist.com");
		
		return std2;
	}
	
	@Bean
	public Student stdId3() {
		Student std3 = new Student();
		std3.setName("Jerry");
		std3.setRollno(999);
		std3.setEmail("jerry@codepersist.com");
		
		return std3;
	}
}
