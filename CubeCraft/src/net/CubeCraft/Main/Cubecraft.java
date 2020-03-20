package net.CubeCraft.Main;

import net.CubeCraft.gui.GuiManager;

public class Cubecraft 
{
	
	public static Screen screen;
	
	public static void main(String[] args) 
	{
		
		new Screen("Cubecraft - version 1.0 Alpha", 800, 500);
		
		init();
		
	}

	private static void init() 
	{
	
		GuiManager.GuiDisplayScreen(1);
		new MainLoop();
		
	}
	
}
