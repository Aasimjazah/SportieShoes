package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Product;


public interface ProductRepo extends CrudRepository<Product, Integer> {

	public Product getProductById(int id);
	
	
}
