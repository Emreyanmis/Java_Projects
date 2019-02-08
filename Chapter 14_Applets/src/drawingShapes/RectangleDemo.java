package drawingShapes;

import javax.swing.*;
import java.awt.*;

public class RectangleDemo extends JApplet
{
	public void init()
	{
		// Set the background color to white
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		// Call the superclass paint method
		super.paint(g);
		
		// Draw a black unfilled rectangle
		g.setColor(Color.BLACK);
		g.drawRect(20, 20, 120, 120);
		
		// Draw a red filled rectangle
		g.setColor(Color.red);
		g.fillRect(160, 160, 120, 120);
	}
}
