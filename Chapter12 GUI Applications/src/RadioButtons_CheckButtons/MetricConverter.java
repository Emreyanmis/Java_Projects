package RadioButtons_CheckButtons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MetricConverter extends JFrame
{
	 
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JRadioButton miles;
	private JRadioButton feet;
	private JRadioButton inches;
	private ButtonGroup radioButtonGroup;
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 100;
	
	public MetricConverter()
	{
		setTitle("Metric Converter");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add the panel and add it to the frame
		buildPanel();
		
		// Add the panel to the frame's content pane.
		add(panel);
		
		// Display the window
		setVisible(true);
		
	}
	
	
	
	private void buildPanel() 
	{
		messageLabel = new JLabel("Enter a distance in kilometers:");
		kiloTextField  = new JTextField(10);
		miles = new JRadioButton("Convert to miles");
		feet = new JRadioButton("Convert to feet");
		inches = new JRadioButton("Convert to inches");
		
		// Group the radio buttons
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(miles);
		radioButtonGroup.add(feet);
		radioButtonGroup.add(inches);
		
		// Add action listeners to the radio buttons.
		miles.addActionListener(new RadioActionListener());
		feet.addActionListener(new RadioActionListener());
		inches.addActionListener(new RadioActionListener());
		
		// Create a panel and add the components to it
		panel = new JPanel();
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(feet);
		panel.add(inches);
		panel.add(miles);
		panel.setBorder(BorderFactory.createTitledBorder("Choices"));
		
	}
	
	private class RadioActionListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// Holds the user's input
			String input;
			
			// The units we are converting to
			String converTo = " ";
			
			// Holds the conversion
			double result = 0.0;
			
			// Get the kilometers entered
			input = kiloTextField.getText();
			
			if(e.getSource() == miles)
			{
				converTo = " miles.";
				result = Double.parseDouble(input) * 0.6214;
			}
			else if(feet.isSelected())
			{
				converTo = " feet.";
				result = Double.parseDouble(input) * 3181.0;
			}
			
			else if(inches.isSelected())
			{
				converTo = " inches.";
				result = Double.parseDouble(input) * 39370.0;
			}
			
			JOptionPane.showMessageDialog(null, input + " kilometers is " + 
											String.format("%,.2f", result) + converTo);
			
			
		}
	

	 }

	public static void main(String[] args) 
	{
		new MetricConverter();
	}

}
