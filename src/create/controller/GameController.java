package create.controller;

//import create.view.CreateFrame;
import create.model.*;



public class GameController
{
	/*private CreateFrame baseFrame;*/
	private TicTacToe ticTacToe;;
	private int colUsed;
	private int rowUsed;
	private int col;
	private int row;
	public GameController()
	{
		ticTacToe = new TicTacToe();
	}

	public void start()
	{
		
		System.out.println("Welcome to Tic Tac Toe.");
        System.out.println("X will play first.");
        System.out.println("0 = 1st, 1 = 2nd, 2 = 3rd rows/columns");
        ticTacToe.play();
	}
	
	public boolean getHasWinner()
	{
		return ticTacToe.hasWinner(rowUsed, colUsed);
	}
	
	public boolean getIsPositionEmpty()
	{
		return ticTacToe.isPositionEmpty(row, col);
	}
	
	 public boolean isBoardFull()
	 {
		 return  ticTacToe.isBoardFull();
	 }
	 
	 
	
	/*public GameController()
	{
		baseFrame = new CreateFrame(this);
	}*/
	
	
	/*public CreateFrame getBaseFrame()
	{
		return baseFrame;
<<<<<<< HEAD
	}*/

}

