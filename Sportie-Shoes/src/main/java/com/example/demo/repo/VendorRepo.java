package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.User;
import com.example.demo.entity.Vendor;

public interface VendorRepo extends CrudRepository<Vendor, Integer> {

	public Vendor getVendorById(int id);
	
	public Vendor findByEmail(String email);
}
