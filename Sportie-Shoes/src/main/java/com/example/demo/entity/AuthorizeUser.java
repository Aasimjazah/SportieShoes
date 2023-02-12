package com.example.demo.entity;

import org.springframework.stereotype.Component;

@Component
public class AuthorizeUser 
{
	
	private String email;
	
	
	private String password;


	private AuthorizeUser(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	private AuthorizeUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
