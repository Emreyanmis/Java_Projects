package RadioButtons_CheckButtons;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CurrencyConverter extends JFrame
{
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField dollarTextField;
	private JRadioButton euroButton;
	private JRadioButton yenButton;
	private JRadioButton tlButton;
	private JRadioButton poundButton;
	private ButtonGroup  radioButtonGroup;
	
	private final int WINDOW_WIDTH = 400;
	private final int WINDOW_HEIGHT = 200;
	
	public CurrencyConverter()
	{
		setTitle("Currency Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		builPanel();
		add(panel);
		
		setVisible(true);
	}

	private void builPanel() 
	{
		messageLabel = new JLabel("Enter your balance in $: ");
		dollarTextField = new JTextField(10);
		
		// Radio Buttons
		euroButton = new JRadioButton("Conver to Euro");
		yenButton = new JRadioButton("Convert to Yen");
		tlButton = new JRadioButton("Convert to Tl");
		poundButton = new JRadioButton("Convert to Pound");
		
		// Group the radio buttons
		radioButtonGroup = new ButtonGroup();
		radioButtonGroup.add(euroButton);
		radioButtonGroup.add(yenButton);
		radioButtonGroup.add(tlButton);
		radioButtonGroup.add(poundButton);
		
		// Add the action listener to the radio buttons
		euroButton.addActionListener(new RadioButtonListener());
		yenButton.addActionListener(new RadioButtonListener());
		tlButton.addActionListener(new RadioButtonListener());
		poundButton.addActionListener(new RadioButtonListener());
		
		// Create a panel and add the components to it.
		panel = new JPanel();
		panel.add(dollarTextField);
		panel.add(euroButton);
		panel.add(messageLabel);
		panel.add(poundButton);
		panel.add(yenButton);
		panel.add(tlButton);
		
		
	}
	private class RadioButtonListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String input;
			String converTo = "";
			double result = 0.0;
			
			input = dollarTextField.getText();
			
			if(e.getSource() == euroButton)
			{
				converTo = " euoro";
				result = Double.parseDouble(input) * 1.1;
			}
			else if(e.getSource() == yenButton)
			{
				converTo = " yen";
				result = Double.parseDouble(input) * 0.08;
			}
			else if(e.getSource() == tlButton)
			{
				converTo = " tl";
				result = Double.parseDouble(input) * 0.2;
			}
			else if(e.getSource() == poundButton)
			{
				converTo = " pound";
				result = Double.parseDouble(input) * 0.8;
			}
			
			JOptionPane.showMessageDialog(null, input + " equals to" + 
								String.format(" %,.2f", result) + converTo);
			
		}
	}
	
}
