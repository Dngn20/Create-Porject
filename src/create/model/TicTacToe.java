package create.model;

import java.util.Scanner;

public class TicTacToe 
{
	    private static final int Number_Row_Col = 3;
	    private static final char[] markFor = {'X', 'O'};
	    private char[][] board;  
	    private int currentPlayer = 0;   
	   
	    private void boardArray() 
	    {
	        board = new char[Number_Row_Col][Number_Row_Col];
	        for (int i = 0; i < board.length; i++) 
	        {
	            for (int j = 0; j < board[i].length; j++) 
	            {
	                board[i][j] = ' ';
	            }
	        }
	    }    
	    
	   
	    public boolean hasWinner(int rowUsed, int colUsed) 
	    {
	    	boolean foundWinner = true;
	    	for (int i = 0; i < board[rowUsed].length; i++) 
	    	{
	    		if (board[rowUsed][i] != board[rowUsed][colUsed]) 
	    		{
	    			foundWinner = false;
	    		}
	    	}
			if(foundWinner) return true;
			foundWinner = true;
			
			for (int row = 0; row < board.length; row++) 
			{
			    if (board[row][colUsed] != board[rowUsed][colUsed]) 
			    {
				foundWinner = false;
			    }
			}
			
			if (foundWinner) return true; 
			foundWinner = true;
			for (int row = 0; row < board.length; row++) 
			{
			    if (board[row][row] != board[rowUsed][colUsed]) 
			    {
				foundWinner = false;
			    }
			}
			
			if (foundWinner) return true; 
			foundWinner = true;
			for (int row = 0; row < board.length; row++) 
			{
			    if (board[row][Number_Row_Col-row-1]!= board[rowUsed][colUsed])
			    {
				foundWinner = false;
			    }
			}
			if(foundWinner) return true;
			
			return false;
		    }
	   
	    public  boolean isBoardFull() 
	    {
	        for (int row = 0; row < board.length; row++)
	        {
	            for (int col = 0; col < board[row].length; col++) 
	            {
	                if (board[row][col] == ' ') 
	                {
	                    return false;  
	                }
	            }
	        }
	        return true;
	    }
	    
	   
	    public boolean isPositionEmpty(int row, int col) 
	    {
	       
	        if (row < 0 || row >= board.length ||
		        col < 0 || col >= board[row].length)
	        {
	            System.out.println("No Such Position: " + row + "," + col);
	            System.out.println("Exiting Program");
	            System.exit(0);
	        }
	        return board[row][col] == ' ';
	    }
	    
	   
	    private void setPosition(int row, int col) 
	    {
	        if (row < 0 || row >= board.length || col < 0 || col >= board[row].length) 
	        {
	            System.out.println("No Such Position: " + row + "," + col);
	            System.out.println("Exiting Program");
	            System.exit(0);
	        }
	        board[row][col] = markFor[currentPlayer];
	    }
	    
	    private void printBoard() 
	    {
	        int row;
	        int col;
	        for (row = 0; row < board.length; row++) 
	        {
	            for (col = 0; col < board[row].length; col++)
	            {
	                System.out.print("[" + board[row][col] + "] ");
	            }
	            System.out.println();
	        }
	    }
	  
	    public void play() 
	    {
	    	boardArray();
	        
	        
	        boolean noWinner = true;
	        Scanner keyboard = new Scanner(System.in);

	        
	        while(noWinner){
	        printBoard(); 
	            
	        int usedRow;
	        int usedCol;
	           
	        System.out.println("Player " + markFor[currentPlayer] +": It is your turn.");
	        System.out.println("Please enter row between 0 and "+ (Number_Row_Col-1)+":");
	        usedRow = keyboard.nextInt();
	        System.out.println("Please enter column between 0 and "+ (Number_Row_Col-1)+":");
	        usedCol = keyboard.nextInt();
	        boolean isValidRow = false;
	        boolean isValidCol = false;
	            
	        	while(!isValidRow || !isValidCol) 
	            {
	               
	                if (usedRow < 0 || usedRow >= Number_Row_Col) 
	                {
	                    System.out.println("Bad row. Rows need to be between 0" + " and "+(Number_Row_Col-1)+".");
	                    isValidRow = false;
	                } else 
	                {
	                    isValidRow = true;
	                }
	                if (usedCol < 0 ||usedCol >= Number_Row_Col) 
	                {
	                    System.out.println("Bad column. Columns need to be " +  "between 0 and "+(Number_Row_Col-1)+".");
	                    isValidCol = false;
	                } else 
	                {
	                    isValidCol = true;
	                }
	               
	                if (isValidRow && isValidCol) 
	                {
	                    if (!isPositionEmpty(usedRow,usedCol)) 
	                    {
	                        System.out.println("Position already filled.");
	                        isValidCol = false;
	                        isValidRow = false;
	                    }
	                }
	                if (!isValidRow) 
	                {
	                    System.out.println("Please enter new row.");
	                    usedRow = keyboard.nextInt();
	                }

	                if (!isValidCol) 
	                {
	                    System.out.println("Please enter new column.");
	                   usedCol = keyboard.nextInt();
	                }
	            }
	            
	            setPosition(usedRow,usedCol);
	            if (hasWinner(usedRow,usedCol)) 
	            {
	                System.out.println("Congratulations, Player " + markFor[currentPlayer]);
	                printBoard();
	                noWinner = false;
	            }
	           
	            else if (isBoardFull()) 
	            {
	                System.out.println("Tie game. Try playing again.");
	                printBoard();
	                noWinner = false;
	            }
	            currentPlayer = 1-currentPlayer;
	        }
	        System.out.println("Thanks for playing Tic Tac Toe.");
	    }

	  
}
