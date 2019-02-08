package question6;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JoesAutomotive extends JFrame
{
	private JPanel panel;
	private JRadioButton calculateButton;
	private JRadioButton exitButton;
	private ButtonGroup bg;
	
	private JCheckBox oilChangeBox;
	private JCheckBox lubeJobBox;
	private JCheckBox radiatorBox;
	private JCheckBox transmissionFlush;
	private JCheckBox inspection;
	private JCheckBox mufflerReplacement;
	private JCheckBox tireRotation;
	
	private JLabel hour;
	private JTextField hourInput;
	
	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 600;
	
	public JoesAutomotive()
	{
		setTitle("Tekerci Sami");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		
		pack();
		setVisible(true);
	}

	private void buildPanel() 
	{
		calculateButton = new JRadioButton("Calculate");
		exitButton = new JRadioButton("Exit");
		bg = new ButtonGroup();
		bg.add(calculateButton);
		bg.add(exitButton);
		
		oilChangeBox = new JCheckBox("Oil change - $26.00");
		lubeJobBox = new JCheckBox("Lube job - $18.00");
		radiatorBox = new JCheckBox("Radiator flush - $30.00");
		transmissionFlush = new JCheckBox("Transmission flush - $80.00");
		inspection = new JCheckBox("Inspection - $15.00");
		mufflerReplacement = new JCheckBox("Muffer replacement - $100.00");
		tireRotation = new JCheckBox("Tire rotation - $20.00");
		
		hour = new JLabel("Enter the number of hours it took to complete it: ");
		hourInput =  new JTextField(3);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(12,1));
		panel.add(oilChangeBox);
		panel.add(lubeJobBox);
		panel.add(radiatorBox);
		panel.add(transmissionFlush);
		panel.add(inspection);
		panel.add(mufflerReplacement);
		panel.add(tireRotation);
		panel.add(hour);
		panel.add(hourInput);
		panel.add(calculateButton);
		panel.add(exitButton);
		
		calculateButton.addActionListener(new ActionListeners());
		exitButton.addActionListener(new ActionListeners());			
	}
	
	public class ActionListeners implements ActionListener 
	{	
		double total = 0.0;
		@Override
		public void actionPerformed(ActionEvent e) 
		{
		   if(calculateButton.isSelected())
		   {		   
			   if(oilChangeBox.isSelected())
				   total += 26.00;
			   if(lubeJobBox.isSelected())
			   	   total += 18.00;
			   if(radiatorBox.isSelected())
				   total += 30.00;
			   if(transmissionFlush.isSelected())
				   total += 80.00;
			   if(inspection.isSelected())
				   total += 15.00;
			   if(mufflerReplacement.isSelected())
				   total += 100.00;
			   if(tireRotation.isSelected())
				   total += 20.00;
			   if(Double.parseDouble(hourInput.getText()) > 0)
				   total += Double.parseDouble(hourInput.getText()) * 20;
			   
			  JOptionPane.showMessageDialog(null, 
					   String.format("The total fee amount: $%,.2f", total));
			  total = 0.0;
			  System.exit(0);	
		   }		   
		   else if(exitButton.isSelected())
		   {   
			   total = 0.0;
			   System.exit(0);	
		   }
		}
	}
	public static void main(String[] args) 
	{
		 new JoesAutomotive();
	}
}
