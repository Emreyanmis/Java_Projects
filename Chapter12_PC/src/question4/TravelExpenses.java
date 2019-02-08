package question4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TravelExpenses extends JFrame
{
	private JLabel daysMessage;
    private JLabel airfareMessage;
    private JLabel carRentalMessage;
    private JLabel milesDrivenMessage;
    private JLabel parkingMessage;
    private JLabel taxiChargesMessage;
    private JLabel registrationMessage;
    private JLabel lodgingMessage;
    
	private JTextField daysInput;
	private JTextField airfareInput;
	private JTextField carRentalInput;
	private JTextField milesDrivenInput;
	private JTextField parkingInput;
	private JTextField taxiChargesInput;
	private JTextField registrationInput;
	private JTextField lodgingInput;
	
	private JPanel panel;
	
	private JRadioButton calculateButton;
	private JRadioButton exitButton;
	private ButtonGroup bg;
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	public TravelExpenses()
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
		daysMessage = new JLabel("Enter the number of days on the trip: ");
		airfareMessage = new JLabel("Enter the amount of airfare (if any or put 0): $");
		carRentalMessage = new JLabel("Enter the amount of cant rental fees (if any or put 0): $");
		milesDrivenMessage = new JLabel("Enter the number of miles driven, if a private vehicle was used"
				+ " (if any or put 0):");
		parkingMessage =  new JLabel("Enter the amount of parking fees (if any or put 0): $");
		taxiChargesMessage = new JLabel("Enter the amount of taxi charges (if any or put 0): $");
		registrationMessage =  new JLabel("Enter the amount of conference or seminar registration"
				+ " fees (if any or put 0): $");
		lodgingMessage = new JLabel("Enter the amount of lodging charges, per night (if any or put 0): $");
		
		daysInput =  new JTextField(5);
		airfareInput = new JTextField(5);
		carRentalInput = new JTextField(5);
		milesDrivenInput = new JTextField(5);
		parkingInput = new JTextField(5);
		taxiChargesInput = new JTextField(5);
		registrationInput = new JTextField(5);
		lodgingInput = new JTextField(5);
		
		calculateButton = new JRadioButton("Calculate");
		exitButton = new JRadioButton("Exit");
		bg = new ButtonGroup();
		bg.add(calculateButton);
		bg.add(exitButton);
		
		panel.setLayout(new GridLayout(9,1));
		panel.add(daysMessage);
		panel.add(daysInput);
		panel.add(airfareMessage);
		panel.add(airfareInput);
		panel.add(carRentalMessage);
		panel.add(carRentalInput);
		panel.add(milesDrivenMessage);
		panel.add(milesDrivenInput);
		panel.add(parkingMessage);
		panel.add(parkingInput);
		panel.add(taxiChargesMessage);
		panel.add(parkingInput);
		panel.add(registrationMessage);
		panel.add(registrationInput);
		panel.add(lodgingMessage);
		panel.add(lodgingInput);
		
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
			   
		   }		   
		   else if(exitButton.isSelected())
			   System.exit(0);
		}
	 }

	public static void main(String[] args) 
	{
		new TravelExpenses();
	}

}
