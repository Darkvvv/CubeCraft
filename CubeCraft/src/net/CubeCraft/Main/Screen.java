package net.CubeCraft.Main;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Screen extends JFrame 
{

	public Screen(String title, int width, int height) 
	{
		
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Cubecraft.screen = this;
		
	}
	
}
