package net.CubeCraft.gui;

public class GuiManager 
{

	public static void GuiDisplayScreen(long screenId) 
	{
		
		boolean isAtDisplay = false;
		
		if(!isAtDisplay) 
		{
			
			if(screenId == 1) 
			{
				
				new GuiSplashScreen();
				
			}
			
		}
		
	}
	
}
