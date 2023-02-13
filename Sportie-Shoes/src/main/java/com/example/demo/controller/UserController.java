package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AuthorizeUser;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping(value="/SaveUser")
	public String saveUser(@RequestBody User user)
	{
		service.addUser(user);
		
		return "success";
	}
	
	@GetMapping("/GetUser/{id}")
	public User getUserById(@PathVariable("id") int id)
	{
		return service.getUserById(id);
	}
	
	@PostMapping(value="/CheckUser")
	public User checkUSer(@RequestBody AuthorizeUser user)
	{
		User u = service.findByEmail(user.getEmail());
         
			if(u.getEmail().equalsIgnoreCase(user.getEmail()) && u.getPassword().equals(user.getPassword()))
			{
				System.out.println(u.getEmail());
				System.out.println(u.getPassword());
				return u;
			}
		
		return null;
		
		
	}
}
