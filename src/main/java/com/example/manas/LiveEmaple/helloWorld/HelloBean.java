package com.example.manas.LiveEmaple.helloWorld;

import javax.validation.constraints.Size;

public class HelloBean {
	private int id;
	
	@Size(min=2,message="message should have atleast 2 char")
	private String message;
	private double amount;
	
	public HelloBean(int id,String message,double amount) {
		super();
		this.message = message;
		this.amount=amount;
		this.id=id;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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
