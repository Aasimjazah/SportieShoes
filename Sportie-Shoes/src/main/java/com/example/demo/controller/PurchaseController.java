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
import com.example.demo.entity.Product;
import com.example.demo.entity.Purchase;
import com.example.demo.entity.User;
import com.example.demo.service.ProductService;
import com.example.demo.service.PurchaseService;
import com.example.demo.service.UserService;

@RestController
public class PurchaseController {

	@Autowired
	private PurchaseService service;
	
	@Autowired
	private ProductService pservice;
	
	@Autowired
	private UserService uservice;
	
	
	@PostMapping("/purchase/save")
	public Purchase save(@RequestBody Purchase purchase) 
	{
		return service.addPurchase(purchase);
	}
	
	@GetMapping("/MyOrder/{id}")
      public List<Product> myOrders(@PathVariable("id") int id)
      {
    	  return service.myOrders(id);
    	 
		
	}
	
	@GetMapping("/GetAllOrder")
    public List<Purchase> allOrder()
    {
	  return service.getAllOrder();
	
		
	}

}
