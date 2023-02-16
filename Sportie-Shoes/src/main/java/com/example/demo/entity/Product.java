package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String brand;
	private String category;
	private String price;
	private int vendorId;
	private String vendorName;
	private int quantity;
	private int size;
	private int discount;
	private String status;
	private String imgname;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Product(String name, String brand, String category, String price, int vendorId, String vendorName,
			int quantity, int size, int discount, String status, String imgname) {
		super();
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.quantity = quantity;
		this.size = size;
		this.discount = discount;
		this.status = status;
		this.imgname = imgname;
	}







	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	
	
	public int getVendorId() {
		return vendorId;
	}



	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	
	



	public String getVendorName() {
		return vendorName;
	}


	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", category=" + category + ", price="
				+ price + ", quantity=" + quantity + ", size=" + size + ", discount=" + discount + ", status=" + status
				+ " , imgname=" + imgname+ "]";
	}
	
}
