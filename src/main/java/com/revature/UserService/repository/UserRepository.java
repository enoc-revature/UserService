package com.revature.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.UserService.domain.User;

@Repository
public interface UserRepository extends JpaRepository <User, String>{

}
