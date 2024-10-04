package com.codepersist.pojo;

public class Student {
	private String name;
	private int rollno;
	private String email;
	
	// getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	// display method
	public void display() {
		System.out.printf("Name = %s, RollNo = %d, Email = %s", name, rollno, email);
	}
	
	
}
