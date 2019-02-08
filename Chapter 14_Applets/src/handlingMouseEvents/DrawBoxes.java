package handlingMouseEvents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This applet demonstrates how mouse events and mouse
 * motion events can be handled.
 * It lets the user draw boxes by dragging the mouse
 */
public class DrawBoxes extends JApplet
{
	private int currentX = 0;
	private int currentY = 0;
	private int width = 0;
	private int height = 0;
	
	public void init()
	{
		// Add a mouse listener to this applet.
	    addMouseListener(new MyMouseListener());
	   
	    // Add a mouse motion listener to this applet.
	    addMouseMotionListener(new MyMouseMotionListener());
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.drawRect(currentX, currentY, width, height);
	}
	
   private class MyMouseListener implements MouseListener
	{
	    public void mousePressed(MouseEvent e)
	    {
	    	// Get the mouse cursor coordinates
	    	currentX = e.getX();
	    	currentY = e.getY();
	    }

		public void mouseClicked(MouseEvent e)
		{
		      
		}
		
		public void mouseReleased(MouseEvent e)
		{
		}
		
		public void mouseEntered(MouseEvent e)
		{
		}
		
		public void mouseExited(MouseEvent e)
		{
		}
    }
   
   private class MyMouseMotionListener implements MouseMotionListener
   {
		public void mouseDragged(MouseEvent e)
		{
			// Calculate the size of hte recatangle
			width =  e.getX() - currentX;
			height = e.getY() - currentY;
			
			// Repaint the window
			repaint();
		}
		
		public void mouseMoved(MouseEvent e)
		{
		   
	    }
   }

}
