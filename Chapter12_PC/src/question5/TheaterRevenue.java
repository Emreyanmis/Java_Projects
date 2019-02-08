package question5;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TheaterRevenue extends JFrame
{ 
	private JPanel panel;
	private JRadioButton calculateButton;
	private JRadioButton exitButton;
	private ButtonGroup bg;
	
	private JLabel adultTicketPriceMessage;
	private JLabel adultTicketSoldMessage;
	private JLabel childTicketPriceMessage;
	private JLabel childTicketSoldMessage;
	
	private JTextField adultTicketPriceInput;
	private JTextField adultTicketSoldInput;
	private JTextField childTicketPriceInput;
	private JTextField childTicketSoldInput;
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	public TheaterRevenue()
	{
		setTitle("Travel Expenses");
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
		
		adultTicketPriceMessage = new JLabel("Enter the price per adult ticket: $");
		adultTicketSoldMessage = new JLabel("Number of adult tickets sold: ");
		childTicketPriceMessage =  new JLabel("Enter the price per child ticket: $");
		childTicketSoldMessage = new JLabel("Number of child tickets sold: ");
		
		adultTicketPriceInput = new JTextField(6);
		adultTicketSoldInput = new JTextField(6);
		childTicketPriceInput = new JTextField(6);
		childTicketSoldInput = new JTextField(6);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(8,1));
		panel.add(adultTicketPriceMessage);
		panel.add(adultTicketPriceInput);
		panel.add(adultTicketSoldMessage);
		panel.add(adultTicketSoldInput);
		panel.add(childTicketPriceMessage);
		panel.add(childTicketPriceInput);
		panel.add(childTicketSoldMessage);
		panel.add(childTicketSoldInput);
		panel.add(calculateButton);
		panel.add(exitButton);
		
		calculateButton.addActionListener(new ActionListeners());
		exitButton.addActionListener(new ActionListeners());
		
		bg = new ButtonGroup();
		bg.add(calculateButton);
		bg.add(exitButton);
		
	}
	public class ActionListeners implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
		   if(calculateButton.isSelected())
		   {
			   double grossRevenueAdult, netRevenueAdult, grossRevenueChild, netRevenueChild,
			   		  totalGrossRevenue, totlaNetRevenue;
			   
			   grossRevenueAdult = Double.parseDouble(adultTicketPriceInput.getText()) *
					   			   Double.parseDouble(adultTicketSoldInput.getText());
			   
			   netRevenueAdult = grossRevenueAdult * 0.80;
			   
			   
			   grossRevenueChild = Double.parseDouble(childTicketPriceInput.getText()) *
					   				Double.parseDouble(childTicketSoldInput.getText());
			   
			   netRevenueChild = grossRevenueChild * 0.80;
			   
			   totalGrossRevenue = grossRevenueAdult + grossRevenueChild;
			   totlaNetRevenue = netRevenueAdult + netRevenueChild;
				   				
			   JOptionPane.showMessageDialog(null, String.format("The gross revenue adult amount: $%,.2f"
				   		+ "\nThe net revenue adult amount: $%,.2f"+
				   		"\nThe gross revenue child amount: $%,.2f" 
				   		+ "\nThe net revenue child amount: $%,.2f"+
				   		"\nThe total gross revenue  amount: $%,.2f" 
				   		+ "\nThe net revenue child amount: $%,.2f",		   			   		
				   		grossRevenueAdult, netRevenueAdult,grossRevenueChild, netRevenueChild,
				   		totalGrossRevenue, totlaNetRevenue));
		   }		   
		   else if(exitButton.isSelected())
			   System.exit(0);
		}
	}
	public static void main(String[] args)
	{
	   new TheaterRevenue();
	}

}
