package question5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class PolygonDrawer extends JApplet
{
	private int count = 1;
	private int x1, x2, x3, x4, x5, x6,
				y1, y2, y3, y4, y5, y6 ;
	private boolean flag = true;
			
	
	
   public void init()
   {
	   getContentPane() .setBackground(Color.white);
	   
	   addMouseListener(new MyMouseListener());
   }
   
   public void paint(Graphics g)
   {
	   super.paint(g);
	   
	   if(count == 6)
	   {
		   int[] xCoords = {x1, x2, x3, x4, x5, x6};
		   int[] yCoords = {y1, y2, y3, y4, y5, y6};
		   g.setColor(Color.red);
		   g.drawPolygon(xCoords, yCoords, 6);
		   g.fillPolygon(xCoords, yCoords, 6);
	   } 
	   
		  
   }
   private class MyMouseListener implements MouseListener
   {
		public void mousePressed(MouseEvent e)
		{
			  if(count == 1)
			   {
				   x1 = e.getX();
				   y1 = e.getY();  
				   count++;
			   }
			   else if(count == 2)
			   {
				   x2 = e.getX();
				   y2 = e.getY(); 
				   count++;
			   }
			   else if(count == 3)
			   {
				   x3 = e.getX();
				   y3 = e.getY(); 
				   count++;
			   }
			   else if(count == 4)
			   {
				   x4 = e.getX();
				   y4 = e.getY(); 
				   count++;
			   }else if(count == 5)
			   {
				   x5 = e.getX();
				   y5 = e.getY();  
				   count++;
			   }
			   else if(count == 6 && flag)
			   {
				   x6 = e.getX();
				   y6 = e.getY(); 
				   flag = false;
				   repaint();
			   }
			  
			  // JOptionPane.showMessageDialog(null, count);
						
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

}
