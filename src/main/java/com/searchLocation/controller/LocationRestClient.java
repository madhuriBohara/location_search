package com.searchLocation.controller;

import org.springframework.web.client.RestTemplate;

import com.searchLocation.dto.Location;

public class LocationRestClient {

	
	public Location getLocationData(long id) {
		
		RestTemplate restTemplate=new RestTemplate();
		Location location = restTemplate.getForObject("http://localhost:8080/location/api/get/"+id, Location.class );
	
		return location;
	}
}
