package com.revature.UserService.service;

import java.util.List;

import com.revature.UserService.domain.Car;

public interface CarService {
	
	public List<Car> getCarsByOwner(String username);

}
