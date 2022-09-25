package com.example.manas.LiveEmaple.LiveUser;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class LiveUser {
	
	@Id
	@GeneratedValue
	private int id;
	@Size(min=3,message="name should have 3 characters")
	private String name;
	private double amount;
	private String password;
	public LiveUser() {
		super();
	}
	public LiveUser(int id, String name, double amount, String password) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.password = password;
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
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
