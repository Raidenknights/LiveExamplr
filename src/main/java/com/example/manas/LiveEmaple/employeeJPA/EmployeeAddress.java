package com.example.manas.LiveEmaple.employeeJPA;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class EmployeeAddress {
	@Id
	@GeneratedValue
	private Integer addressID;
	private String addressType;
	private String laneAddress;
	private String pincode;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private EmployeeJPA empJPA;

	public Integer getAddressID() {
		return addressID;
	}
	public void setAddressID(Integer addressID) {
		this.addressID = addressID;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getLaneAddress() {
		return laneAddress;
	}
	public void setLaneAddress(String laneAddress) {
		this.laneAddress = laneAddress;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public EmployeeJPA getEmpJPA() {
		return empJPA;
	}
	public void setEmpJPA(EmployeeJPA empJPA) {
		this.empJPA = empJPA;
	}
	
	
}
