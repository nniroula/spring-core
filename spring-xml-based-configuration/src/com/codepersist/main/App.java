package com.codepersist.main;
import com.codepersist.beans.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String []args) {
		System.out.println("This is a Main class for XML based spring project configuration:- ");
		//Activate or start Spring Container - ApplicationContext
		String xml_File_Location = "/com/codeperist/resources/applicationContext.xml";
		//ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xml_File_Location);
		ApplicationContext context = new ClassPathXmlApplicationContext(xml_File_Location);
		
		System.out.println();
		System.out.println("Before using application context object ...");
		// display name, rollno and emial values hard-coded in applicationContext.xml file
		Student std = new Student(); // this step does not work. Object creating responsibility is of spring container. You do not have to make them.
		std.display();
		
		System.out.println();
		System.out.println("After using application context object...");
		// but you context and getBean method
		Student st = (Student)context.getBean("stdObjectId");
		st.display();
		
		System.out.println("--------------------------------------");
		System.out.println("Object 2 from xml file...");
		Student stdObject2 = (Student)context.getBean("stdObjectTwoId");
		stdObject2.display();
	}
}
