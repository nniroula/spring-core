package com.codepersist.spring_mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codepersist.spring_mvc.entities.Student;



public interface StudentRepositoryI extends JpaRepository<Student, Long> {
	// This interface provides all CRUD operation methods
	// stays blank until you need some custom methods
	
	// NOTE: create another interface to provide your custom methods for CRUD operations
}
