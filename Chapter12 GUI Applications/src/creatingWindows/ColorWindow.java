package creatingWindows;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorWindow extends JFrame
{
	private JPanel panel;
	private JButton redButton;
	private JButton yellowButton;
	private JButton blueButton;
	private JTextField messageLabel;
	
	// Window width 
    private final int WINDOW_WIDTH = 200;
    
    // Window height
    private final int WINDOW_HEIGHT = 125;
    
    public ColorWindow()
    {
    	setTitle("Colors");
    	
    	setSize(WINDOW_WIDTH, WINDOW_WIDTH);
    	
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	messageLabel = new JTextField("Click on your preferred color.");
    	
    	redButton = new JButton("Red");
    	blueButton = new JButton("Blue");
    	yellowButton = new JButton("Yellow");
    	
    	// Register an even listener with all 3 buttons
    	redButton.addActionListener(new redButton());
    	blueButton.addActionListener(new blueButton());
    	yellowButton.addActionListener(new yellowButton());
    	
    	// Create a panel and add the components to it
    	panel = new JPanel();
    	add(panel);
    	panel.add(messageLabel);
    	panel.add(redButton);
    	panel.add(blueButton);
    	panel.add(yellowButton);
    	
    	// Display the window
    	setVisible(true);
    	
    }
    
    public class redButton implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// Set the panel's background color to red.
			panel.setBackground(Color.RED);
			
			// Set the label's text to blue.
			panel.setForeground(Color.BLUE);
		}
	}	
    
    public class blueButton implements ActionListener
   	{

   		@Override
   		public void actionPerformed(ActionEvent e)
   		{
	   		// Set the panel's background color to blue.
			panel.setBackground(Color.BLUE);
			
			// Set the label's text to yellow.
			panel.setForeground(Color.YELLOW);	
   			
   		}
   	}	
    
    public class yellowButton implements ActionListener
   	{

   		@Override
   		public void actionPerformed(ActionEvent e)
   		{
   			// Set the panel's background color to yellow.
			panel.setBackground(Color.YELLOW);
			
			// Set the label's text to red.
			panel.setForeground(Color.RED);	
   			
   		}
   	}	
	

	public static void main(String[] args) 
	{
         new ColorWindow();
	}

}
