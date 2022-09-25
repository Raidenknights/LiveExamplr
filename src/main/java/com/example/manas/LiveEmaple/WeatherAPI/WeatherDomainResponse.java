package com.example.manas.LiveEmaple.WeatherAPI;


public class WeatherDomainResponse {
	public WeatherDomainResponse() {
		super();
	}
	private float temprature;
	private float windSpeed;
	
	
	public WeatherDomainResponse(float temprature, float windSpeed) {
		super();
		this.temprature = temprature;
		this.windSpeed = windSpeed;
	}
	public float getTemprature() {
		return temprature;
	}
	public void setTemprature(float temprature) {
		this.temprature = temprature;
	}
	public float getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(float windSpeed) {
		this.windSpeed = windSpeed;
	}
	
}
