package question10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusToFahrenheit extends JFrame
{
	private JPanel panel;
	private JLabel celsiusMessage;
	private JTextField celsiusInput;

	private JRadioButton convertButton;
	private JRadioButton exitButton;
	private ButtonGroup bg;
	
	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 600;
	
	public CelsiusToFahrenheit()
	{
		setTitle("Celsius to Fahrenheit");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		
		pack();
		setVisible(true);
	}
	
	private void buildPanel() 
	{
		celsiusMessage = new JLabel("Enter the temperature in celsius:");
		celsiusInput = new JTextField(3);
		convertButton = new JRadioButton("Convert");
		exitButton = new JRadioButton("Exit");
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		panel.add(celsiusMessage);
		panel.add(celsiusInput);
		panel.add(convertButton);
		panel.add(exitButton);
		
		bg = new ButtonGroup();
		bg.add(convertButton);
		bg.add(exitButton);
		
		convertButton.addActionListener(new ActionListeners());
		exitButton.addActionListener(new ActionListeners());
	
		
	}
	public class ActionListeners implements ActionListener 
	{	
		double total = 0.0;
		@Override
		public void actionPerformed(ActionEvent e) 
		{
		   if(convertButton.isSelected())
		   {	
			    double C;
			    int F;
			    
			    C = Double.parseDouble(celsiusInput.getText());
			    F = (int) ((9 / 5) * C + 32);
			    JOptionPane.showMessageDialog(null, 
						   String.format("Fahrenheit: %,d", F));  
			    
				  System.exit(0);	
		   }	
		   else if(exitButton.isSelected())
			   System.exit(0);	
		 }
	 }	

	public static void main(String[] args) 
	{
		new CelsiusToFahrenheit();
	}
}
