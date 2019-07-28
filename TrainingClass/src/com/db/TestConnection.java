package com.db;

import java.sql.Connection;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection c = DBConnectionManager.getConnection();
		
		if(c != null) {
			System.out.println("Connection Established");
		}
		
		
	}

}
