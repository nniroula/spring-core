package com.codepersist.restful_we_services.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	// methods to map a url end points
	
	// approach 1 using RequestMapping and path attribute
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String returnHelloWorld() {
		return "hello World";
	}
	
	// approach 2 using @ReqeustMapping and path only
	@RequestMapping(path="/jspPage")
	public String returnJspPage() {
		return "success";
	}
	
	//3 and most recommended approach = @GetMapping(path="...")
	@GetMapping("/spring-restful")      // -----------------> displays a string on the browser but @GetMapping(path="jsp") looks for a jsp page.
	public String getRestfulEndPoint() {
		return "Restful API Endpoint";
	}
	
	// Enhance the hello world rest api to return a spring bean
	@GetMapping("/hello-world-bean")
	public HelloWorldBean displayHelloWorldBean() {
		return new HelloWorldBean("Hello World");  // return the instance of a member class
	}
	
	/* PathVariable to capture the values in the variable of api end point(these variables are called Path Parameters)*/
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) { // use @PathVariable String name to make use of path parameter
		return new HelloWorldBean("Path variable name is " + name);
		
		// go to localhost:8080/hello-world/path-variable/nabin
	}

}
