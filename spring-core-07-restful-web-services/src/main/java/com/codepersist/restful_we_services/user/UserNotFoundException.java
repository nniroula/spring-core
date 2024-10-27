package com.codepersist.restful_we_services.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND) // To return 404 status code in error page
public class UserNotFoundException extends RuntimeException {
	// constructor with exception message
	public UserNotFoundException(String message) {
		super(message);
	}
	
}
