package com.codepersist.spring_mvc.repositories;

import java.util.ArrayList;
import com.codepersist.spring_mvc.entities.Student;


public interface StudentServicesI {
	public void addStudent(Student std);
	public Student getStudentById(long id);
	public Student updateStudentById(long id);
	public ArrayList<Student> getAllStudents();
	public void deleteStdById(long id);
}
