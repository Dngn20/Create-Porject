package create.view;

import javax.swing.*;
import java.awt.*;
import create.controller.GameController;


public class CreatePanel extends JPanel
{
	private GameController baseController;
	private JButton TTTButton;
	private JLabel gameLabel;
	private SpringLayout baseLayout;
	private JLabel titleLabel;
	private JTable gameTable;
	
	
	
	
	public CreatePanel(GameController baseController)
	{
		super();
		this.baseController = baseController;
		this.baseLayout = new SpringLayout();
		this.TTTButton = new JButton("Tic-Tac-Toe Game");
		this.gameLabel = new JLabel("Needs 2 players to play");
		this.titleLabel = new JLabel("Tic-Tac-Toe");
		
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
		this.add(gameLabel);
	}


	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, TTTButton, 314, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, TTTButton, 327, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, gameLabel, 360, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, gameLabel, 14, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 259, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -60, SpringLayout.NORTH, TTTButton);
	}


	


}
