package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
	
	static {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static Connection getConnection() {
		
		Connection c = null;
		
		try {
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sitdb", "zoro", "abcd123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return c;
	}
}
