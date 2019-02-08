package creatingAppletsWithSwing;

import javax.swing.*;
import java.awt.*;

public class SimpleApplet extends JApplet
{
	/**
	 * The init method sets up the applet, much like a constructor
	 */
	public void init()
	{
		// Creaete a label
		JLabel label = new JLabel("This is my very first applet.");
		
		// Set the layout manager
		setLayout(new FlowLayout());
		
		// Add the label to the content pane.
		add(label);
	}
}
