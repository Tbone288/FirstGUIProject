package graph.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import graph.controller.GraphController;

public class FirstFrame extends JFrame
{
	private GraphController baseController;
	private FirstPanel appPanel;
	
	public FirstFrame(GraphController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new FirstPanel(baseController);
		
		this.setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("COLORS! YAY!");
		this.setSize(new Dimension(600,400));
		this.setVisible(true);
	}
}
