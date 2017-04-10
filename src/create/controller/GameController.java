package create.controller;

import create.view.CreateFrame;
import create.model.*;


public class GameController 
{
	private CreateFrame baseFrame;
	private TicTacToe [][] ticTacToe; 
	

	public void start()
	{
		
	}
	
	public GameController()
	{
		baseFrame = new CreateFrame(this);
		
	}
	
	
	
	public CreateFrame getBaseFrame()
	{
		return baseFrame;
	}
}
