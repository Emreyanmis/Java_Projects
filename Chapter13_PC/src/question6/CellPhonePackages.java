package question6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CellPhonePackages extends JFrame
{
	private JPanel packagesPanel, phonesPanel, optionsPanel, calculatePanel;
	private String[] packagesArray = {"300 minutes per month: $45.00 per month", 
								 	  "800 minutes per month: $65.00 per month",
									  "1500 minutes per month: $99.00 per month"},
					phonesArray = {"Model 100: $29.95", "Model 110: $49.95", "Model 200: $99.95"},
					optionsArray = {"Voice mail: $5.00 per month", 
									"Text messaging: $10,00 per month","None"};
	
	private JComboBox packagesBox, phonesBox, optionsBox;
	private JLabel packagesLabel, selectedPackagesLabel, phoneLabel, selectedPhoneLabel, 
				  optionsLabel, selectedOptionsLabel, subTotalLabel, taxLabel, totalLabel;
	private JTextField packagesField, phonesField, optionsField, subTotalField,
						taxField, totalField;
	
	private final double SALES_TAX = 0.06;
	
	public CellPhonePackages()
	{
		setTitle("Cell Phone Packages");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,1));
		
		build1();
		buildPhonesPanel();
		buildOptionsPanel();
		buildCalculatePanel();
		
		add(packagesPanel);
		add(phonesPanel);
		add(optionsPanel);
		add(calculatePanel);
		
		
		pack();
		setVisible(true);
	}
	
	private void build1() 
	{
		packagesPanel = new JPanel();
		packagesPanel.setLayout(new GridLayout(3,3));
		
		packagesLabel = new JLabel("Select a package:");
		selectedPackagesLabel =  new JLabel("Package Cost: $");
		packagesBox = new JComboBox(packagesArray);
		packagesBox.setSelectedItem(null);
		packagesBox.addActionListener(new ComboBoxListener());
		packagesField = new JTextField(10);
		packagesField.setEditable(false);
		
		
		packagesPanel.add(packagesLabel);
		packagesPanel.add(packagesBox);
		packagesPanel.add(selectedPackagesLabel);
		packagesPanel.add(packagesField);
	}

	private void buildPhonesPanel() 
	{
		phonesPanel = new JPanel();
		phonesPanel.setLayout(new GridLayout(3,3));
		
		phoneLabel = new JLabel("Select a phone :");
		selectedPhoneLabel = new JLabel("Phone Cost: $");
		phonesBox = new JComboBox(phonesArray);
		phonesBox.setSelectedItem(null);
		phonesBox.addActionListener(new ComboBoxListener());
	
		phonesField = new JTextField(10);
		phonesField.setEditable(false);
		
		phonesPanel.add(phoneLabel);
		phonesPanel.add(phonesBox);
		phonesPanel.add(selectedPhoneLabel);
		phonesPanel.add(phonesField);
	}
	

	private void buildOptionsPanel() 
	{
		optionsPanel = new JPanel();
		optionsPanel.setLayout(new GridLayout(3,3));
			
		optionsLabel = new JLabel("Option desired :");
		selectedOptionsLabel = new JLabel("Option Cost: $");
		optionsBox = new JComboBox(optionsArray);
		optionsBox.setSelectedItem(null);
		optionsBox.addActionListener(new ComboBoxListener());
		
		optionsField = new JTextField(10);
		optionsField.setEditable(false);
		
		
		
		optionsPanel.add(optionsLabel);
		optionsPanel.add(optionsBox);
		optionsPanel.add(selectedOptionsLabel);
		optionsPanel.add(optionsField);
		
	}

	private void buildCalculatePanel() 
	{
		calculatePanel = new JPanel();
		calculatePanel.setLayout(new GridLayout(3,3));
		
		subTotalLabel = new JLabel("Subtotal: $");
		subTotalLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		taxLabel = new JLabel("Tax: $");
		taxLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		totalLabel = new JLabel("Total: $");
		totalLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
	
		
		subTotalField = new JTextField(10);
		subTotalField.setEditable(false);
		
		taxField = new JTextField(10);
		taxField.setEditable(false);
		
		totalField = new JTextField(10);
		totalField.setEditable(false);
		
		calculatePanel.add(subTotalLabel);
		calculatePanel.add(subTotalField);
		calculatePanel.add(taxLabel);
		calculatePanel.add(taxField);
		calculatePanel.add(totalLabel);
		calculatePanel.add(totalField);
		
	}
	
	public class ComboBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			double TOTAL = 0.0, TAX, SUBTOTAL, TOTAL_FINAL;
			String  packagesS, phonesS, optionsS;
			
			packagesS = (String) packagesBox.getSelectedItem();
			phonesS = (String) phonesBox.getSelectedItem(); 
			optionsS = (String) optionsBox.getSelectedItem(); 
			
			if(packagesS.startsWith("3"))
			{
				TOTAL += 45;
				packagesField.setText("45.00");
			}	
			else if(packagesS.startsWith("8"))
			{
				TOTAL += 65;
				packagesField.setText("65.00");
			}
			else if(packagesS.startsWith("1"))
			{
				TOTAL += 95;
				packagesField.setText("95.00");
			}
			
			
			if(phonesS.startsWith("Model 100"))
			{
				TOTAL += 29.95;
				phonesField.setText("29.95");
			}	
			else if(phonesS.startsWith("Model 110"))
			{
				TOTAL += 49.95;
				phonesField.setText("49.95");
			}
			else if(phonesS.startsWith("Model 200"))
			{
				TOTAL += 99.95;
				phonesField.setText("99.95");
			}
			
			
			if(optionsS.startsWith("V"))
			{
				TOTAL += 5.00;
				optionsField.setText("5.00");
			}	
			else if(optionsS.startsWith("T"))
			{
				TOTAL += 10.00;
				optionsField.setText("10.00");
			}
			else if(optionsS.startsWith("N"))
			{
				TOTAL += 0.0;
				optionsField.setText("0.0");
			}
			
			TAX = SALES_TAX * TOTAL;
			SUBTOTAL = TOTAL;
			TOTAL_FINAL =  TAX + SUBTOTAL;
			
				
			subTotalField.setText(String.format("%,.2f", SUBTOTAL));
		
			taxField.setText(String.format("%,.2f", TAX));
			
			totalField.setText(String.format("%,.2f", TOTAL_FINAL));
			
		}
	}
	
	public static void main(String[] args)
	{
		new CellPhonePackages();
	}

}
