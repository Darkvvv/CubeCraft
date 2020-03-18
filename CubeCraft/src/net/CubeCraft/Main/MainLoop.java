package net.CubeCraft.Main;

import net.CubeCraft.gui.GuiSplashScreen;

public class MainLoop 
{

	public MainLoop() 
	{
		
		for(int i = 0; i < 3; i++) 
		{
			
			GuiSplashScreen.update();
			
			i--;
			
		}
		
	}
	
}
