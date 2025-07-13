package com.example.dao;

import com.example.model.User;

public interface UserDao {
	
	User getUserProfile(int userId);
	void registerUser(User user);
	User loginUser(String username,String password);
	

}
