package net.CubeCraft.gui;

public class GuiManager 
{

	public static void GuiDisplayScreen(Gui screen) 
	{
		
		boolean isAtDisplay = false;
		
		if(!isAtDisplay) 
		{
			
			((Gui)screen).display();
			
		}
		
	}
	
}
