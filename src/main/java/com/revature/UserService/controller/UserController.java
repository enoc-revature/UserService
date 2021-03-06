package com.revature.UserService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.UserService.domain.User;
import com.revature.UserService.service.UserService;

@RestController
public class UserController {
	private UserService userService;

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/user/{username}")
	public User getUserById(@PathVariable String username) {
		return userService.getUserById(username);
	}
	
	@PostMapping("/user/auth")
	public User authUser(@RequestBody User user) {
		User authUser = userService.authUser(user);
		return authUser;
	}

	@PostMapping("/user")
	public boolean createUser(@RequestBody User user) {
		System.out.println("createUser Method.");
		return userService.createUser(user);
	}
	
	
	@PutMapping("/user")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

}
