package drawingShapes;

import javax.swing.*;
import java.awt.*;

public class ArcDemo extends JApplet
{
	public void init()
	{
		getContentPane() .setBackground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		// Draw a black unfilled arc from 0 degrees to 90 degrees
		g.setColor(Color.black);
		g.drawArc(0, 20, 120, 120, 0, 90);
		
		// Draw a red filled arc from 0 degrees to 90 degrees
	    g.setColor(Color.red);
	    g.fillArc(140, 20, 120, 120, 0, 90);
	    
	    // Draw a green unfilled arc from 0 degrees to 45 degrees
	    g.setColor(Color.GREEN);
	    g.drawArc(0, 120, 120, 120, 0, 45);
	    
	    // Draw a blue filled arc from 0 degrees to 45 degrees
	    g.setColor(Color.blue);
	    g.fillArc(140, 120, 120, 120, 0, 45);
	    
	    // Draw e blue filled arc from 0 degrees to 45 degrees
	    g.setColor(Color.BLUE);
	    g.fillArc(140, 120, 120, 120, 0, 45);
	    
	}

}
