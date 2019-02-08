package question6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridFillerApplet extends JApplet
{
	private boolean x1 = false, x2;
	private int x,y;
	
	public void inint()
	{
		 getContentPane() .setBackground(Color.white);
		   
		 addMouseMotionListener(new MyMouseListener());
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		int[] xCoords = {150, 250, 350, 450, 450, 350, 250, 150, 150, 250, 350, 450,
						450, 350, 250 ,150};
		int[] yCoords = {550, 550, 550 ,550 ,450, 450, 450, 450, 350, 350, 350, 350,
						250, 250, 250, 250};
	
		
		g.setColor(Color.blue);
		g.drawLine(250, 550, 250, 250);
		g.drawLine(350, 550, 350, 250);
		g.drawLine(450, 250, 450, 550);
		g.drawPolygon(xCoords, yCoords, 16);
		
		g.setColor(Color.red);
		g.drawLine(150, 550, 250, 550);
		
		
		if(x1)
		{
			g.setColor(Color.red);
			g.drawArc(160, 460, 80, 80, 0, 360);
			g.fillArc(160, 460, 80, 80, 0, 360);	
		}
		
		
		
	}
	
	private class MyMouseListener extends MouseAdapter
	   {
	      // Invoked when the mouse cursor has been moved onto a component
	      // but no buttons have been pushed.
		

	      public void mouseMoved(MouseEvent e)
	      {
	          x = e.getX();
	          y = e.getY();
	          
	        //&& e.getY() > 450 && e.getY() < 550
		     if(e.getX() > 150 )
		     {
					x1 = true;
					repaint();
		     }
	          
	  
	          //If this component is a lightweight component,
	          //this method causes a call to this component's paint method as soon as possible.
	          //Otherwise, this method causes a call to this component's update method as soon as possible.
	          repaint();       		   
	      }
	   }
}
