package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping(value="/SaveProduct")
	public String saveProduct(@RequestBody Product product)
	{
		service.addProduct(product);
		
		return "success";
	}
	
	@GetMapping("/GetProduct/{id}")
	public Product getProductById(@PathVariable("id") int id)
	{
		return service.getProductById(id);
	}
	
	
	@GetMapping("/GetAllProducts")
	public List<Product> getAllProduct()
	{
		return service.getAllProduct();
	}
	
	
	@DeleteMapping("/deleteProduct/{id}")
	public void deleteProduct(@PathVariable("id") int id) {
		service.deleteProduct(id);
	}
	
	@PutMapping("/ApproveProduct/{id}")
	public String approveProduct(@PathVariable("id") int id)
	{
		Product p = service.getProductById(id);
		p.setStatus("Approved");
		service.addProduct(p);
		return "success";
	}
	
	@PutMapping("/RejectProduct/{id}")
	public String rejectProduct(@PathVariable("id") int id)
	{
		Product p = service.getProductById(id);
		p.setStatus("Rejected");
		service.addProduct(p);
		return "success";
	}
}
