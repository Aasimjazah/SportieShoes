package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Admin;
import com.example.demo.entity.AuthorizeUser;
import com.example.demo.entity.User;
import com.example.demo.service.AdminService;
import com.example.demo.service.UserService;

@RestController
public class AdminController {

	@Autowired
	private AdminService service;
	
	
	
	
	@PostMapping(value="/CheckAdmin")
	public Admin checkUSer(@RequestBody AuthorizeUser user)
	{
		Admin u = service.getAdminByUsername(user.getEmail());
         
			if(u.getUsername().equalsIgnoreCase(user.getEmail()) && u.getPassword().equals(user.getPassword()))
			{
				System.out.println(u.getUsername());
				System.out.println(u.getPassword());
				return u;
			}
		
		return null ;	
	}
	
	@PostMapping(value="/SaveAdmin")
	public String saveAdmin(@RequestBody Admin admin)
	{
		service.saveAdminDetails(admin);
		
		return "success";
	}
	
	@PostMapping(value="/ResetPassword")
	public String resetPassword(@RequestBody Admin admin)
	{
		System.out.println(admin);
		Admin ad = service.getAdminByUsername(admin.getUsername());
		
		ad.setPassword(admin.getPassword());
		service.saveAdminDetails(ad);
		
		return "success";
	}
	
	
}
