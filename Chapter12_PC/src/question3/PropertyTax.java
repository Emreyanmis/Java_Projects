package question3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PropertyTax extends JFrame
{
	
	private JLabel message;
	private JTextField input;
	private JPanel panel;
	private final double PROPERTY_TAX = 0.0064;
	private final double ASSESSMENT_VALUE = 0.60;
	
	private JRadioButton calculateButton;
	private JRadioButton exitButton;
	private ButtonGroup bg;
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	public PropertyTax()
	{
		setTitle("Property Tax");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		
		pack();
		setVisible(true);	
	}
	


	private void buildPanel() 
	{
		message = new JLabel("Enter the actual value of a property: $");
		input = new JTextField(9);
		calculateButton = new JRadioButton("Calculate");
		exitButton = new JRadioButton("Exit");
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));
		panel.add(message);
		panel.add(input);
		panel.add(calculateButton);
		panel.add(exitButton);
		
		
		bg = new ButtonGroup();
		bg.add(calculateButton);
		bg.add(exitButton);
		
		calculateButton.addActionListener(new ActionListeners());
		exitButton.addActionListener(new ActionListeners());
		
	}
	
	public class ActionListeners implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
		   if(calculateButton.isSelected())
		   {
			   double propertyValue, propertyTax;
			   
			   propertyValue = Double.parseDouble(input.getText()) * ASSESSMENT_VALUE;
			   propertyTax =  propertyValue * PROPERTY_TAX;
			   
			   JOptionPane.showMessageDialog(null, String.format("The assessment value: $%,.2f"
			   		+ "\nThe property tax: $%,.2f", propertyValue, propertyTax));
		   }
		   else if(exitButton.isSelected())
			   System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		new PropertyTax();
	}
}
