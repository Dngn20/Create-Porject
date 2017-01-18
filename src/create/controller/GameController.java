package create.controller;

import create.view.CreateFrame;


public class GameController 
{
	private CreateFrame baseFrame;

	public GameController()
	{
		baseFrame = new CreateFrame(this);
	}
	
	public void start()
	{
		
	}
	
	public CreateFrame getBaseFrame()
	{
		return baseFrame;
	}
}
