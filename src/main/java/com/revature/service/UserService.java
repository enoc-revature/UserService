package com.revature.service;

import com.revature.domain.User;

public interface UserService {
	public boolean createUser(User user);
	public User getUserById(String username);
	public User authUser(User user);
	public void updateUser(User user);
}
