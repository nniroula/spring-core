package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("Nabin")
	private String name;
	@Value("101")
	private int rollno;
	@Value("test@codepersist.com")
	private String email;
	
	//getter and setters
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
		System.out.printf("Name is %s, Roll No is %d, Email is %s", name, rollno, email);
		System.out.println();
		
	}
	
	
}
