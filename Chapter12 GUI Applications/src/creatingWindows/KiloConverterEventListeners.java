package creatingWindows;

// Needed for Swing class
import javax.swing.*;

// Needed for ActionListener Interface
import java.awt.event.*;

public class KiloConverterEventListeners extends JFrame
{
    // To reference a panel
	private JPanel panel;
	
	// To reference a label
	private JLabel messageLabel;
	
	// To reference text field
	private JTextField kiloTextField;
	
	// To reference a button
	private JButton calcButton;
	
	// Window width
	private final int WINDOW_WIDTH = 310;
	
	// Window height
	private final int WINDOW_HEIGHT = 100;
	
	/*
	 * Constructor
	 */
	public KiloConverterEventListeners()
	{
		// Set the window title
		setTitle("Kilometer converter");
		
		// Set the size of the window
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		// Specify what happens when the close button is clicked
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Build the panel to the frame's content pane
		buildPanel();
		
		// Add the panel to the frame's content pane.
		add(panel);
		
		// Display the window
		setVisible(true);
	}
	
	/**
	 * The builPanel method adds a label, a text field, and a button to a panel.
	 */
	private void buildPanel() 
	{
		// Create a label to display the instructions
		messageLabel = new JLabel("Enter a distance in kilometers:");
		
		// Create a text field 10 characters long
		kiloTextField = new JTextField(10);
		
		// Create a button with the caption "Calculate"
		calcButton = new JButton("Calculate");
		
		// Add an action listener to the button
		calcButton.addActionListener(new CalcButtonListener());
		
		// Create a JPanel object and let the panel field reference it
		panel = new JPanel();
		
		// Add the label, text field, and button components to the panel
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);
		
	}
	
	public class CalcButtonListener implements ActionListener  
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			final double CONVERSION = 0.6214;
			
			// To hold the user's input
			String input;
			
			// The number of miles
			double miles;
			
			// Get the text entered by the user into the text field
			input = kiloTextField.getText();
			
			// Convert the input to miles
			miles = Double.parseDouble(input) * CONVERSION;
			
			// Display the result
			JOptionPane.showMessageDialog(null, input + " kilometers is " + 
										  String.format(" %,.2f" , miles)  + " miles.");
			
		}

	}
	
	/**
	 * main method
	 */
	public static void main(String[] args)
	{
		new KiloConverterEventListeners();
	}

}
