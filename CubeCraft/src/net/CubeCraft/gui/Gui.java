package net.CubeCraft.gui;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import net.CubeCraft.Main.Cubecraft;
import net.CubeCraft.Main.Screen;

public class Gui 
{
	
	static JLabel label;
	Screen screen = Cubecraft.screen;
	ImageIcon imageToAdd;
	
	public void drawImage(String path, int x, int y, int width, int height) 
	{
		
		imageToAdd = new ImageIcon(getClass().getResource(path));
		
		label = new JLabel(imageToAdd);
		label.setBounds(x, y, width, height);
		
		Screen.background.add(label);
		
	}
	
	public void drawString(String text, int x, int y, int width, int height) 
	{
	
		JLabel label = new JLabel(text);
		label.setBounds(x, y, width, height);
		
		Screen.background.add(label);
		
	}
	
}
