package com.example.util;

import java.sql.*;

public class DatabaseConnection {
	
	static final String db_url = "jdbc:mysql://localhost:3306/hospital";
	static final String user = "root";
	static final String pswd = "root";
	
	static Connection con = null;
	
	static {
		try {
			con = DriverManager.getConnection(db_url,user,pswd);
		}
		catch(Exception e) {
			
		}
	}
	
	public static Connection getConnection()
	{
		return con;
		
	}
	

}
