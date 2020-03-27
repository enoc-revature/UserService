package com.revature.UserService.service;

import com.revature.UserService.domain.User;

public interface UserService {
	public boolean createUser(User user);
	public User getUserById(String username);
	public User authUser(User user);
	public void updateUser(User user);
}
