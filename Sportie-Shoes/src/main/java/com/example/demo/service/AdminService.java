package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Admin;
import com.example.demo.entity.User;
import com.example.demo.repo.AdminRepo;
import com.example.demo.repo.UserRepo;

@Service
public class AdminService 
{

	@Autowired
	private AdminRepo repo;
	
	
	
	
	public Admin getAdminByUsername(String id)
	{
		return repo.findByUsername(id);
		
	}
	

	
	
	
	
	


}
