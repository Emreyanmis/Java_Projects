package question2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MonthlySalesTax extends JFrame
{
	private JTextField SalesInput;
	private JLabel message;

	private final double COUNTY_SALES_TAX = 0.02;
	private final double STATE_SALES_TAX = 0.04;
	private double TOTAL_SALES_TAX;
	
	private JRadioButton calculateButton;
	private JRadioButton exitButton;
	private ButtonGroup bg;
	
	private JPanel panel;
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	public MonthlySalesTax()
	{
		setTitle("Monthly Sales Tax");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		
		pack();
		setVisible(true);		
	}
	
	private void buildPanel()
	{
		panel = new JPanel();
		
		panel.setLayout(new GridLayout(2,1));
		
		message = new JLabel("Enter the total sales for the month: $");
		SalesInput = new JTextField(9);
		
		calculateButton = new JRadioButton("Calculate");
		exitButton = new JRadioButton("Exit");
		
		panel.add(message);
		panel.add(SalesInput);
		panel.add(calculateButton);
		panel.add(exitButton);
	
		calculateButton.addActionListener(new ActionLisetenerButton());
		exitButton.addActionListener(new ActionLisetenerButton());	

		bg = new ButtonGroup();
		bg.add(calculateButton);
		bg.add(exitButton);
	}

	public class ActionLisetenerButton implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{		
			if(calculateButton.isSelected())
			{	
				double stateTax, countyTax;
				
				stateTax = Double.parseDouble(SalesInput.getText())  * STATE_SALES_TAX;
				countyTax = Double.parseDouble(SalesInput.getText()) * COUNTY_SALES_TAX;
				TOTAL_SALES_TAX = stateTax + countyTax;
				
				JOptionPane.showMessageDialog(null,
					String.format("The amount of county sales tax: $%,.2f "
							+ "\nThe amount of state sales tax: $%,.2f  "
							+ "\nThe amount of total sales tax: $%,.2f  ", 
							 	countyTax, stateTax,TOTAL_SALES_TAX));
			}
			else if(exitButton.isSelected())
				System.exit(0);
		}
	}	

	public static void main(String[] args) 
	{
		 new MonthlySalesTax();
	}

}
