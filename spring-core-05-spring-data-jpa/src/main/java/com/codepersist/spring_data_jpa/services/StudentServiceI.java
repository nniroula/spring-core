package com.codepersist.spring_data_jpa.services;

import java.util.List;

import com.codepersist.spring_data_jpa.entities.Student;

/* All your custom methods for CRUD operations */
public interface StudentServiceI {
	// all custom methods that use JpaRepository methods in their implementations
	public boolean addStudent(Student std);
	public List<Student> getAllStudents(); 
	public Student getStudentDetails(long id);
	public void updateStudentDetails(long id);
	public boolean deleteStudent(long id);
}
