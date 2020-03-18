package net.CubeCraft.gui;

public class GuiSplashScreen extends Gui 
{
	
	static int width;
	static int height;
	
	@SuppressWarnings("static-access")
	public GuiSplashScreen() 
	{
		
		this.width = screen.getWidth() * 7;
		this.height = screen.getHeight() * 4;
		this.drawImage("../Files/splash.png", 0, 0, screen.getWidth(), screen.getHeight());
		
	}
	
	public static void update() 
	{
		
		System.out.println("GuiSplashScreen is updated!");
		
		label.setBounds(-2000, -750, width, height);
		
	}
	
}
