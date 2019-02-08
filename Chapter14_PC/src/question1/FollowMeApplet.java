package question1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FollowMeApplet extends JApplet
{
    private int x = 100, y = 100;
    
    
    public void init()
    {
    	addMouseMotionListener(new MyMouseListener());
    }
    public void paint(Graphics g)
    {
    	super.paint(g);
    	
    	//Draws the text given by the specified string, 
    	//using this graphics context's current font and color. 
    	//The baseline of the leftmost character is at position (x, y) 
    	//in this graphics context's coordinate system.
    	g.drawString("Hello", x, y);
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
