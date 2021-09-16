/**
 * 
 */
package com.app.microservice.businesstwo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mohd.adil
 *
 */

@RestController
public class BusinessTwoHome {
	@GetMapping(value = "/home")
	public String homePage() {
		return "Welcome to Home page For Business Two page";
		
		}

	@GetMapping(value = "/")
	public String homePageNew() {
		return "Business API call for Business Two";
		
		}
	
	@GetMapping(value = "/test")
	public String homePageTest() {
		return "Test API call from Project Business Two";
		
		}
}
