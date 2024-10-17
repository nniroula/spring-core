package com.codepersist.spring_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController {
	
	/* api endpoints are mapped using methods */
	
	@GetMapping("/welcome")
	public String openWelcomePage(ModelMap model) { // Model is an interface provided by Spring framework
		model.addAttribute("message", "hello Java learner");  // use Model interface to send data to jsp file from controller class

		return "welcome"; // welcome is a jsp file
	}
}
