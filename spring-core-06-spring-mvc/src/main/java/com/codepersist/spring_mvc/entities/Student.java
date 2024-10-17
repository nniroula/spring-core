package com.codepersist.spring_mvc.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="student")
public class Student {
	@Id
	@Column(name="Student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="studentName")
	private String studentName; // this should be same in database table column, html form and here
	
	@Column(name = "occupation")
	private String jobTitle;
	
	
	// getters and setters
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String name) {
		this.studentName = name;
	}
	
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String job_title) {
		this.jobTitle = job_title;
	}
	
	
}
