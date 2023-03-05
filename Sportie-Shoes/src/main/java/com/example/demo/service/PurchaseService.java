package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Product;
import com.example.demo.entity.Purchase;
import com.example.demo.entity.User;
import com.example.demo.repo.ProductRepo;
import com.example.demo.repo.PurchaseRepo;
import com.example.demo.repo.UserRepo;

@Service
public class PurchaseService 
{

	@Autowired
	private PurchaseRepo repo;
	
	@Autowired
	private ProductRepo prepo;
	
	@Autowired
	private UserRepo urepo;
	
	public Purchase addPurchase(Purchase purchase)
	{
		System.out.println("Product ID "+purchase.getProductId());
		System.out.println("User ID "+purchase.getUserId());
		
              Product pro = prepo.findById(purchase.getProductId());
              
             int q =  pro.getQuantity()	;
             pro.setQuantity(q-1);
             prepo.save(pro);
             
             repo.save(purchase);
		return repo.save(purchase);
		
	}
	
	public List <Product> myOrders(int id){
		
		List<Product> prod = new ArrayList<Product> ();
		List<Purchase> pur  = repo.findByUserId(id);
		
		for(Purchase purch: pur)
		{
			
			prod.add(prepo.findById(purch.getProductId()));
		}
	  
	  
		return prod;
		
	}
	

	
	
	


}
