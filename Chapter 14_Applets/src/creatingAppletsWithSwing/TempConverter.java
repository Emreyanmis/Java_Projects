package creatingAppletsWithSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JApplet
{
	 // To hold a text field 
	 private JPanel fPanel;
	 
	 // To hold a text field
	 private JPanel cPanel;
	 
	 // To hold a button
	 private JPanel buttonPanel;
	 
	 //Fahrenheit temperature
	 private JTextField fahrenheit;
	 
	 // Celsius temperature
	 private JTextField celcius;
	 
	 /**
	  *  init method
	  */
	 
	 public void init()
	 {
		 // Build the panels
		 buildFpanel();
		 buildCpanel();
		 buildButtonPanel();
		 
		 // Create a layout manager
		 setLayout(new GridLayout(3, 1));
		 
		 // Add the contents to the content pane.
		 add(fPanel);
		 add(cPanel);
		 add(buttonPanel);
		 
	 }
	 
	 private void buildFpanel() 
	 {
		 fPanel = new JPanel();
		 
		 JLabel message1 = new JLabel("Fahrenhiet Temperature:");
		 fahrenheit = new JTextField(10);
		 
		 fPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		 fPanel.add(message1);
		 fPanel.add(fahrenheit); 
	  }


	private void buildCpanel() 
	{
		 cPanel = new JPanel();
		 
		 JLabel message2 = new JLabel("Celcius Temperature:");
		 celcius = new JTextField(10);
		 celcius.setEditable(false);
		 
		 cPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		 cPanel.add(message2);
		 cPanel.add(celcius); 
	}
	
	private void buildButtonPanel() 
	{
		buttonPanel = new JPanel();
		
		JButton convButton = new JButton("Convert");
		
		convButton.addActionListener(new ButtonListener());
		
		buttonPanel.add(convButton);	
	}
	
	public class ButtonListener implements ActionListener 
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			double ftemp, ctemp;
		
			ftemp = Double.parseDouble(fahrenheit.getText());
			ctemp = (5.0 / 9.0) * (ftemp - 32);
		
			celcius.setText(String.format("%.1f", ctemp));
		}
	
	}
}
