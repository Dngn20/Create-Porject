package create.view;

import javax.swing.*;
import java.awt.*;
import create.controller.GameController;


public class CreatePanel extends JPanel
{
	private GameController baseController;
	private JButton TTTButton;
	private JButton RPSButton;
	private JButton OOEButton;
	private JLabel gameLabel;
	private SpringLayout baseLayout;

	
	
	
	
	public CreatePanel(GameController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.TTTButton = new JButton("Tic-Tac-Toe Game");
		this.RPSButton = new JButton("Rock, Paper, Scissors Game");
		this.OOEButton = new JButton("Odds or Even Game");
		this.gameLabel = new JLabel("You can play three games with the application.");
		
	
		setupPanel();
		setupPanel();
		
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.GREEN);
		this.setPreferredSize(new Dimension(900, 600));
		
		gameLabel.setVerticalTextPosition(JLabel.TOP);
		gameLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		this.add(TTTButton);
		this.add(RPSButton);
		this.add(OOEButton);
		this.add(gameLabel);
	}


	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, TTTButton, 159, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, TTTButton, -227, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, RPSButton, 0, SpringLayout.NORTH, TTTButton);
		baseLayout.putConstraint(SpringLayout.WEST, RPSButton, 28, SpringLayout.EAST, TTTButton);
		baseLayout.putConstraint(SpringLayout.NORTH, OOEButton, 0, SpringLayout.NORTH, TTTButton);
		baseLayout.putConstraint(SpringLayout.WEST, OOEButton, 57, SpringLayout.EAST, RPSButton);
		baseLayout.putConstraint(SpringLayout.WEST, gameLabel, 0, SpringLayout.WEST, TTTButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, gameLabel, -23, SpringLayout.NORTH, TTTButton);
	}


	


}
