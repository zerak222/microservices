package com.selflearning.rest.webservices.restfulwebservices.userbean;

import java.util.Date;

public class User {

	public Integer id;
	public String name;
	public Date dob;
	public Integer getId() {
		return id;
	}
	public void setId(Integer aId) {
		this.id = aId;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		this.name = aName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date aDob) {
		this.dob = aDob;
	}
	public User(int aId, String aName, Date aDob) {
		super();
		this.id = aId;
		this.name = aName;
		this.dob = aDob;
	}
	
	
}
