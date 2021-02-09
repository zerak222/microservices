package com.selflearning.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {	
	@GetMapping(path = "/welcome")
	public String getWelcomeMessage() {		
		return "Hello, welcome to my World!   -Rakesh N";
	}

}
