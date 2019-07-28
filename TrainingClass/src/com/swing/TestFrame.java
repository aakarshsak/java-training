package com.swing;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame extends Frame{
	TestFrame() {
		setTitle("Demo");
		setSize(500, 500);
		setLocation(200, 200);
	}
	
	public static void main(String[] args) {
		Frame f = new TestFrame();
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}
