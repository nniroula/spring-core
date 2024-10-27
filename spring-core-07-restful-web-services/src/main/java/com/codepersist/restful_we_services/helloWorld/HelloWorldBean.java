package com.codepersist.restful_we_services.helloWorld;



public class HelloWorldBean {
	private String message;
	
	//constructor for constructor dependency injection
	public HelloWorldBean(String message) {
		this.message = message;
	}
	
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	
	
}
