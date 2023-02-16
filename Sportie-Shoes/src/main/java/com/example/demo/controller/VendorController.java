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

import com.example.demo.entity.AuthorizeUser;
import com.example.demo.entity.User;
import com.example.demo.entity.Vendor;
import com.example.demo.service.UserService;
import com.example.demo.service.VendorService;

@RestController
public class VendorController {

	@Autowired
	private VendorService service;
	
	@PostMapping(value="/SaveVendor")
	public String saveUser(@RequestBody Vendor vendor)
	{
		service.addVendor(vendor);
		
		return "success";
	}
	
	@GetMapping("/GetVendor/{id}")
	public Vendor getVendorById(@PathVariable("id") int id)
	{
		return service.getVendorById(id);
	}
	
	@PostMapping(value="/CheckVendor")
	public Vendor checkVendor(@RequestBody AuthorizeUser vendor)
	{
		Vendor u = service.findByEmail(vendor.getEmail());
         
			if(u.getEmail().equalsIgnoreCase(vendor.getEmail()) && u.getPassword().equals(vendor.getPassword()))
			{
				System.out.println(u.getEmail());
				System.out.println(u.getPassword());
				return u;
			}
		
		return null;	
	}
	
	@GetMapping("/GetAllVendors")
	public List<Vendor> getAllVendor()
	{
		return service.getAllVendor();
	}
	
	
	@DeleteMapping("/deleteVendor/{id}")
	public void deleteVendor(@PathVariable("id") int id) {
		service.deleteVendor(id);
	}
}
