package question7;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class DrinkMachine extends JFrame
{
    private JPanel listPanel;
    private JPanel shoppingPanel;
    private JPanel buttonsPanel;
    private JList listItems;
	
	private JButton addButton;
	private JButton removeButton;
	private JButton clearButton;
	private JButton checkoutButton;
	
	private String[] listArray =  {"Cola - $0.75", "Lemon-Lime Soda - $0.75", "Grape Soda - $0.75",
									"Root Beer - $0.75", "Bottled Water - $0.75"};
	
	//Bu cartItems' a attigim itemler null olarak gozukuyor.
	// Line 111 ' a git ve istersen run et programi ne demek istedigimi anlayacaksin
	// Line 105 -111 arasinda debug icin bir kac cumle print out yaptim problemi bulmak icin -- cardItems calismiyor
	private List cartItems = new List();
	
	private final double salesTax = 0.06;

	public DrinkMachine() 
	{
		setTitle("Drink Machine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,3));
		setLocationRelativeTo(null);
		
		buildListPanel();
		buildShoppingPanel();
		buildButtonsPanel();
		
		add(listPanel);
		add(buttonsPanel);
		add(shoppingPanel);
			
		pack();
		setVisible(true);
	}
	
	
	private void buildListPanel() 
	{
		listPanel = new JPanel();
		listPanel.setLayout(new BorderLayout());
		listPanel.setBorder(BorderFactory.createEmptyBorder());
		
		JLabel label = new JLabel("Select A Drink");
		
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		listItems = new JList(listArray);
		listPanel.add(label, BorderLayout.NORTH);
		listPanel.add(listItems, BorderLayout.CENTER);	
	}


	private void buildShoppingPanel() 
	{
		shoppingPanel = new JPanel();
		shoppingPanel.setLayout(new BorderLayout());
		shoppingPanel.setBorder(BorderFactory.createEmptyBorder() );
		
		JLabel label1 = new JLabel("Card");
		
		label1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		shoppingPanel.add(label1,BorderLayout.NORTH);
		shoppingPanel.add(cartItems, BorderLayout.CENTER);
	}

	private void buildButtonsPanel() 
	{
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(new GridLayout(4,1));
		
		addButton = new JButton("Add To Card");
		addButton.addActionListener(new AddButtonListener());
		
		removeButton = new JButton("Remove From Card");
		removeButton.addActionListener(new RemoveButtonListener ());
		
		clearButton = new JButton("Clear Card");
		clearButton.addActionListener(new ClearButtonListener());
		
		checkoutButton = new JButton("Check Out");
		checkoutButton.addActionListener(new CheckoutButtonListener());

		buttonsPanel.add(addButton);
		buttonsPanel.add(removeButton);
		buttonsPanel.add(clearButton);
		buttonsPanel.add(checkoutButton);
		
		
	}
	public class AddButtonListener implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			 String value;
			 JOptionPane.showMessageDialog(null, "selected values: " + listItems.getSelectedValue());
			 value = (String) listItems.getSelectedValue();
			 cartItems.add(value);
			 JOptionPane.showMessageDialog(null, "selected values: " + cartItems.getSelectedItem());
		}

	}
	
	public class RemoveButtonListener implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			 String value;
			 value = (String) listItems.getSelectedValue();
			 cartItems.remove(value);
		}

	}
	
	public class CheckoutButtonListener implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			double totalCost = 0.0, costOfItem =  0.0;			
			
			JOptionPane.showMessageDialog(null, "cartItems: $" + cartItems);
			for(int j = 0; j < cartItems.getItemCount(); j++)
			{	
			   String[] cost = listArray[j].split("$");
			   
			   String title = (String) cost[0];
			   costOfItem = Double.parseDouble(cost[1]);
			   
			   for(int i = 0; i < cartItems.getItemCount(); i++ )
			   {
				   if(title.equals(cartItems.getItem(i)))
					   totalCost += costOfItem;
				   JOptionPane.showMessageDialog(null, "Total Cost: $" + totalCost);
				   
			   }
			}
			
			double tax = salesTax * totalCost;
			DecimalFormat myFormatter = new DecimalFormat("###.##");
			JOptionPane.showMessageDialog(null, "Total Cost: $" +
					myFormatter.format(tax + totalCost));
			
		}

	}
	
	public class  ClearButtonListener implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			 String value;
			 value = (String) listItems.getSelectedValue();
			 cartItems.removeAll();
		}

	}
	
	public static void main(String[] args) 
	{
		new DrinkMachine();
	}

}