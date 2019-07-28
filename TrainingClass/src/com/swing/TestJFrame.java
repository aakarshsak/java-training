package com.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestJFrame extends JFrame{
	
	private JButton btn;
	private JButton ping;
	private JPanel panel1, panel2;
	
	public TestJFrame() {
		
		setTitle("DEMO J FRAME");
		setSize(400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		btn = new JButton("Clsoe");
		
		panel1 = new JPanel();
		panel2 = new JPanel();
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		panel1.add(btn);
		
		
		
		ping = new JButton("Ping");
		ping.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getToolkit().beep();
			}
		});
		panel2.add(ping);
		

		add(panel1);
		add(panel2, BorderLayout.SOUTH);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new TestJFrame();
	}

}
