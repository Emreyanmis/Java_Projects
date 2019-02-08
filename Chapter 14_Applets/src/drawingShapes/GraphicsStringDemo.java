package drawingShapes;

import javax.swing.*;
import java.awt.*;

public class GraphicsStringDemo extends JApplet
{
	public void init()
	{
		getContentPane().setBackground(Color.white);
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		int[] xCoords = {60,100,140, 140, 100, 60, 20,20};
    	int[] yCoords = {20, 20, 60, 100, 140, 140, 100, 60};
    	
    	g.setColor(Color.red);
    	
    	g.fillPolygon(xCoords, yCoords, 8);
    	
    	g.setColor(Color.white);
    	
    	g.setFont(new Font("SansSerif", Font.BOLD, 35));
    	g.drawString("Stop", 35, 95);
		
	}
	
	public void repaint()
	{
		
	}

}
