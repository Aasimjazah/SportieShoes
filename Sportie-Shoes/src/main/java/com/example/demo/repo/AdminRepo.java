package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Admin;


public interface AdminRepo extends CrudRepository<Admin, String> {

	
	public Admin findByUsername(String username);
}
