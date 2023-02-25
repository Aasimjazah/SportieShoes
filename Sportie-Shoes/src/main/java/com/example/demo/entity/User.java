package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User 
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String name;
    
    private String email;
    
    private String dob;
    
    private String gender;
    
    private String pno;
    
    private String password;

	private User(String name, String email, String dob, String gender, String pno, String password) {
		super();
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.pno = pno;
		this.password = password;
	}
	

	private User() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPno() {
		return pno;
	}

	public void setPno(String pno) {
		this.pno = pno;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void makeNull()
	{
		this.name = null;
		this.email = null;
		this.dob = null;
		this.gender = null;
		this.pno = null;
		this.password = null;
	}
    
    
	
	
}
