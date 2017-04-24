/*package create.view;

import javax.swing.JFrame;
import create.view.CreatePanel;
import create.controller.GameController;
import java.awt.Dimension;

public class CreateFrame extends JFrame
{
	private GameController baseController;
	private CreatePanel CreatePanel;
	private TicTacToePanel ticTacToePanel;
	private CreatePanel createPanel;

	public CreateFrame(GameController baseController)
	{
		super();
		this.baseController = baseController;
		this.CreatePanel = new CreatePanel(baseController);
		this.ticTacToePanel = new TicTacToePanel(baseController);
		this.createPanel = new CreatePanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(CreatePanel);
		this.setSize(new Dimension (900, 600));
		this.setTitle("The Simple Games");
		this.setSize(new Dimension(900, 600));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		// GOOD CODE RIGHT HERE
	}
	
	public CreatePanel getcreatePanel()
	{
		return createPanel;
	}
	
	public TicTacToePanel getTicTacToePanel()
	{
		return ticTacToePanel;
	}
	
	public void setCreatePanel(CreatePanel CreatePanel)
	{
		this.CreatePanel = CreatePanel;
	}
	
	public void setTicTacToePanel(CreatePanel CreatePanel)
	{
		this.CreatePanel = CreatePanel;
	}
	
	public void switchMainPanel()
	{
		this.getContentPane();
		this.setContentPane(CreatePanel);
		this.validate();
		this.repaint();
		
	}
	
	public void switchTTTPanel()
	{
		this.getContentPane();
		this.setContentPane(ticTacToePanel);
		this.validate();
		this.repaint();
	}
	
}
*/