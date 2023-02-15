package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;
import com.example.demo.entity.Vendor;

public interface VendorRepo extends CrudRepository<Vendor, Integer> {

	public User getVendorById(int id);
	
	public User findByEmail(String email);
}
