package creatingWindows;

import javax.swing.*;

public class KiloConverter extends JFrame
{
	// To reference to a panel
	private JPanel panel;
	
	// To reference a label
	private JLabel messageLabel;
	
	// To reference a text label
	private JTextField kiloTextField;
	
	// To reference a button
	private JButton calcButton;
	
	// Window width
	private final int WINDOW_WIDTH = 310;
	
	// Window height
	private final int WINDOW_HEIGHT = 100;
	
	public KiloConverter()
	{
		// Set the window title
		setTitle("Kilometer Converter");
		
	    // Set the size of the window
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close button is closed.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Build the panel and add to the frame
		buildPanel();
		
		// Add the panel to the frame's content pane
		add(panel);
		
		// Display the window
		setVisible(true);
		
	}
	
	/**
	 *  The buildPanel method adds a label, a text field,
	 *  and button to a panel
	 */
	private void buildPanel() 
	{
		// Create a label to display instructions
		messageLabel = new JLabel("Enter a distance in kilometers");
		
		// Create text field 10 characters wide.
		kiloTextField = new JTextField(10);
		
		// Create a button with the caption "Calculate"
		calcButton = new JButton("Calculate");
		
		// Create a JPanel object and let the panel field reference it.
		panel = new JPanel();
		
		// Add the label, text field, and button components to the panel
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);	
		
	}

	/*
	 * Main method
	 */
	public static void main(String[] args)
	{
		new KiloConverter();
	}

}
