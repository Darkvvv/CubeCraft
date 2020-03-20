package net.CubeCraft.Main;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Screen extends JFrame 
{

	public static JPanel background = new JPanel();
	
	public Screen(String title, int width, int height) 
	{
		
		setTitle(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width, height);
		setLocationRelativeTo(null);
		setVisible(true);
		background.setBackground(Color.WHITE);
		
		Cubecraft.screen = this;
		
	}
	
}
