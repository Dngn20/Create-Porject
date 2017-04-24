/*package create.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;

import create.controller.GameController;


public class CreatePanel extends JPanel
{
	
	private GameController baseController;
	private CreateFrame baseFrame;
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
		TTTButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				baseFrame = baseController.getBaseFrame();
				baseFrame.switchTTTPanel();
			}
			
			
		});
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.darkGray);
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
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 271, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, TTTButton, 328, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, titleLabel, -347, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, TTTButton, 45, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.NORTH, gameLabel, 6, SpringLayout.SOUTH, titleLabel);
		baseLayout.putConstraint(SpringLayout.EAST, gameLabel, 0, SpringLayout.EAST, TTTButton);
	}


	


}
*/