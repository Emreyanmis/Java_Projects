package question7;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LongDistanceCalls extends JFrame
{
	
	private JPanel panel;
	private JRadioButton calculateButton;
	private JRadioButton exitButton;
	private ButtonGroup bg;
	
	private JCheckBox dayBox;
	private JCheckBox eveningBox;
	private JCheckBox offPeakBox;
	
	private JLabel dayMessage;
	private JLabel eveningMessage;
	private JLabel offPeakMessage;
	
	private JTextField dayInput;
	private JTextField eveningInput;
	private JTextField offPeakInput;
	
	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 600;

	public LongDistanceCalls()
	{
		setTitle("Long Distance Calls");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		
		pack();
		setVisible(true);
		
	}
	
	private void buildPanel() 
	{
		calculateButton = new JRadioButton("Calculate");
		exitButton = new JRadioButton("Exit");
		bg = new ButtonGroup();
		bg.add(calculateButton);
		bg.add(exitButton);
		
		dayBox = new JCheckBox("Daytime (6:00 A.M. through 5:59 P.M.)");
		eveningBox = new JCheckBox("Evening (6:00 P.M. through 11:59 P.M.)");
		offPeakBox = new JCheckBox("Off- Peak (12:00 A.M. through 5:59 A.M.)");
		
		dayMessage  = new JLabel("Enter the number of minutes:");
		eveningMessage = new JLabel("Enter the number of minutes:");
		offPeakMessage = new JLabel("Enter the number of minutes:");
		
		dayInput = new JTextField(6);
		eveningInput = new JTextField(6);
		offPeakInput = new JTextField(6);
		
	   panel = new JPanel();
	   panel.setLayout(new GridLayout(4,3));
	   panel.add(dayBox);
	   panel.add(dayMessage);
	   panel.add(dayInput);
	   panel.add(eveningBox);
	   panel.add(eveningMessage);
	   panel.add(eveningInput);
	   panel.add(offPeakBox);
	   panel.add(offPeakMessage);
	   panel.add(offPeakInput);
	   panel.add(calculateButton);
	   panel.add(exitButton);
	   
	   calculateButton.addActionListener(new ActionListeners());
	   exitButton.addActionListener(new ActionListeners());	
	   
	}
	public class ActionListeners implements ActionListener 
	{	
		double total = 0.0;
		@Override
		public void actionPerformed(ActionEvent e) 
		{
		   if(calculateButton.isSelected())
		   {		   
			   if(dayBox.isSelected())
				   total += Double.parseDouble(dayInput.getText()) * 0.07;
			   if(eveningBox.isSelected())
				   total +=  Double.parseDouble(eveningInput.getText()) * 0.12;
			   if(offPeakBox.isSelected())
				   total +=  Double.parseDouble(offPeakInput.getText()) * 0.05;
				      
			  JOptionPane.showMessageDialog(null, 
					   String.format("The total fee amount: $%,.2f", total));
			  total = 0.0;
			  System.exit(0);	
		   }		   
		   else if(exitButton.isSelected())
		   {   
			   total = 0.0;
			   System.exit(0);	
		   }
		}
	}

	public static void main(String[] args) 
	{
		new LongDistanceCalls();
	}

}
