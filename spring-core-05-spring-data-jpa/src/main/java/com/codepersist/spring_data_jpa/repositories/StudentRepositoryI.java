package com.codepersist.spring_data_jpa.repositories;

import com.codepersist.spring_data_jpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepositoryI extends JpaRepository<Student, Long>{
	// this provides all jpa interface CRUD opertations methods. You do not have to do any thing here unless you want your custom methods
}
