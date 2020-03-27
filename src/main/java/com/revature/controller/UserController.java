package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.domain.User;
import com.revature.service.UserService;

@RestController
public class UserController {
	private UserService userService;

	@Autowired
	public void setUserService() {
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
		return userService.createUser(user);
	}
	
	
	@PutMapping("/user")
	public void updateUser(@RequestBody User user) {
		userService.updateUser(user);
	}

}
