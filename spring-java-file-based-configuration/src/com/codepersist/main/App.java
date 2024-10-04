package com.codepersist.main;
import com.codepersist.configuration.SpringConfigurationFile;
import com.codepersist.pojo.Student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
	public static void main(String []args) {
		System.out.println("Java File based spring configuration ...");
		
		System.out.println();
		
		// use getBean() method to access spring bean(spring object)
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigurationFile.class);
		
		System.out.println("First student bean is ...");
		Student std = (Student)context.getBean("stdId1");
		std.display();
		
		// get another Student object - bean object is given a name attribute of std2Object in config file
		System.out.println();
		System.out.println();
		System.out.println("Second student object is ...");
		Student std2 = (Student)context.getBean("std2Object");
		std2.display();
		
		// retrieve the data without using getBean method - just using config file class name
		System.out.println();
		System.out.println();
		System.out.println("Third student object is ...");
		//Student std3 = (Student) context.getBean(Student.class); // spring is confused which std object to invoke
		Student std3 = (Student) context.getBean("stdId3");
		std3.display();
	}
}
