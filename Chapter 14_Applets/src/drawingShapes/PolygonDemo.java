package drawingShapes;

import javax.swing.*;
import java.awt.*;

public class PolygonDemo extends JApplet
{
     public void init()
     {
    	 getContentPane().setBackground(Color.white);
     }
     public void paint(Graphics g)
     {
    	int[] xCoords = {60,100,140, 140, 100, 60, 20,20};
    	int[] yCoords = {20, 20, 60, 100, 140, 140, 100, 60};
    	
    	// Call the superclass paint method
    	super.paint(g);
    	
    	// Set the drawing color
    	g.setColor(Color.red);
    	
    	//Draw the polygen 
    	g.fillPolygon(xCoords, yCoords, 8);
    	 
     }
}
