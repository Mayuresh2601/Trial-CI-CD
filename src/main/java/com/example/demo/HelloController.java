package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World from Mayuresh Sonar to Bridgelabz Comp.(Gowandi West)";
	}
	
	@GetMapping("/register")
	public String registerUser() {
		
		return "User Registered Successfully From Bridgelabz";
	}
	
	@GetMapping("/login")
	public String loginUser() {
		
		return "User Login Successfully From Bridgelabz";
	}
}
