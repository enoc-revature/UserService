package com.revature.UserService.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.UserService.domain.Car;

@Service
public class CarServiceLocator implements CarService {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@Override
	public List<Car> getCarsByOwner(String username) {
		return Arrays.asList(restTemplate.getForObject("http://localhost:8080/car?owner="+username, Car[].class));
	}

}
