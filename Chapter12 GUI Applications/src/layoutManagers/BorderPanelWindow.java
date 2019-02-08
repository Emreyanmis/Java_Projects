package layoutManagers;

//Needed for the swing classes
import javax.swing.*;
	
// Needed for the Border Layout classes
import java.awt.*;
	

public class BorderPanelWindow extends JFrame
{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	
	// Window width
	private final int WINDOW_WIDTH = 400;  
	
	// Window height
	private final int WINDOW_HEIGHT = 300;
	
	public BorderPanelWindow ()
	{
		setTitle("Border Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create five panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		// Create five buttons
	    button1 = new JButton("Norh Region");
	    button2 = new JButton("East Region");
	    button3 = new JButton("South Region");
	    button4 = new JButton("West Region");
	    button5 = new JButton("Center Region");
	    
	    
	    // Add buttons to the panels
	    panel1.add(button1);
	    panel2.add(button2);
	    panel3.add(button3);
	    panel4.add(button4);
	    panel5.add(button5);
	    
	    
	    add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.WEST);
		add(button5, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new BorderPanelWindow();

	}

}
