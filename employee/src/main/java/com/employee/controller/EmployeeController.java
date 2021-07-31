package com.employee.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/hello")
	public String greet() {
		return "Hello world : " + port;
	}

}
