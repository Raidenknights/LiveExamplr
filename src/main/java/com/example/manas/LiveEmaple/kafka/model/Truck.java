package com.example.manas.LiveEmaple.kafka.model;

public class Truck {

	private String truckNumber;

	private String descriptionTruck;
	
	

	public Truck() {
		super();
	}

	public Truck(String truckNumber, String descriptionTruck) {
		super();
		this.truckNumber = truckNumber;
		this.descriptionTruck = descriptionTruck;
	}

	@Override
	public String toString() {
		return "Truck [truckNumber=" + truckNumber + ", descriptionTruck=" + descriptionTruck + "]";
	}

	public String getTruckNumber() {
		return truckNumber;
	}

	public void setTruckNumber(String truckNumber) {
		this.truckNumber = truckNumber;
	}

	public String getDescriptionTruck() {
		return descriptionTruck;
	}

	public void setDescriptionTruck(String descriptionTruck) {
		this.descriptionTruck = descriptionTruck;
	}
	
	

}
