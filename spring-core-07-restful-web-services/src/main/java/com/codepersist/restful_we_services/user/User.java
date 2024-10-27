package com.codepersist.restful_we_services.user;

import java.time.LocalDate;

/* create REST API around this User Bean 
 * Create a DAO object to handle database access and CRUD operations
 * */

public class User {
	private Integer id;
	private String name;
	private LocalDate birthDate;
	
	// constructor
	public User(Integer id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	
	/* getters */
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	
	/* setters */
	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	/* toString method */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}
	
}
