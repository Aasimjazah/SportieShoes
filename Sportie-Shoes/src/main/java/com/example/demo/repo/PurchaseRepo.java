package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Product;
import com.example.demo.entity.Purchase;
import com.example.demo.entity.User;

public interface PurchaseRepo extends CrudRepository<Purchase, Integer> {

	public User getPurchaseById(int id);
	
	public List<Purchase> findByUserId(int id);
}
