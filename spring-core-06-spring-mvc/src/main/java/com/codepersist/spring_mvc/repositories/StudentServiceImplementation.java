package com.codepersist.spring_mvc.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codepersist.spring_mvc.entities.Student;


@Service
public class StudentServiceImplementation implements StudentServicesI{

	// declare an interface type autowiring
	
	@Autowired
	private StudentRepositoryI stdRepoI;
	
	// -------- insert operation --------------
	@Override
	public void addStudent(Student std) {
		stdRepoI.save(std);
		
	}
	
	// ------ retrieve a student by id -------
	@Override
	public Student getStudentById(long id) {
		Optional<Student> std = stdRepoI.findById(id); // Optional is a container object and its isPresent() returns boolean value - use its get() to return std
		
		if(std.isPresent()) {
			return std.get();
		}
		
		return null;
	}
	
	// ------------ retrieve all students -------------------
	@Override
	public ArrayList<Student> getAllStudents() {
		ArrayList<Student> stdList = (ArrayList)stdRepoI.findAll();
		return stdList;
	}

	
	@Override
	public Student updateStudentById(long id) {
		// get student by id and then update it
		Student std = getStudentById(id);
		String newName = "Slow Programmer";
		std.setStudentName(newName);
		
		// udpate in database
		stdRepoI.save(std);
		return std;
	}



	@Override
	public void deleteStdById(long id) {
		stdRepoI.deleteById(id);
	}

}
