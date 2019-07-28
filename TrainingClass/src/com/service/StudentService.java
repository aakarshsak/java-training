package com.service;

import javax.swing.table.DefaultTableModel;

import com.db.StudentDao;

public class StudentService {
	
	
	public static DefaultTableModel getModel() {
		DefaultTableModel model = StudentDao.getModel();
		return model;
	}

	
	public static Boolean delete(String usn) {
		Boolean flag = StudentDao.deleteRow(usn);
		return flag;
	}
}
