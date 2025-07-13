package com.example.model;

public class User {
	
	 private int userId;
	 private String username;
	 private String password;
	 private ROLE Role;
	 public enum ROLE{
		 ADMIN,
		 PATIENT,
		 DOCTOR
	 }
	 
	 
	
	public ROLE getRole() {
		return Role;
	}
	public void setRole(ROLE role) {
		Role = role;
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
