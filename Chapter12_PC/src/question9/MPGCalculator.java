package question9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MPGCalculator extends JFrame
{
	private JPanel panel;
	private JLabel milesMessage;
	private JLabel gallonsMessage;
	
	
	private JRadioButton calculateButton;
	private JRadioButton exitButton;
	private ButtonGroup bg;
	
	private JTextField milesInput;
	private JTextField gallonsInput;
	

	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 600;
	
	public MPGCalculator()
	{
		setTitle("MPG Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		
		pack();
		setVisible(true);
	}
	
	private void buildPanel() 
	{
		milesMessage = new JLabel("Enter the number of gallons of gas the car holds: ");
		gallonsMessage = new JLabel("Enter the number of miles the car can be driven on a full tank: ");
		
		milesInput = new JTextField(4);
		gallonsInput = new JTextField(4);
		
		calculateButton = new JRadioButton("Calculate");
		exitButton = new JRadioButton("Exit");
		bg = new ButtonGroup();
		bg.add(calculateButton);
		bg.add(exitButton);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		panel.add(gallonsMessage);
		panel.add(gallonsInput);
		panel.add(milesMessage);
		panel.add(milesInput);
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
			  double miles, gallons, MPG;
			  
			  miles = Double.parseDouble(milesInput.getText());
			  gallons = Double.parseDouble(gallonsInput.getText());
			  MPG = miles / gallons;
			  
			  JOptionPane.showMessageDialog(null, 
					   String.format("The number of miles that the car may"
					   		+ " be driven per gallon of gas: %,.2f", MPG));  
			   System.exit(0);	
		   }
		   else if(exitButton.isSelected())
			   System.exit(0);	
		   
		}   
	}
	
	public static void main(String[] args)
	{
		new MPGCalculator();
	}
}
