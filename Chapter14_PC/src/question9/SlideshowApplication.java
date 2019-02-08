package question9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SlideshowApplication extends JApplet
{
	private final int TIME_DELAY = 1000;
	private Timer timer;
	private Image image;
	private int index = 0;
	private String[] imageArray = {"unc.jpg","unc1.jpg","unc2.jpg","unc3.jpg","unc4.jpg", "unc5.jpg",
								   "unc6.jpg", "unc7.jpg", "unc8.jpg", "unc9.jpg"};
	
	public void init()
	{
		setSize(250,250);
		image = getImage(getCodeBase(),imageArray[index]);
		//timer = new Timer(TIME_DELAY, new TimerListener());
		//timer.start();
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawImage(image, 0, 0, 250, 250, this);
	}
	
	public class TimerListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(index < 10)
				index++;
			if(index == imageArray.length)
				index = 0;
			image = getImage(getCodeBase(),imageArray[index]);
			repaint();
		}
	}	
}
