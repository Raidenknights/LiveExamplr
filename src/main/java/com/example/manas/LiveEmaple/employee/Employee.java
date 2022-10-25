package com.example.manas.LiveEmaple.employee;

import java.util.List;

public class Employee {
	private String employeeName;
	private String employeeID;
	private List<String> tech;
	private int age;
	public Employee(String employeeName, String employeeID, List<String> tech, int age) {
		super();
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.tech = tech;
		this.age = age;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}
	public List<String> getTech() {
		return tech;
	}
	public void setTech(List<String> tech) {
		this.tech = tech;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
