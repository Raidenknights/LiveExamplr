package com.example.manas.LiveEmaple.WeatherAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="Weather/")
public class WeatherAPIController {
	
	@Autowired
	WeatherService weatherService;

	@GetMapping(path="/get/{cityName}")
	public ResponseEntity<Object> getWeatherResponse(@PathVariable String cityName){
		
		return weatherService.getWeatherByCity(cityName);
	}
}
