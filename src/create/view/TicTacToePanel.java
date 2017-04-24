/*package create.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import create.controller.GameController;


public class TicTacToePanel extends JPanel
{
	private SpringLayout baseLayout;
	private CreateFrame baseFrame;
	private GameController baseController;
	private JLabel titleLabel;
	private JLabel rowLabel;
	private JLabel columnLabel;
	private JTextField rowInput;
	private JButton enter;
	private JTextField colInput;
	
	private JLabel OXLabel;
	private JButton backButton;
	private JTable gameTable;
	private JScrollPane pane;
	//OPENING OF THE PROGRAM IS NICE BUT THE BLUE IS A LITTLE MUCH I THINK...
	
	
	public TicTacToePanel(GameController baseController)
	{
		super();
		this.backButton = new JButton("Back");
		this.baseController = baseController;
		this.OXLabel = new JLabel("O and X only");
		this.baseLayout = new SpringLayout();
		this.rowLabel = new JLabel("Rows");
		this.columnLabel = new JLabel("Columns");
		this.rowInput = new JTextField(10);
		this.colInput = new JTextField(10);
		this.enter = new JButton("Enter");
		this.titleLabel= new JLabel("TicTacToe");
		
		
		// GOOD CODE RIGHT HERE
		setupListeners();
		setupTable();
		setupPanel();
		setupLayout();
	}		// GOOD CODE RIGHT HERE
	
	
	// GOOD CODE RIGHT HERE
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setPreferredSize(new Dimension(900, 600));
		this.setBackground(Color.darkGray);
		
		titleLabel.setFont(new Font("Malayalam MN", Font.PLAIN, 50));
		
	
		
		this.add(backButton);
		this.add(OXLabel);
		this.add(titleLabel);
		this.add(enter);		// GOOD CODE RIGHT HERE
		this.add(rowLabel);
		this.add(columnLabel);
		this.add(rowInput);
		this.add(enter);
		this.add(colInput);
	}
	// GOOD CODE RIGHT HERE

	public void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, rowInput, 3, SpringLayout.SOUTH, rowLabel);
		baseLayout.putConstraint(SpringLayout.WEST, rowInput, 47, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, rowLabel, 52, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, columnLabel, 52, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, colInput, 52, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, rowLabel, 66, SpringLayout.SOUTH, colInput);
		baseLayout.putConstraint(SpringLayout.NORTH, colInput, 3, SpringLayout.SOUTH, columnLabel);
		baseLayout.putConstraint(SpringLayout.WEST, enter, 66, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, enter, -79, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, columnLabel, 120, SpringLayout.SOUTH, titleLabel);		// GOOD CODE RIGHT HERE
		baseLayout.putConstraint(SpringLayout.NORTH, titleLabel, 34, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, titleLabel, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, OXLabel, -43, SpringLayout.NORTH, columnLabel);
		baseLayout.putConstraint(SpringLayout.EAST, OXLabel, 0, SpringLayout.EAST, enter);
		baseLayout.putConstraint(SpringLayout.NORTH, backButton, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, backButton, -10, SpringLayout.EAST, this);
	}
	// GOOD CODE RIGHT HERE
	public void setupTable()
	{
		
		char [] col = {' ',' ',' '};
		char [] row = {' ',' ',' '};
		
		char [][] board = {{' ',' ', ' '},
		{' ', ' ', ' '},{' ', ' ', ' '}}; 
		
		gameTable = new JTable();
		gameTable.setPreferredScrollableViewportSize(new Dimension(300, 300));
		pane = new JScrollPane(gameTable);
		
		this.add(gameTable);
		
	}
	
	
	private void setupListeners()
	{
		backButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent Click)
			{
				baseFrame = baseController.getBaseFrame();
				baseFrame.switchMainPanel();
			}
			
			
		});
	}


}

*/