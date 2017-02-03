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
	private JLabel titleLabel;
	
	
	
	
	public CreatePanel(GameController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.TTTButton = new JButton("Tic-Tac-Toe Game");
		this.RPSButton = new JButton("Rock, Paper, Scissors Game");
		this.OOEButton = new JButton("Odds or Even Game");
		this.gameLabel = new JLabel("You can play three games with the application.");
		this.titleLabel = new JLabel("SIMPLE GAMES");
		
		
		
		
		setupActionListeners();
		setupPanel();
		setupLayout();
		
	}
	
	private void setupActionListeners()
	{
		
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.CYAN);
		this.setPreferredSize(new Dimension(900, 600));
		
		gameLabel.setVerticalTextPosition(JLabel.TOP);
		gameLabel.setHorizontalTextPosition(JLabel.CENTER);
		
		titleLabel.setFont(new Font("Malayalam MN", Font.PLAIN, 50));
		
		this.add(titleLabel);
		this.add(gameLabel);
		this.add(TTTButton);
		this.add(RPSButton);
		this.add(OOEButton);
		this.add(gameLabel);
	}


	public void setupLayout()
	{
		
		baseLayout.putConstraint(SpringLayout.WEST, TTTButton, 32, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, gameLabel, 261, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, gameLabel, -6, SpringLayout.NORTH, RPSButton);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 228, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, OOEButton, 19, SpringLayout.NORTH, TTTButton);
		baseLayout.putConstraint(SpringLayout.WEST, OOEButton, 624, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, OOEButton, -85, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, RPSButton, 19, SpringLayout.NORTH, TTTButton);
		baseLayout.putConstraint(SpringLayout.NORTH, TTTButton, 278, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, TTTButton, 32, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, TTTButton, -256, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, RPSButton, 284, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, RPSButton, 114, SpringLayout.EAST, TTTButton);
		baseLayout.putConstraint(SpringLayout.NORTH, OOEButton, 284, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, RPSButton, -100, SpringLayout.WEST, OOEButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -346, SpringLayout.SOUTH, this);
	}


	


}
