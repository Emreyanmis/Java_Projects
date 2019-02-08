package creatingWindows;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Currency extends JFrame
{
	// To reference a panel
    private JPanel panel;
    
    // To reference a label
    private JLabel messageLabel;
    
    // To reference text field
    private JTextField euroTextField;
    
    // To reference a button
    private JButton convButton;
    
    // Window width 
    private final int WINDOW_WIDTH = 310;
    
    // Window height
    private final int WINDOW_HEIGHT = 100;
    
    /**
     *  Constructor
     */
    public Currency()
    {
    	// Set the title of the window
    	setTitle("Currency Converter");
    	
    	// Set the size of the window
    	setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
    	
    	// Specify what happens when the button is clicked
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	// Build the panel and add it to the frame
    	builPanel();
    	
    	// Add the panel to the frame's content pane.
    	add(panel);
    	
    	// Display the window
    	setVisible(true);
    	
    }
    

	private void builPanel() 
	{
		messageLabel = new JLabel("Enter the amount of $:");
		
		euroTextField = new JTextField(10);
		
		convButton = new JButton("Convert");
		convButton.setForeground(Color.RED);
		convButton.setBackground(Color.BLUE);
		
		convButton.addActionListener(new convButtonButton());
		
		panel = new JPanel();
		
		panel.add(convButton);
		panel.add(messageLabel);
		panel.add(euroTextField);
		
	}
	
	public class convButtonButton implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			final double CONVERSION = 1.13;
			String input;
			double euro;
			double dollar;
			
			input = euroTextField.getText();
			
			euro = Double.parseDouble(input) * CONVERSION;
			dollar = Double.parseDouble(input);
			
			JOptionPane.showMessageDialog(null,"$" + String.format("%,.2f ", dollar)  + " is equal to " 
										+ String.format("€%,.2f ", euro));

		}

	}


	public static void main(String[] args) 
	{
		new Currency();
	}

}
