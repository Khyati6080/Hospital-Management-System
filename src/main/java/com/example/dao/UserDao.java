package com.example.dao;

import com.example.model.User;

public interface UserDao {
	
	User getUser(int id);
	void addUser(User user);
	void deleteUser(int id);
	void updateUser(User user);

}
