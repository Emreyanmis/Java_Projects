package question8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StopWatch extends JApplet
{
	private Timer timer;
	private JLabel secondsLabel;
	private JTextField secondsField;
	private JPanel panel, panel1;
	private JRadioButton startButton, stopButton, restartButton;
	private ButtonGroup bg;
	private int TIME_DELAY = 1000;
	private int count = 0;
	
	
	public void init()
	{
		getContentPane() .setBackground(Color.white);
		setLayout(new GridLayout(2,2));
		buildPanel();
		buildPanel1();
		
		
		
		add(panel1);
		add(panel);
   
	
	}
	private void buildPanel1() 
	{
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(1,2));
		
		secondsLabel = new JLabel("Seconds:");
		secondsField = new JTextField("0", 10);
		
		
		panel1.add(secondsLabel);
		panel1.add(secondsField);
	}
	private void buildPanel() 
	{
		panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));

		startButton = new JRadioButton("Start");
		stopButton = new JRadioButton("Stop");
		restartButton = new JRadioButton("Restart");
		bg = new ButtonGroup();
		bg.add(startButton);
		bg.add(stopButton);
		bg.add(restartButton);
		
		timer = new Timer(TIME_DELAY, new TimerListener());
		startButton.addActionListener(new TimerListener() );
		stopButton.addActionListener(new TimerListener() );
		restartButton.addActionListener(new TimerListener() );
		
		panel.add(startButton);
		panel.add(stopButton);
		panel.add(restartButton);
	}
	public class TimerListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(startButton.isSelected())
			{	
				timer.start();
				count += 1;
				secondsField.setText(String.valueOf(count));
			}	
			else if(stopButton.isSelected())
			{
				timer.stop();
				secondsField.setText(String.valueOf(count));
				
			}
			else if(restartButton.isSelected())
			{
				timer.restart();
				count = 0;
				secondsField.setText(String.valueOf(count));
				
			}
			
		}
	}
}
