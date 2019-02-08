package question4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SkateboardDesigner extends JFrame
{
	private JLabel decksLabel, truckLabel, wheelsLabel, miscellaneousLabel, subTotalLabel, salesTaxLabel,
				   totalOrderLabel;
	private JTextField selectedDecksField, selectedTruckField, selectedWheelsField, 
					   selectedmiscellaneousField, subTotalField, salesTaxField, totalOrderField;
	private JComboBox decksBox, truckBox, wheelsBox, miscellaneousBox;
	private JPanel decksPanel, truckPanel, wheelsPanel, miscellaneousPanel, totalPanel; 
	private String[] decks = {"The Master Thrasher - $60", "The Dictator - $45", "The Street King - $50"},
					 truck = {"7.75 inch axle - $40", "8 inch axle - $40", "8.5 inch axle - $45"},
					 wheels = {"51 mm - $20", "55 mm - $22", "58 mm - $24 ", "61 mm - $28"},
					 miscellaneous = {"Grip tape: $10", "Bearings: $30", "Riser pads: $2", 
									  "Nuts & bolts kit: $3","None"};
	
	public SkateboardDesigner()
	{
		setTitle("Skateboard Designer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(6,2));
		
		buildDecksPanel();
		buildTruckLabel();
		buildWheelsPanel();
		buildMiscellaneousPanel();
		buildTotalPanel();
		
		// Add the panels to the content pane
		add(decksPanel);
		add(truckPanel);
		add(wheelsPanel);
		add(miscellaneousPanel);
		add(totalPanel);
		
			
		pack();
		setVisible(true);
	}

	private void buildDecksPanel() 
	{
		decksPanel = new JPanel();
		decksLabel = new JLabel("Select a deck:");
		decksBox = new JComboBox(decks);
		decksBox.setSelectedItem(null);
		decksBox.addActionListener(new ComboBoxListener());	
		
		selectedDecksField = new JTextField(10);
		selectedDecksField.setEditable(false);
		
		decksPanel.add(decksLabel);
		decksPanel.add(decksBox);
		decksPanel.add(selectedDecksField);
				
	}

	private void buildTruckLabel() 
	{
		truckPanel = new JPanel();
		truckLabel = new JLabel("Select a truck:");
		truckBox = new JComboBox(truck);
		truckBox.setSelectedItem(null);
		truckBox.addActionListener(new ComboBoxListener());
		
		selectedTruckField = new JTextField(10);
		selectedTruckField.setEditable(false);
		
		truckPanel.add(truckLabel);
		truckPanel.add(truckBox);
		truckPanel.add(selectedTruckField);		
	}

	private void buildWheelsPanel()
	{
		wheelsPanel = new JPanel();
		wheelsLabel = new JLabel("Select a wheel:");
		wheelsBox = new JComboBox(wheels);
		wheelsBox.setSelectedItem(null);
		wheelsBox.addActionListener(new ComboBoxListener());
		selectedWheelsField = new JTextField(10);
		selectedWheelsField.setEditable(false);

		
		wheelsPanel.add(wheelsLabel);
		wheelsPanel.add(wheelsBox);
		wheelsPanel.add(selectedWheelsField);
	}

	private void buildMiscellaneousPanel() 
	{	
		miscellaneousPanel = new JPanel();
		miscellaneousLabel = new JLabel("Select a miscellaneous prdocuts and services:");
		miscellaneousBox = new JComboBox(miscellaneous);
		miscellaneousBox.setSelectedItem(null); 
		miscellaneousBox.addActionListener(new ComboBoxListener());
		selectedmiscellaneousField = new JTextField(20);
		selectedmiscellaneousField.setEditable(false);
		
		miscellaneousPanel.add(miscellaneousLabel);
		miscellaneousPanel.add(miscellaneousBox);
		miscellaneousPanel.add(selectedmiscellaneousField);
	}
	
	private void buildTotalPanel() 
	{
		totalPanel = new JPanel();
		
		subTotalLabel = new JLabel("The subtotal: $");
		subTotalField =  new JTextField(10);
		subTotalField.setEditable(false);
		
		salesTaxLabel = new JLabel("The tax: $");
		salesTaxField = new JTextField(10);
		salesTaxField.setEditable(false);
		
		totalOrderLabel = new JLabel("The total: $");
		totalOrderField =  new JTextField(10);
		totalOrderField.setEditable(false);
		
		totalPanel.add(subTotalLabel);
		totalPanel.add(subTotalField);
		totalPanel.add(salesTaxLabel);
		totalPanel.add(salesTaxField);
		totalPanel.add(totalOrderLabel);
		totalPanel.add(totalOrderField);	
	}
	
	public class ComboBoxListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String decksCost, truckCost, wheelsCost, miscellaneousCost, subTotal;
			double TOTAL1 = 0.0, tax, total;
			
			
			decksCost = (String) decksBox.getSelectedItem();
			
			truckCost = (String) truckBox.getSelectedItem();
			
			wheelsCost = (String) wheelsBox.getSelectedItem();
			
			miscellaneousCost = (String) miscellaneousBox.getSelectedItem();
			
			if(decksCost.endsWith("60"))
			{	
				TOTAL1 += 60;
				selectedDecksField.setText("Deck Cost: $60");
				
			}	
			else if(decksCost.endsWith("45"))
			{	
				TOTAL1 += 45;
				selectedDecksField.setText("Deck Cost: $45");
				
			}	
			else if(decksCost.endsWith("50"))
			{	
				TOTAL1 += 50;
				selectedDecksField.setText("Deck Cost: $50");		
			}	
			
			
			if(truckCost.startsWith("7"))
			{	
				TOTAL1 += 40;
				selectedTruckField.setText("Truk Cost: $40");
				
			}	
			else if(truckCost.startsWith("8 "))
			{	
				TOTAL1 += 40;
				selectedTruckField.setText("Truk Cost: $40");
			}	
			else if(truckCost.startsWith("8.5"))
			{	
				TOTAL1 += 45;
				selectedTruckField.setText("Truk Cost: $45");
			}
			
			if(wheelsCost.startsWith("51"))
			{	
				TOTAL1 += 20;
				selectedWheelsField.setText("Wheels Cost: $20");
				
			}	
			else if(wheelsCost.startsWith("55"))
			{	
				TOTAL1 += 22;
				selectedWheelsField.setText("Wheels Cost: $22");
			}	
			else if(wheelsCost.startsWith("58"))
			{	
				TOTAL1 += 24;
				selectedWheelsField.setText("Wheels Cost: $24");			
			}	
			else if(wheelsCost.startsWith("61"))
			{	
				TOTAL1 += 28;
				selectedWheelsField.setText("Wheels Cost: $61");
			}
			
			if(miscellaneousCost.startsWith("G"))
			{	
				TOTAL1 += 10;
				selectedmiscellaneousField.setText("Miscellanous field cost: $10");
			}	
			else if(miscellaneousCost.startsWith("B"))
			{	
				TOTAL1 += 30;
				selectedmiscellaneousField.setText("Miscellanous field cost: $30");
			}	
			else if(miscellaneousCost.startsWith("R"))
			{	
				TOTAL1 += 2;
				selectedmiscellaneousField.setText("Miscellanous field cost: $2");
			}	
			else if(miscellaneousCost.startsWith("Nuts"))
			{	
				TOTAL1 += 3;
				selectedmiscellaneousField.setText("Miscellanous field cost: $3");
			}	
			else if(miscellaneousCost.startsWith("None"))
			{	
				TOTAL1 += 0.0;
				selectedmiscellaneousField.setText("Miscellanous field cost: $0");
			}	
			
			
			subTotalField.setText(String.valueOf(TOTAL1));
			tax = TOTAL1 * 0.06;
			total = tax + TOTAL1;
			
			salesTaxField.setText(String.format("$%,.2f",tax));
			totalOrderField.setText(String.format("$%,.2f",total));
					
		}
	}	

	public static void main(String[] args) 
	{
		new SkateboardDesigner();
	}

}
