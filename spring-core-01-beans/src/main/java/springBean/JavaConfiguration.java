package springBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/* Two records - with record, you do not have to create getters, setters, constructor and toString method */
record Person(String name, String jobTitle) { };

record Backend(String language, String framework, String job) { };

/*
 * This class provides spring project configuration for spring bean manipulation
 */
@Configuration
public class JavaConfiguration {
	/*
	 * First Spring bean
	 */
	@Bean
	public String getName() {
		return "Nabin";
	}
	
	//2nd bean
	@Bean(name="profession")
	public String getOccupation() {
		return "Software Engineer";
	}
	
	// 3rd bean of Person (i.e., record) data type
	@Bean
	public Person getPerson() {
		Person person = new Person("Nabin", "Java Backend Developer");
		return person;
	}
	
	//4th bean
	@Bean
	public Person getSecondPerson() {
		return new Person("Steve", "Cyber Security Expert");
	}
	
	// 5th bean - create this bean using bean 1 and 2 by using method calls
	@Bean
	public String getBeanMadeUpOfBeanOneAndBeanTwo() {
		return getName() + " - " + getOccupation();
	}
	
	//6th bean - create it using bean 1 and 2 by implementing bean parameter approach
	@Bean
	public Person getParameterizedBean(String getName, String profession) { // profession = bean name-not the method name
		return new Person(getName, profession);
	}
	
	
	// bean 7 - Backend return type
	@Bean
	public Backend techInfoOne() {
		return new Backend("Java", "Spring Boot", "Developer");
	}
	
	//bean 8 - Backend return type
	@Bean
	public Backend techInfoTwo() {
		return new Backend("JavaScript", "ExpressJS", "Web Developer");
	}
}
