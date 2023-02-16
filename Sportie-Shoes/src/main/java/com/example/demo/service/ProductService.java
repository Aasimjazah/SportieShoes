package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;
import com.example.demo.repo.UserRepo;
import com.example.demo.repo.ProductRepo;

@Service
public class ProductService 
{

	@Autowired
	private ProductRepo repo;
	
	public Product addProduct(Product product)
	{
		
		return repo.save(product);
		
	}
	
	public List<Product> getAllProduct()
	{
		return (List<Product>) repo.findAll();
	}
	
	public Product getProductById(int id)
	{
		return repo.getProductById(id);
		
	}
	
	public void deleteProduct(int id)
	{
		
	        repo.deleteById(id);
	}
	

}
