package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.entities.User;

public interface UserService {
	// Create
	
	User saveUser(User user);
	
	// Get all users 
	
	List<User> getAllUser();
	
	// Get single User of a given userId
	
	 User getUser(String userId);
}
