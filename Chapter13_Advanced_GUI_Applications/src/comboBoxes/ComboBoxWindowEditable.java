package comboBoxes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ComboBoxWindowEditable extends JFrame
{
	private JLabel message;
	private JTextField input;
	private JPanel coffeePanel;
	private JPanel selectedCoffeePanel;
	private JComboBox coffeeBox;
	
	private String[] coffees = {"Regular Coffee", "Dark Roast", "Cappuccino", "Espresso", "Decaf"}; 
	
	private ComboBoxWindowEditable()
	{
		setTitle("Combo Box Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		buildCoffeePanel();
		buildSelectedCoffeePanel();
		
		// Add the panels to the content pane
		add(coffeePanel, BorderLayout.CENTER);
		add(selectedCoffeePanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}

	private void buildCoffeePanel() 
	{
		coffeePanel = new JPanel();
		
		// Create the combo box
		coffeeBox = new JComboBox(coffees);
		
		// Register an action listener
		coffeeBox.addActionListener(new ComboBoxListener());
		
		// Add the combo box to the panel.
		coffeePanel.add(coffeeBox);
	}

	private void buildSelectedCoffeePanel() 
	{
		selectedCoffeePanel = new JPanel();
		message = new JLabel("You selected:");
		input = new JTextField(10);
		input.setEditable(true);
		
		// Add the label and text field to the panel
		selectedCoffeePanel.add(message);
		selectedCoffeePanel.add(input);	
	}
	
	public class ComboBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// Get the selected coffee
			String selection = (String) coffeeBox.getSelectedItem();
			
			// Display the selected coffee in the text field
			input.setText(selection);
		}

	}
	public static void main(String[] args) 
	{
		new ComboBoxWindowEditable();
	}
}
