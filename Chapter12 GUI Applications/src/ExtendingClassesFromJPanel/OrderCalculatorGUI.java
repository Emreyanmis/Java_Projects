package ExtendingClassesFromJPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderCalculatorGUI extends JFrame
{
	private BagelPanel bagels;
	private ToppingsPanel toppings;
	private CoffePanel coffee;
	private GreetingPanel banner;
	private JPanel buttonPanel;
	private JButton calcButton;
	private JButton exitButton;
	private final double TAX_RATE = 0.06;
	
	public OrderCalculatorGUI()
	{
		setTitle("Order Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// Create the custom panels
		banner = new GreetingPanel();
		bagels = new BagelPanel();
		toppings = new ToppingsPanel();
		coffee =  new CoffePanel();
		
		// Create the button panel
		buildPanel();
		
		// Add the components to the content pane
		add(banner, BorderLayout.NORTH);
		add(bagels, BorderLayout.WEST);
		add(toppings, BorderLayout.CENTER);
		add(coffee, BorderLayout.EAST);
		add(buttonPanel, BorderLayout.SOUTH);
		
		// Pack the contents of the window and display it
		pack();
		setVisible(true);	
	}
	

	private void buildPanel()
	{
		// Create a panel for the buttons
		buttonPanel = new JPanel();
		
		// Create the buttons
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		
		// Register the action listeners.
		calcButton.addActionListener(new CalcButtonListener());
		exitButton.addActionListener(new ExitButtonListener());
		
		// Add the buttons to the button panel.
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}
	
	public class CalcButtonListener implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			double subTotal, tax, total;
			
			// Calculate the subtotal.
			subTotal = bagels.getBagelCost() + toppings.getToppingsCost() + coffee.getCostCoffee();
			
			tax = subTotal * TAX_RATE;
			
			total = subTotal + tax;
			JOptionPane.showMessageDialog(null, String.format("Subtotal: $%,.2f\n"
						+ "Tax: $%,.2f\nTotal: $%,.2f", subTotal, tax, total));

		}
	}	
	
	public class ExitButtonListener implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
		    System.exit(0);
		}
	}	


	public static void main(String[] args) 
	{
		 new OrderCalculatorGUI();
	}

}
