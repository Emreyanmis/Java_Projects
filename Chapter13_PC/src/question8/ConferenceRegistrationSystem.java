package question8;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;



import java.awt.*;
import java.awt.event.*;

public class ConferenceRegistrationSystem extends JFrame
{
	private JPanel registrationPanel, optionsPanel, workshopPanel, totalPanel;
	private JLabel  registrationLabel,optionsLabel, workshopLabel, totalOrderLabel,
					salesTaxLabel,subTotalLabel;
	private JTextField subTotalField, salesTaxField, totalOrderField;;
	private String[] registrationArray = {"Adult - $895.00", "Student - $495.00"},
				    optionsArray = {"Optional Openning Night Dinner With a Keynote Speech - $30.00",
				    				"None - $0"},
				    workshopArray  = {"Introduction to E-commerce - $295.00", 
				    				   "The Future of the Web - $295.00",
				    				   "Advanced Java Programming - $395.00", "Network Security - $395.00"};
	
	
	private JComboBox registrationBox, optionsBox, workshopBox;
	private JCheckBox I,T,A,N;
	private static double TOTAL1 = 0.0,	TOTAL2 = 0.00, tax, total;
	
	private JList list;
	private JScrollPane scroll;
	
	public ConferenceRegistrationSystem()
	{
		setTitle("Conference Registration System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,2));
		
		buildRegistrationPanel();
		buildOptionsPanel();
		buildWorkshopPanel();
		buildCalculatePanel();
		
		add(registrationPanel);
		add(optionsPanel);
		add(workshopPanel);
		add(totalPanel);
		
		pack();
		setVisible(true);
	}
	
	private void buildRegistrationPanel() 
	{
		registrationPanel = new JPanel();
		registrationPanel.setLayout(new GridLayout(1,2));
		
		registrationBox = new JComboBox(registrationArray);
		registrationBox.setSelectedItem(null);
		registrationBox.addActionListener(new ComboBoxListener());
		
		registrationLabel = new JLabel("Select the registration type:");
		
		registrationPanel.add(registrationLabel);
		registrationPanel.add(registrationBox);
	}

	private void buildOptionsPanel() 
	{
		optionsPanel = new JPanel();
		optionsPanel.setLayout(new GridLayout(1,2));
		optionsBox = new JComboBox(optionsArray);
		optionsBox.setSelectedItem(null);
		optionsBox.addActionListener(new ComboBoxListener());
		
		optionsLabel = new JLabel("Optional:");
		
		optionsPanel.add(optionsLabel);
		optionsPanel.add(optionsBox);
	}

	private void buildWorkshopPanel() 
	{
		workshopPanel = new JPanel();
		workshopPanel.setLayout(new GridLayout(4,2));

		
		I = new JCheckBox("Introduction to E-commerce - $295.00");
		T = new JCheckBox("The Future of the Web - $295.00");
		A = new JCheckBox("Advanced Java Programming - $395.00");
		N = new JCheckBox("Network Security - $395.00");
		JLabel a = new JLabel(" ");
		
		I.addActionListener(new ComboBoxListener());
		T.addActionListener(new ComboBoxListener());
		A.addActionListener(new ComboBoxListener());
		N.addActionListener(new ComboBoxListener());
		workshopLabel = new JLabel("Select as many workshops:");
	
		workshopPanel.add(workshopLabel);
		workshopPanel.add(a);
		workshopPanel.add(I);
		workshopPanel.add(T);
		workshopPanel.add(A);
		workshopPanel.add(N);
	}

	private void buildCalculatePanel() 
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
			String registrationCost, optionsCost, subTotal, reg;
			
			
			registrationCost = (String) registrationBox.getSelectedItem();
			
			optionsCost = (String) optionsBox.getSelectedItem();
			
			
			if(registrationCost.startsWith("A"))
				TOTAL1 += 895.00;
			else if(registrationCost.startsWith("S"))
				TOTAL1 += 495.00;
			
			if(optionsCost.startsWith("O"))
				TOTAL1 += 30.00;
			else if(optionsCost.startsWith("N"))
				TOTAL1 += 0.00;
			
			if(I.isSelected())
				TOTAL1 += 295.00;
			else if(T.isSelected())
				TOTAL1 += 295.00;
			else if(A.isSelected())
				TOTAL1 += 395.00;
			else if(N.isSelected())
				TOTAL1 += 395.00;
			
			
			subTotalField.setText(String.valueOf(TOTAL1));
			tax = (TOTAL1) * 0.06;
			total = tax + TOTAL1;
			
			salesTaxField.setText(String.format("$%,.2f",tax));
			totalOrderField.setText(String.format("$%,.2f",total));
		}
	}	
	
	

	public static void main(String[] args) 
	{
		new ConferenceRegistrationSystem();
	}
}
