package com.example.model;

public class User {
	
	 private int userId;
	 private String username;
	 private String password;
	 
	 private Role role;
	 public enum Role{
		 ADMIN,
		 PATIENT,
		 DOCTOR
	 }
	 
	 
	 public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
