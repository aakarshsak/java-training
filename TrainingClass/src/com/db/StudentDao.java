package com.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import com.io.Student;


public class StudentDao {
	
	
	public static DefaultTableModel getModel() {
		Connection conn = DBConnectionManager.getConnection();
		String sql = "select * from student";
		
		Vector<String> colName = new Vector<>();
		colName.add("USN");
		colName.add("NAME");
		
		Vector<Vector<String>> data = new Vector<>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs != null && rs.next()) {
				Vector<String> row = new Vector<>();
				row.add(rs.getString(2).toUpperCase());
				row.add(rs.getString(1));
				data.add(row);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return new DefaultTableModel(data, colName);
	}
	
	public static Boolean deleteRow(String usn) {
		Boolean flag = false;
		
		String sql = "delete from student where usn=?";
		Connection conn = DBConnectionManager.getConnection();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, usn);
			int row = -1;
			row = ps.executeUpdate();
			
			if(row!=-1) {
				flag = true;
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return flag;
	}
	
	
	public static Boolean insert(Student s) {
		
		Boolean b = false;
		Connection conn = DBConnectionManager.getConnection();
		String insertSQL = "insert into student values(?,?)";
		
		try {
			PreparedStatement ps = conn.prepareStatement(insertSQL);
			ps.setString(2, s.getUsn());
			ps.setString(1, s.getName() );
			ps.execute();
			b = true;
			ps.close();
			conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return b;
	}

}
