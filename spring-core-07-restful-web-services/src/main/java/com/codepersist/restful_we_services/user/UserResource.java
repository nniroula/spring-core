package com.codepersist.restful_we_services.user;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/* define api end points */


@RestController
public class UserResource {
	// create a DAO service to wire in(pass values/data) the DI
	
	private UserDaoService service;
	
	// constructor injection
	public UserResource(UserDaoService service) {
		this.service = service;
		
	}
	
	// GET all users
	@GetMapping("/users")
	public List<User> retrireveAllUsers(){
		return service.findAll();
		
	// go to localhost:8080/users in browser
	}
	
	// retrieve a user details
	@GetMapping("/users/{id}")
	public User retrieveDetailsOfUser(@PathVariable int id){
		//return service.findOne(id);
		User user = service.findOne(id);
		if(user == null) {
			throw new UserNotFoundException("id: " + id); // create this class
		}
		return user;
		
	// go to localhost:8080/users/1 in the browser
	}
	
	// ------------- create a user  -----------------
	@PostMapping("/user")
	public void createUser(@RequestBody User user) {
		service.save(user);
	
	
	// You cannot directly execute POST request in the browser. You need REST API client - may be postman
	// in postman pass the following
	/*
		{
			"name": "Nabin N",
			"birthDate": "1987-05-24"
		}
		*/
	}
	
	// return status code of 201 instead of 200 ok
	@PostMapping("/users")
	public ResponseEntity<User> createUserWithCorrectStatusCode(@RequestBody User user) {
		service.save(user);
		return ResponseEntity.created(null).build();
	}
	
	// ------- Delete a user -------------
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		service.deleteById(id);
	}
	
	
}
