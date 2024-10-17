package com.codepersist.spring_mvc.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codepersist.spring_mvc.entities.Student;
import com.codepersist.spring_mvc.repositories.StudentServicesI;



@Controller
public class StudentController {
	// do mappings with jsp file using methods
	
	@Autowired
	private StudentServicesI stdServicesI;
	
	@GetMapping("/show-add-std-jsp-file")  // this will display add-student.jsp file
	public String showAddStdForm() {
		return "add-student";
	}
	
	// ---------------- Insert query (POST)----------------------
	// add student to database. studentName and jobTitle should be same in your html form and in modal class variable
	/* studentName is a value for name attribute in jsp form - @RequestParam helps to grab a user input for that name attribute and 
	 * put it in a variable named formName */
	@PostMapping("/add-std")
	public String addStudentToDB(@RequestParam("studentName") String formName, @RequestParam("jobTitle") String formJobTitle) {
		Student newStd = new Student();
		newStd.setStudentName(formName);
		newStd.setJobTitle(formJobTitle);
		
		this.stdServicesI.addStudent(newStd); // this addStudent method implements the save method of JpaRepository interface

		return "add-student";
	}
	
	
	// add student to database using @ModelAttribute - parameter is modal class object
	/*
	@PostMapping("/add-std")
	public String addStudent(@ModelAttribute Student stdObj) {
		System.out.println("-------------------" + stdObj.getHtmlFormName());
		return "welcome";
	}
	*/
	
	
	// ----------------- retrieve query (GET) -------------------
	
	// get a student by id
	@GetMapping("student/{id}")  // localhost:8080/student/1
	public String getStudent(@PathVariable("id") long id, ModelMap model) {
		Student std = stdServicesI.getStudentById(id);
		
		System.out.println("------------GET Queries ----------- ");
		System.out.println("Name = " + std.getStudentName());
		System.out.println("Job = " + std.getJobTitle());
		
		model.addAttribute("studentRetrievedById", std); // in jsp file use getStudentName() and getJobTitle() methods
		
		return "retrieved-student"; // jsp file
	}
	
	// retrieve all students
	@GetMapping("/student-list")
	public String getAllStudents(ModelMap model) {
		ArrayList<Student> stdList = stdServicesI.getAllStudents();
		model.addAttribute("listOfRetrievedStudents", stdList);
		
		System.out.println("--------- retrieve all students ---------");
		for(Student std: stdList) {
			System.out.println("Name = " + std.getStudentName());
			System.out.println("Job = " + std.getJobTitle());
			System.out.println("-------------------");
			
			model.addAttribute("retrievedStudent", std);
		}
		
		return "list-of-students";
		
	}
	
	// --------- update student by id --------
	@GetMapping("student/update/{id}")
	public String updateStudent(@PathVariable("id") long id, ModelMap model) {
		Student updatedStd = stdServicesI.updateStudentById(id);
		
		model.addAttribute("updatedStd", updatedStd); // send data to updated-std jsp file
		
		//update to database
		this.stdServicesI.addStudent(updatedStd); 
	
		 return "updated-std";
	}
	
	// --------- delete student by id ---------
//	@DeleteMapping("/student/delete/{id}")
	@GetMapping("/student/delete/{id}")
	public String deleteStudentById(@PathVariable("id") long id, ModelMap model) {
		stdServicesI.deleteStdById(id);
		
		model.addAttribute("deletedID", id);
		
		System.out.println("Deleting.......");
		
		return "delete-jsp";
	}
	
}
