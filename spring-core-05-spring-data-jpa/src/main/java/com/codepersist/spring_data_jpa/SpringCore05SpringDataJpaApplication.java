package com.codepersist.spring_data_jpa;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.codepersist.spring_data_jpa.entities.Student;
import com.codepersist.spring_data_jpa.services.StudentServiceI;
import com.codepersist.spring_data_jpa.services.StudentServiceImplementation;

@SpringBootApplication  // it is combination of 3 annotations
public class SpringCore05SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringCore05SpringDataJpaApplication.class, args);
		
		// get bean
		StudentServiceI stdServiceI = context.getBean(StudentServiceImplementation.class); 
		
		
		// ------------------- Add Student --------------------------
		System.out.println("------------- Add a Student ------------- ");
		// call methods in this bean
		Student studentOne = new Student();
		studentOne.setName("Nabin");
		studentOne.setMarks(98);
		
		boolean resultOne = stdServiceI.addStudent(studentOne);
		if(resultOne) {
			System.out.println("**** Student addition successful ******");
		}else {
			System.out.println("**** Failed - adding student ****");
		}
		
		
		// ---------------- retrieve all students ---------------------
		System.out.println("---------------- Get All Students List --------------");
		ArrayList<Student> studentList = (ArrayList<Student>) stdServiceI.getAllStudents();
		for(Student std: studentList) {
			System.out.println("ID: " + std.getId()); 
			System.out.println("Name " + std.getName());
			System.out.println("Makrs " + std.getMarks());
			System.out.println("------------------------------");
		
		}
		
		// ----------- get details of a student ----------
		System.out.println("--------------- Get details of a student ------------");
		long id = 1;
		Student stdDetails = stdServiceI.getStudentDetails(id);
		System.out.println("Id: " + stdDetails.getId());
		System.out.println("Name: " + stdDetails.getName());
		System.out.println("Marks: " + stdDetails.getMarks());
		
		
		System.out.println("--------------- Update details of a student ------------");
		long idOfStdToBeUpdated = 1;
		
		stdServiceI.updateStudentDetails(idOfStdToBeUpdated);
		
		Student stdUpdatedDetails = stdServiceI.getStudentDetails(idOfStdToBeUpdated);
		System.out.println("Id: " + stdUpdatedDetails.getId());
		System.out.println("Updated Name: " + stdUpdatedDetails.getName());
		System.out.println("Updated Marks: " + stdUpdatedDetails.getMarks());
		
	
		System.out.println("--------------- Delete a student from Database------------");
		long idOfStdToBeDeleted = 1;
		
		boolean status = stdServiceI.deleteStudent(idOfStdToBeDeleted);
		
		if(status) {
			System.out.println("Delete successful-----------");
		}else {
			System.out.println("Delete unsuccessful-----------");
		}
		
	}
}
