package com.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.db.StudentDao;
import com.service.StudentService;

public class JTableDemo extends JFrame{

	
	private JTable table;
	private JScrollPane scrollPane;
	private JButton btn;
	private JPanel panel;
	
	public JTableDemo() {
		setTitle("Table Demo");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		table = new JTable(StudentDao.getModel());
		scrollPane = new JScrollPane(table);
		
		btn = new JButton("Delete");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int idx = table.getSelectedRow();
				String usn = StudentService.getModel().getValueAt(idx, 0).toString();
				Boolean flag = StudentService.delete(usn);
				table.setModel(StudentService.getModel());
			}
		});		
		
		panel = new JPanel();
		panel.add(btn);
		
		add(scrollPane);
		add(panel, BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new JTableDemo();
	}

}
