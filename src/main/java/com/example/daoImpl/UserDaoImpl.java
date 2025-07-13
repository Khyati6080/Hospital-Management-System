package com.example.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.dao.UserDao;
import com.example.model.User;

import com.example.util.DatabaseConnection;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUserProfile(int userId) {
		User user=null;
		Connection con = DatabaseConnection.getConnection();
		String query = "select * from User where userId=?";
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				user = new User();
				user.setUserId(rs.getInt("userId"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				User.ROLE role = User.ROLE.valueOf(rs.getString("role"));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void registerUser(User user) {
		String query = "insert into User(username, password, role) values(?,?,?)";
		try {

			Connection con = DatabaseConnection.getConnection();
		    PreparedStatement ps = con.prepareStatement(query);
		    ps.setString(1, user.getUsername());
		    ps.setString(2, user.getPassword());
		    
		    ps.executeUpdate();	
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public User loginUser(String username, String password) {
		
		User user = null;
		
//		String hashed = PasswordUtil.hashPassword(password);
		
		Connection con = DatabaseConnection.getConnection();
		String query = "select * from User where username=? and password=?";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(query);
		    ps.setString(1, username);
		    ps.setString(2, password);
		    ResultSet rs = ps.executeQuery();
		    while(rs.next()) {
		    	user = new User();
		    	user.setUserId(rs.getInt("userId"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				User.ROLE role = User.ROLE.valueOf(rs.getString("role"));
		    }
		}catch(SQLException e) {
			e.printStackTrace();
		}
	    
	    return user; 
		
	}

}
