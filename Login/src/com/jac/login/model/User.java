package com.jac.login.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

	// Variables
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name = "Email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "Password", nullable = false, unique = false)
	private String password;

	
	// Constructors
	
	public User() {
	}

	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}

	
	// Getters & Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
