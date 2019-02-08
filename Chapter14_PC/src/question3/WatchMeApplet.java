package question3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WatchMeApplet extends JApplet
{
	private int x = 100, y = 100;
	
   public void init()
   {
	   getContentPane() .setBackground(Color.white);
	   setLayout(new FlowLayout());
	   addMouseMotionListener(new MyMouseListener());
   }
   
   public void paint(Graphics g)
   {
	   super.paint(g);
	   
	   g.setColor(Color.BLACK);
	   g.drawArc(300, 100, 40, 40, 0, 360);
	   g.drawArc(350, 100, 40, 40, 0, 360);
	   
	   
	   if(x == 100  && y == 100)
	   { 
		   g.drawArc(315, 115, 10, 10, 0, 360);
	   	   g.fillArc(315, 115, 10, 10, 0, 360);
	   	   
	   	   g.drawArc(365, 115, 10, 10, 0, 360);
	   	   g.fillArc(365, 115, 10, 10, 0, 360);
	   } 
	   
	   else if(x < 300)
	   {
		   g.drawArc(305, 115, 10, 10, 0, 360);
	   	   g.fillArc(305, 115, 10, 10, 0, 360);
	   	   
	   	   g.drawArc(355, 115, 10, 10, 0, 360);
	   	   g.fillArc(355, 115, 10, 10, 0, 360);
	   }
	   else if(x > 350)
	   {
		   g.drawArc(325, 115, 10, 10, 0, 360);
	   	   g.fillArc(325, 115, 10, 10, 0, 360);
	   	   
	   	   g.drawArc(375, 115, 10, 10, 0, 360);
	   	   g.fillArc(375, 115, 10, 10, 0, 360);
	   }
	   else if(y > 80)
	   {
		   g.drawArc(315, 125, 10, 10, 0, 360);
	   	   g.fillArc(315, 125, 10, 10, 0, 360);
	   	   
	   	   g.drawArc(365, 125, 10, 10, 0, 360);
	   	   g.fillArc(365, 125, 10, 10, 0, 360);
	   }
	   else if(y < 85)
	   {
		   g.drawArc(315, 105, 10, 10, 0, 360);
	   	   g.fillArc(315, 105, 10, 10, 0, 360);
	   	   
	   	   g.drawArc(365, 105, 10, 10, 0, 360);
	   	   g.fillArc(365, 105, 10, 10, 0, 360);
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
          
  
          //If this component is a lightweight component,
          //this method causes a call to this component's paint method as soon as possible.
          //Otherwise, this method causes a call to this component's update method as soon as possible.
          repaint();       		   
      }
   }
}
