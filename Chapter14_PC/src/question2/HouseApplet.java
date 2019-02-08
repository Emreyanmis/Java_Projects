package question2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HouseApplet extends JApplet
{
	
	private boolean leftWindow = true, door = true, rightWindow = true;
	private int count;
	private boolean flag = true;
	public void init()
	{
		getContentPane() .setBackground(Color.white);
		setLayout(new FlowLayout());
		
		addMouseListener(new MyMouseListener());
	}
	
	public void paint(Graphics g)
	{

		super.paint(g);
		int[] xCoords = { 110, 110, 60, 360, 660, 610, 610};
		int[] yCoords = { 300, 50, 50, 0, 50, 50, 300,};
	
		g.drawPolygon(xCoords, yCoords, 7);
		g.drawLine(110, 50, 610, 50);
		
		g.drawRect(150, 150, 80, 80);
		g.drawLine(190, 150, 190, 230);
		g.drawLine(150, 190, 230, 190);
		
		g.drawRect(480, 150, 80, 80);
		g.drawLine(480, 190, 560, 190);
		g.drawLine(520, 230, 520, 150);
		
		g.drawRect(320, 150, 80, 150);
		g.drawArc(380, 220, 15, 15, 0, 360);
		
		g.setColor(Color.BLACK);
		if(leftWindow && rightWindow && door)
		{	
			
			g.fillRect(150, 150, 80, 80);
			g.fillRect(480, 150, 80, 80);
			g.fillRect(320, 150, 80, 150);
			
		}
		else
		{	
			g.setColor(Color.white);
			g.fillRect(150, 150, 80, 80);
			g.fillRect(480, 150, 80, 80);
			g.fillRect(320, 150, 80, 150);
			g.setColor(Color.BLACK);
			g.fillArc(380, 220, 15, 15, 0, 360);
		}	
	}
	
	private class MyMouseListener implements MouseListener
    {
		public void mousePressed(MouseEvent e)
		{
						
		}
		
		public void mouseClicked(MouseEvent e)
		{
			
			 
		     if( (e.getX() > 150 && e.getX() < 230)
		    	  && (e.getY() > 150 && e.getY() < 230) )
		     {
		    	 leftWindow = false;
		    	 repaint();
		     }
		     else if((e.getX() > 480 && e.getX() < 560) &&
		    		  (e.getY() > 150 && e.getX() < 230))
		     {
		    	 rightWindow = false;
		    	 repaint();
		    	 
		     } 
		     else if((e.getX() > 320 && e.getX() < 400) &&
		    		  (e.getY() > 150 && e.getY() < 300))
		     {
		    	 door = false;
		    	 repaint();
		     }    
		     else if( (!(e.getX() > 150 && e.getX() < 230)
			    	  && (e.getY() > 150 && e.getY() < 230) ))
			     {
			    	 leftWindow = true;
			    	 rightWindow = true;
			    	 door = true;
			    	 repaint();
			     }
			     else if(!((e.getX() > 480 && e.getX() < 560) &&
			    		  (e.getY() > 150 && e.getX() < 230)))
			     {
			    	 leftWindow = true;
			    	 rightWindow = true;
			    	 door = true;
			    	 repaint();
			    	 
			     } 
			     else if(!((e.getX() > 320 && e.getX() < 400) &&
			    		  (e.getY() > 150 && e.getY() < 300)))
			     {
			    	 leftWindow = true;
			    	 rightWindow = true;
			    	 door = true;
			    	 repaint();
			     }
		  
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

}
