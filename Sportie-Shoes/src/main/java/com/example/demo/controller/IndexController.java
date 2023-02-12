package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/AdminLogin")
	public String adminLogin()
	{
		return "AdminLogin";
	}
	
	@RequestMapping("/AdminDashboard")
	public String adminDashboard()
	{
		return "AdminDashboard";
	}
	
	@RequestMapping("/UserRegistration")
	public String userRegistration()
	{
		return "UserRegistration";
	}
	
	@RequestMapping("/UserLogin")
	public String userLogin()
	{
		return "UserLogin";
	}
	
	@RequestMapping("/UserArea")
	public String userArea()
	{
		return "UserArea";
	}
}
