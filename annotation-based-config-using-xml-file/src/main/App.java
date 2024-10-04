package main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;


public class App {
	public static void main(String []args) {
		System.out.println("An Annotation based configuration of the project using xml file");
		System.out.println();
		
		// acivate application context
		String xml_file_path = "/config/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xml_file_path);
		
		// access student class
		Student stdBean = (Student)context.getBean("student"); // student is for Student class
		System.out.println("After @Value is used in Student class to set up default values for variables...");
		stdBean.display();
		
	}
}
