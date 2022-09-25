/*package com.example.manas.LiveEmaple.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
public class UserModel {
	
	@Id
	@GeneratedValue
	private int id;
	@Size(min=3)
	private String name;
	@NotNull
	private double amount;
	@JsonProperty(access=Access.WRITE_ONLY)
	private String password;
	public UserModel(){
		super();
	}
	public UserModel(int id, String name, double amount,String password) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.password=password;
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
	
}*/
