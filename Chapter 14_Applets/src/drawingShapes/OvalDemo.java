package drawingShapes;

import javax.swing.*;
import java.awt.*;

public class OvalDemo extends JApplet
{
	public void init()
	{
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		// Call the superclass paint method
		super.paint(g);
		
		// Draw a black unfilled oval
		g.setColor(Color.BLACK);
		g.drawOval(20, 20, 120, 75);
		
		// Draw a green filled oval
		g.setColor(Color.GREEN);
		g.fillOval(80, 160, 180, 75);
	}

}
