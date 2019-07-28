package com.event;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseListenerDemo2 extends Applet {
	
	@Override
	public void init() {
		
		addMouseListener(new MyMouseListener(this));
	}
	
	
	@Override
	public void paint(Graphics g) {
		setBackground(Color.WHITE);
	}
	
}


class MyMouseListener extends MouseAdapter {
	
	Applet applet;
	
	public MyMouseListener(Applet applet) {
		this.applet = applet;
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		applet.showStatus("Mouse Clicked");
	}
	
}