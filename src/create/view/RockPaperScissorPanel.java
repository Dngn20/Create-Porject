package create.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import create.controller.GameController;

public class RockPaperScissorPanel extends JPanel
{
	private GameController baseController;
	private SpringLayout baseLayout;
	private JButton RockButton;
	private JButton PaperButton;
	private JButton ScissorsButton;
	private JLabel  gameLabel;
	private JLabel  welcomeLabel;
	private JLabel rockLabel;
	private JLabel paperLabel;
	private JLabel scissorLabel;
	
	
	
	
	
	
	
	public RockPaperScissorPanel(GameController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.RockButton = new JButton("Rock");
		this.PaperButton = new JButton("Paper");
		this.ScissorsButton = new JButton("Scissor");
		this.gameLabel = new JLabel("rOcK, pApeR, sCiSsOrs");
		this.welcomeLabel = new JLabel("You have played this game right?");
		
		
		this.rockLabel = new JLabel("Rock beats Scissors");
		this.paperLabel = new JLabel("Paper beats Rock");
		this.scissorLabel = new JLabel("Scissor beats Paper");
		
		
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
		this.setBackground(Color.GRAY);
		this.setPreferredSize(new Dimension(900, 600));
		
		
		
		gameLabel.setFont(new Font("Malayalam MN", Font.PLAIN, 50));
		welcomeLabel.setFont(new Font("Myanmar MN", Font.PLAIN, 20));
		
		this.add(welcomeLabel);
		this.add(paperLabel);
		this.add(scissorLabel);
		this.add(rockLabel);
		this.add(gameLabel);
		this.add(RockButton);
		this.add(ScissorsButton);
		this.add(PaperButton);
		this.add(gameLabel);
	}		// GOOD CODE RIGHT HERE
	

	// GOOD CODE RIGHT HERE
	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, RockButton, 99, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, RockButton, -163, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, PaperButton, 0, SpringLayout.NORTH, RockButton);
		baseLayout.putConstraint(SpringLayout.EAST, PaperButton, -184, SpringLayout.WEST, ScissorsButton);
		baseLayout.putConstraint(SpringLayout.NORTH, ScissorsButton, 0, SpringLayout.NORTH, RockButton);
		baseLayout.putConstraint(SpringLayout.EAST, ScissorsButton, -155, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, gameLabel, 39, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, gameLabel, -168, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.WEST, rockLabel, 78, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rockLabel, 0, SpringLayout.NORTH, paperLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, paperLabel, 18, SpringLayout.SOUTH, PaperButton);
		baseLayout.putConstraint(SpringLayout.WEST, paperLabel, 381, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, scissorLabel, 0, SpringLayout.NORTH, paperLabel);
		baseLayout.putConstraint(SpringLayout.EAST, scissorLabel, -140, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, welcomeLabel, 1, SpringLayout.SOUTH, gameLabel);
		baseLayout.putConstraint(SpringLayout.EAST, welcomeLabel, -291, SpringLayout.EAST, this);
		// GOOD CODE RIGHT HERE
		
	}
}

