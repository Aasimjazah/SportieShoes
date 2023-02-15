package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.entity.Vendor;
import com.example.demo.repo.UserRepo;
import com.example.demo.repo.VendorRepo;

@Service
public class VendorService 
{

	@Autowired
	private VendorRepo repo;
	
	public Vendor addVendor(Vendor vendor)
	{
		
		return repo.save(vendor);
		
	}
	
	public List<Vendor> getAllVendor()
	{
		return (List<Vendor>) repo.findAll();
	}
	
	public User getVendorById(int id)
	{
		return repo.getVendorById(id);
		
	}
	

	public void deleteVendor(int id)
	{
		
	        repo.deleteById(id);
	}
	
	public User findByEmail(String email)
	{
	     return repo.findByEmail(email);	
	}
	
	
	
	


}
