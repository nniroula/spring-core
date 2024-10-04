package com.codepersist.beans;

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
	
	//toString method to print an Object of this class
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", email=" + email + "]";
	}
	
	public void display() {
		System.out.println("Name is " + name);
		System.out.println("Roll Number is " + rollno);
		System.out.println("Email is " + email);
	}
	
	
	
	
}
