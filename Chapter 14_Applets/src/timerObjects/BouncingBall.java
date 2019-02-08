package timerObjects;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BouncingBall extends JApplet
{
	private final int X = 109,
					  WIDTH = 40,
					  HEIGHT = 40,
					  TIME_DELAY = 300,
					  MOVE = 20,
					  MINIMUM_Y = 50,
					  MAXIMUM_Y = 400;
	private int y = 400;
	private boolean goingUp = true;
	private Timer timer;
	
	public void init()
	{
		timer = new Timer(TIME_DELAY, new TimerListener());
		
		// Starts the Timer Object, which causes it to generate action events
		timer.start();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.red);
		
		g.fillOval( X, y, WIDTH, HEIGHT);
	}
	
	public class TimerListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(goingUp)
			{
				if(y > MINIMUM_Y)
					y -= MOVE;
				else
					goingUp = false;
			}
			else
			{
				if(y < MAXIMUM_Y)
					y += MOVE;
				else
					goingUp = true;
			}
			
			// Force a call to the paint method
			repaint();
		}

	}
					  
				  
			

}
