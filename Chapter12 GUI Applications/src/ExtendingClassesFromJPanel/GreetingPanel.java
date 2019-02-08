package ExtendingClassesFromJPanel;

import javax.swing.*;

public class GreetingPanel extends JPanel
{
	private JLabel greeting;
	
	public GreetingPanel()
	{
		greeting = new JLabel("Welcome to Emre's Bagel House");
		
		// Add the label to this panel.
		add(greeting);
	}
}
