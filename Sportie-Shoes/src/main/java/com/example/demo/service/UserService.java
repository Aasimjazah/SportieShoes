package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;

@Service
public class UserService 
{

	@Autowired
	private UserRepo repo;
	
	public User addUser(User user)
	{
		
		return repo.save(user);
		
	}
	
	public List<User> getAllUser()
	{
		return (List<User>) repo.findAll();
	}
	
	public User getUserById(int id)
	{
		return repo.getUserById(id);
		
	}
	

	public void deleteUser(int id)
	{
		
	        repo.deleteById(id);
	}
	
	
	


}
