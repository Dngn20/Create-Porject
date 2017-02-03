package create.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import create.controller.GameController;

public class TicTacToePanel extends JPanel
{
	private GameController baseController;
	private SpringLayout baseLayout;
	
	
	
	
	
	
	public TicTacToePanel(GameController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		
		
		
		setupActionListeners();
		setupPanel();
		setupLayout();
		
	}
	
	private void setupActionListeners()
	{
		
	}
	
	private void setupPanel()
	{
		
	}


	public void setupLayout()
	{
		
	}


	


}

