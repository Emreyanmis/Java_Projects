package question1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RetailPriceCalculator extends JFrame
{
	private JLabel costMessage;
	private JLabel markupMessage;
	private JTextField costTextField;
	private JTextField markupTextField;
	
	private JRadioButton calculateButton;
	private JRadioButton exitButton;
	private ButtonGroup bg;
	
	private JPanel panel;
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	public RetailPriceCalculator()
	{
		setTitle("Retail Price Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		buildPanel();
		add(panel);
		
		setVisible(true);
		
	}
	
	private void buildPanel() 
	{
		costMessage = new JLabel("Enter the cost of an item $");
		markupMessage = new JLabel("Enter its markup percentage: %");
		
		costTextField = new JTextField(10);
		markupTextField = new JTextField(10);
		
		calculateButton = new JRadioButton("Calculate");
		exitButton = new JRadioButton("Exit");
		
		bg = new ButtonGroup();
		bg.add(calculateButton);
		bg.add(exitButton);
		
		panel.add(costMessage);
		panel.add(costTextField);
		panel.add(markupMessage);
		panel.add(markupTextField);
		panel.add(calculateButton);
		panel.add(exitButton);
		 
		calculateButton.addActionListener(new retailActionListener());
		exitButton.addActionListener(new retailActionListener());
	}
	
	public class retailActionListener implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
		  if(calculateButton.isSelected())
		  {	  
		   String input1, input2;
		   double retail, cost, markup;
		   
		   input1 = costTextField.getText();
		   input2 = markupTextField.getText();
		   
		   cost = Double.parseDouble(input1);
		   markup = Double.parseDouble(input2);
		   
		   retail = cost + (cost * ( markup / 100));
		   JOptionPane.showMessageDialog(null, String.format("The retail price: $%,.2f", retail));
		  }	
		  else if(exitButton.isSelected())
			  System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		new RetailPriceCalculator();
	}
}
