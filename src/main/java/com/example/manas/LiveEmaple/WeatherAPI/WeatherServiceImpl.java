package com.example.manas.LiveEmaple.WeatherAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service	
public class WeatherServiceImpl implements WeatherService {

	//private static final Logger Logger = LoggerFactory.getLogger(WeatherServiceImpl.class);
	@Autowired
	private WeatherAPIConfiguration config;
	

	RestTemplate restTemplate = new RestTemplate();
	
	public ResponseEntity<Object> getWeatherByCity(String cityName) {
		WeatherDomainResponse responseDomain = new WeatherDomainResponse();
		
		try {
			String access_key=config.getAccess_key();
			String url=config.getUrl();
			
			//@Value($"weather")
			
			HttpHeaders headers = new HttpHeaders();
			headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
			
			UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("access_key",access_key).
					queryParam("query",cityName);
			HttpEntity<?> entity = new HttpEntity<>(headers);
			System.out.println(entity);
			
			HttpEntity<String> response = restTemplate.exchange(builder.toUriString(),HttpMethod.GET, entity, String.class);
			
			
			String responseBody = response.getBody();
			
			System.out.println(responseBody);
			
			ObjectMapper objectMapper = new ObjectMapper();
			
			WeatherAPIResponse weaApiResponse = objectMapper.readValue(responseBody, WeatherAPIResponse.class);
			
			System.out.println(weaApiResponse.getTemperature()+" "+weaApiResponse.getWindSpeed());
			System.out.println(weaApiResponse.getCloudcover()+""+weaApiResponse.getObservationTime());
			//responseDomain.setTemprature(weaApiResponse.get);
			
			/*responseDomain.setTemprature(weaApiResponse.getTemperature());
			responseDomain.setWindSpeed(weaApiResponse.getWindSpeed());*/
			
			
			
			return new ResponseEntity(responseDomain,HttpStatus.ACCEPTED);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}

}
