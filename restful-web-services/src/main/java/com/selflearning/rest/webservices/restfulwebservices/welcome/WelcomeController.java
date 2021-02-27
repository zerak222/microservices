package com.selflearning.rest.webservices.restfulwebservices.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {	
	@GetMapping(path = "/welcome")
	public String getWelcomeMessage() {		
		return "Hello, welcome to my World!   -Rakesh N";
	}
    @GetMapping(path = "/welcome-message-bean")
	public WelcomeMessageBean getWelcomeMessageBean() {
		return new WelcomeMessageBean("Hello, welcome to my world {From message Bean}    --Rakesh N");
	}
    @GetMapping(path = "/welcome/pathvariable/{name}")
	public WelcomeMessageBean getWelcomeMessageBeanPath(@PathVariable String name) {
		return new WelcomeMessageBean("Hello, welcome to my world {From path variable} --"+name);
	}
}
