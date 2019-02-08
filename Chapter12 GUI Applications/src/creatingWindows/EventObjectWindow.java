package creatingWindows;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventObjectWindow extends JFrame
{
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	
	private JPanel panel;
	
	private final int WINDOW_WIDTH = 300;
	private final int WINDOW_HEIGHT = 70;
	
    public EventObjectWindow()
    {
    	setTitle("Event Object Demonstration");
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	button1 = new JButton("Button 1");
    	button2 = new JButton("Button 2");
    	button3 = new JButton("Button 3");
    	
    	button1.addActionListener(new ButtonListener());
    	button2.addActionListener(new ButtonListener());
    	button3.addActionListener(new ButtonListener());
    	
    	
    	panel = new JPanel();
    	add(panel);
    	panel.add(button1);
    	panel.add(button2);
    	panel.add(button3);
    	
    	
    	
    	setVisible(true);
    }
	
    public class ButtonListener implements ActionListener
   	{

   		@Override
   		public void actionPerformed(ActionEvent e)
   		{
   			// Get the action Command
   			String actionCommand = e.getActionCommand();
   			
   			// Determine which button was clicked and display a message
   			if(actionCommand.equals("Button 1"))
   				JOptionPane.showMessageDialog(null, "You clicked the first button");
   			else if(actionCommand.equals("Button 2"))
   				JOptionPane.showMessageDialog(null, "You clicked the second button");
   			else if(e.getSource() == button3)
   				JOptionPane.showMessageDialog(null, "You clicked the third button");
   			
   		}
   	}	
	
	public static void main(String[] args) 
	{
		new EventObjectWindow();
	}

}
