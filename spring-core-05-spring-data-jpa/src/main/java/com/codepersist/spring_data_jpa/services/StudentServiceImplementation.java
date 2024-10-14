package com.codepersist.spring_data_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.codepersist.spring_data_jpa.repositories.StudentRepositoryI;
import com.codepersist.spring_data_jpa.entities.Student;

@Service
public class StudentServiceImplementation implements StudentServiceI{
	//Field dependency injection
	@Autowired
	private StudentRepositoryI studentRepo;

	
	@Override
	public boolean addStudent(Student std) {
		boolean status = false;
		
		try {
			studentRepo.save(std);
			status = true;
		}catch(Exception e) {
			e.printStackTrace();
			status = false;
		}
	
		return status;
	}

	
	@Override
	public List<Student> getAllStudents() {
		// get all students using JpaRepository interface method findAll()
		List<Student> studentList = studentRepo.findAll();
		return studentList;
	}

	@Override
	public Student getStudentDetails(long id) {
		Optional<Student> optional = studentRepo.findById(id);
		
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void updateStudentDetails(long id) {
		// To update student, first retrieve the student from database by its id
		Student stdFromDb = getStudentDetails(id); // provide an id in main() method
		
		// now update the name and marks
		stdFromDb.setName("Java Developer");
		stdFromDb.setMarks(100);
		
		// save new values to database
		studentRepo.save(stdFromDb);
	}

	@Override
	public boolean deleteStudent(long id) {
		boolean status = false;
	
		try{
			// delete a student from database using JpaRepository interface method
			studentRepo.deleteById(id);
			status = true;
		}catch(Exception e) {
			e.printStackTrace();
			status = false;
		}
		
		return status;
	}
	
	
}
