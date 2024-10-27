package com.codepersist.restful_we_services.exception;

import java.time.LocalDate;

/* 
 * Let's format an error message to return time-stamp, message, and details 
 * */
public class ErrorDetails {
	private LocalDate timestamp;
	private String message;
	private String details;
	
	//constructor
	public ErrorDetails(LocalDate timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	
	// getters
	
	public LocalDate getTimestamp() {
		return timestamp;
	}

	
	public String getMessage() {
		return message;
	}
	

	public String getDetails() {
		return details;
	}

}
