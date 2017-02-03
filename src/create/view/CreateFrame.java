package create.view;

import javax.swing.JFrame;
import create.controller.GameController;
import java.awt.Dimension;

public class CreateFrame extends JFrame
{
	private GameController baseController;
	private CreatePanel appPanel;

	public CreateFrame(GameController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new CreatePanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setSize(new Dimension (900, 600));
		this.setTitle("The Simple Games");
		this.setSize(new Dimension(900, 600));
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		// GOOD CODE RIGHT HERE
	}

}
