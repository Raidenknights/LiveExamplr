package com.example.manas.LiveEmaple.basic;

import javax.validation.constraints.Size;

public class BasicModel {
	private int id;
	@Size(min=3,message="Name should have 3 characters")
	private String name;
	private double amount;
	
	
	public BasicModel(int id,String name,double amount) {
		super();
		this.id=id;
		this.name = name;
		this.amount=amount;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
