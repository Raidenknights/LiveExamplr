package com.example.manas.LiveEmaple.WeatherAPI;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface WeatherService {
		public ResponseEntity<Object> getWeatherByCity(String cityName);
}
