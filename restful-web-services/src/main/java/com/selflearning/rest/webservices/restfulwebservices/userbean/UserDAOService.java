package com.selflearning.rest.webservices.restfulwebservices.userbean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDAOService {
    
	private static List<User> users = new ArrayList<>();
	private static int usersCount =4;
	static {
		users.add(new User(1,"User1" , new Date()));
		users.add(new User(2,"User2" , new Date()));
		users.add(new User(3,"User3" , new Date()));
		users.add(new User(4,"User4" , new Date()));
	}
	
	
	public List<User>findAll(){
		return users;
	}
	
	public User addUser(User aUser) {
		if(aUser.getId()==null) {
			aUser.setId(++usersCount);
		}
		users.add(aUser);
		return aUser;
	}
	
	public User findUser(Integer aId) {
		for(User user:users) {
			if(user.getId().equals(aId)) {
				return user;
			}
		}
		return null;
	}
}
