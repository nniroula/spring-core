package main;
import config.ConfigurationFile;
import pojo.Student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
	public static void main(String []args) {
		System.out.println("Annotation based configuration using Java Configuration file...");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationFile.class);
		Student std = (Student)context.getBean("student");
		std.display();
	}
}
