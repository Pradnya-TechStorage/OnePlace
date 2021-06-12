package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Entity
public class UserBean{
	
	@Id
	@GeneratedValue
	int id;
	@Column(name="UserName")
	String name;
	@Column(name="UserRole")
	String role;
	
	public UserBean() {
		super();
		
	}

	public UserBean(String name, int id, String roll) {
		super();
		this.name = name;
		this.id = id;
		this.role = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String roll) {
		this.role = roll;
	}
	
	
	

}
