package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping("/AdminLogin")
	public String adminLogin()
	{
		return "AdminLogin";
	}
	
	@RequestMapping("/AdminDashboard")
	public String adminDashboard()
	{
		return "AdminDashboard";
	}
	
	@RequestMapping("/UserRegistration")
	public String userRegistration()
	{
		return "UserRegistration";
	}
	
	@RequestMapping("/UserLogin")
	public String userLogin()
	{
		return "UserLogin";
	}
	
	@RequestMapping("/UserArea")
	public String userArea()
	{
		return "UserArea";
	}
	
	@RequestMapping("/AllUsers")
	public String AllUsers()
	{
		return "AllUsers";
	}
	
	
	
	@RequestMapping("/AllVendors")
	public String AllVendors()
	{
		return "AllVendors";
	}
	
	
	
	@RequestMapping("/AddProduct")
	public String AddProduct()
	{
		return "AddProduct";
	}
	
	@RequestMapping("/ManageProducts")
	public String ManageProduct()
	{
		return "ManageProducts";
	}
	
	@RequestMapping("/UserProfile")
	public String userProfile()
	{
		return "UserProfile";
	}
	
	@RequestMapping("/MyProducts")
	public String myProducts()
	{
		return "MyProducts";
	}
	
	@RequestMapping("/AllProduct")
	public String AllProducts()
	{
		return "AllProduct";
	}
	
	@RequestMapping("/ProvideAdminAccess")
	public String provideAdminAccess()
	{
		return "ProvideAdminAccess";
	}
	
	@RequestMapping("/PurchaseProduct")
	public String purchaseProduct()
	{
		return "PurchaseProduct";
	}
	
	@RequestMapping("/Payment")
	public String payment()
	{
		return "Payment";
	}
	
	@RequestMapping("/MyOrder")
	public String myOrder()
	{
		return "MyOrder";
	}
	
	@RequestMapping("/ResetPassword")
	public String resetPassword()
	{
		return "ResetPassword";
	}
	
}
