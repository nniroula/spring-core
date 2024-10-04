package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // -> to declare class as a Spring bean
public class Student {  // you have to scan this package or you don't get bean object
	@Value("Nabin") // -> to provide default value to a bean
	private String name;
	@Value("24")
	private int rollno;
	@Value("test@test.codepersist")
	private String email;
	
	
	//gettters and setters
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

	public void display() {
		System.out.println("name = " + name);
		System.out.println("Roll No = " + rollno);
		System.out.println("Email = " + email);
	}
}
