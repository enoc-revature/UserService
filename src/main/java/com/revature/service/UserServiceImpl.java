package com.revature.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.domain.User;
import com.revature.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository userRepo;

	@Autowired
	public void setUserRepository(UserRepository userRepo) {
		this.userRepo = userRepo;
	}

	@Override
	public boolean createUser(User user) {
		Optional<User> existUser = userRepo.findById(user.getUsername());
		if(!existUser.isPresent()) {
			userRepo.save(user);
			return true;
		} else {
			System.out.println("User already exists");
			return false;
		}

	}

	@Override
	public User getUserById(String username) {
		Optional<User> existUser = userRepo.findById(username);
		if(existUser.isPresent()) {
			return existUser.get();
		} else {
			return null;
		}
	}

	@Override
	public User authUser(User user) {
		User userAuth = getUserById(user.getUsername());
		if(user.getPassword().contentEquals(userAuth.getPassword())) {
			return userAuth;
		} else {
			return null;
		}
	}


	@Override
	public void updateUser(User user) {
		userRepo.save(user);
	}

}
