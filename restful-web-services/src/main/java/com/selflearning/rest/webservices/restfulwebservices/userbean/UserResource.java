package com.selflearning.rest.webservices.restfulwebservices.userbean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	@Autowired
	private UserDAOService service ;
	
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		return service.findAll();
	}
    @GetMapping("/user/{userId}")
	public User retrieveUser(@PathVariable Integer userId) {
		return service.findUser(userId);
	}
}
