package ExtendingClassesFromJPanel;

import javax.swing.*;
import java.awt.*;

public class CoffePanel extends JPanel
{
	// Costs of the items
	private final double NONE = 0.00;
	private final double REGULAR_COFFEE = 2.50;
	private final double DECAF_COFFEE = 1.25;
	private final double CAPPUCCINO = 2.00;
	
	
	//radio buttons
	private JRadioButton noneButton;
	private JRadioButton regularCoffeButton;
	private JRadioButton decafCoffeeButton;
	private JRadioButton cappuccinoButton;
	
	// Button group
	private ButtonGroup bg;
	
	public CoffePanel()
	{
		setLayout(new GridLayout(4, 1));
		
		// Name the radio buttons
		noneButton = new JRadioButton("None");
		regularCoffeButton = new JRadioButton("Regular coffee");
		decafCoffeeButton = new JRadioButton("Decaf coffe");
		cappuccinoButton = new JRadioButton("Cappuccino");
		
		// Add the radio buttons to Button Group
		bg = new ButtonGroup();
		bg.add(noneButton);
		bg.add(regularCoffeButton);
		bg.add(decafCoffeeButton);
		bg.add(cappuccinoButton);
		
		add(noneButton);
		add(regularCoffeButton);
		add(decafCoffeeButton);
		add(cappuccinoButton);
		
		 // Add a border around the panel
		 setBorder(BorderFactory.createTitledBorder("Coffee"));	
	}
	
	public double getCostCoffee()
	{
		double coffeeCost = 0.0;
		
		if(noneButton.isSelected())
			coffeeCost = NONE;
		else if(regularCoffeButton.isSelected())
			coffeeCost = REGULAR_COFFEE;
		else if(decafCoffeeButton.isSelected())
			coffeeCost = DECAF_COFFEE;
		else if(cappuccinoButton.isSelected())
			coffeeCost = CAPPUCCINO;
		return coffeeCost;
	}
}
