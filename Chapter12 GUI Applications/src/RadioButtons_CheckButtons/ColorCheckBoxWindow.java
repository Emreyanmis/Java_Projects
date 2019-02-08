package RadioButtons_CheckButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorCheckBoxWindow extends JFrame
{
	private JPanel panel;
	private JLabel messageLabel;
	private JRadioButton yellow;
	private JRadioButton red;
	private ButtonGroup radioButtonGroup;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	public ColorCheckBoxWindow()
	{
		setTitle("Color Check Boxes");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		messageLabel = new JLabel("Select the boxes to change colors.");
		yellow = new JRadioButton("Yellow background");
		red = new JRadioButton("Red foreground");
		
		yellow.addActionListener(new CheckBoxListener());
		red.addActionListener(new CheckBoxListener());
		setLayout(new FlowLayout());
		add(messageLabel);
		add(yellow);
		add(red);
		setVisible(true);
	}
	
	private class CheckBoxListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource() == yellow)
			{
				if(yellow.isSelected())
				{
					getContentPane().setBackground(Color.YELLOW);
					yellow.setBackground(Color.YELLOW);
					red.setBackground(Color.RED);
				}
				else
				{
					getContentPane().setBackground(Color.LIGHT_GRAY);
					yellow.setBackground(Color.LIGHT_GRAY);
					red.setBackground(Color.LIGHT_GRAY);
				}
			}
			
			else if(e.getSource() == red)
			{
				if(red.isSelected())
				{
					messageLabel.setForeground(Color.RED);
					yellow.setForeground(Color.RED);
					red.setForeground(Color.RED);
				}
				else
				{
					messageLabel.setForeground(Color.black);
					yellow.setForeground(Color.black);
					red.setForeground(Color.BLACK);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		new ColorCheckBoxWindow();

	}

}
