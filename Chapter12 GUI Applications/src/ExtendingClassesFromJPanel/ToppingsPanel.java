 package ExtendingClassesFromJPanel;

import javax.swing.*;
import java.awt.*;

public class ToppingsPanel extends JPanel
{
	// The costs of each item
	private final double CREAM_CHEESE = 0.5;
	private final double BUTTER = 0.25;
	private final double PEACH_JELLY = 0.75;
	private final double BLUEBERRY_JAM = 0.75;
	
	// Radio Buttons of each item
	private JCheckBox creamCheeseButton;
	private JCheckBox butterButton;
	private JCheckBox peachJellyButton;
	private JCheckBox blueberryJamButton;
	

	public ToppingsPanel()
	{
	
		setLayout(new GridLayout(4, 1));
		
		creamCheeseButton = new JCheckBox("Cream Cheese");
		butterButton = new JCheckBox("Butter");
		peachJellyButton = new JCheckBox("Peach jelly");
		blueberryJamButton = new JCheckBox("Blueberry jam");
		
	
		
		// Add the radio buttons to the panel
		add(creamCheeseButton);
		add(butterButton);
		add(peachJellyButton);
		add(blueberryJamButton);
		
		 // Add a border around the panel
		 setBorder(BorderFactory.createTitledBorder("Toppings"));	
	}
	
	public double getToppingsCost()
	{
		double toppinsCost = 0.0;
		
		if(creamCheeseButton.isSelected())
			toppinsCost += CREAM_CHEESE;
		if(butterButton.isSelected())
			toppinsCost += BUTTER;
		if(peachJellyButton.isSelected())
			toppinsCost += PEACH_JELLY;
		if(blueberryJamButton.isSelected())
			toppinsCost += BLUEBERRY_JAM;
		return toppinsCost;
	}
}
