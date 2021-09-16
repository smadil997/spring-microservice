package com.app.microservice.businessone.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessLoadController {
	
	@GetMapping(value = "/home")
	public String homePage() {
		return "Welcome to Home page India data";
		
		}

	@GetMapping(value = "/")
	public String homePageNew() {
		return "Business API call";
		
		}
	
	@GetMapping(value = "/test")
	public String homePageTest() {
		return "Test API call from Project";
		
		}
}
