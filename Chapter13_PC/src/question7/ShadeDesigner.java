package question7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShadeDesigner extends JFrame
{
	private JPanel stylesPanel, sizesPanel, colorsPanel, calculatePanel;
	private String[] stylesArray = {"Regular shades - $0","Folding shades - $10", "Roman shades - $15"},
					sizesArray = {"25 inches wide - $0", "27 inches wide - $2",
									"32 inches wide - $4", "40 inches wide - $6"},
					colorsArray = {"Natural - $5", "Blue - $0",  "Teal - $0", "Red - $0", "Green - $0"};
	
	private JComboBox stylesBox, sizesBox, colorsBox;
	private JLabel stylesLabel, selectedStylesLabel, sizesLabel, selectedSizesLabel, 
				   colorsLabel, selectedColorsLabel, subTotalLabel, taxLabel, totalLabel;
	private JTextField stylesField, sizesField, colorsField, subTotalField,
						taxField, totalField;
	
	private final double SALES_TAX = 0.06, BASE_FEE = 50.00;
	
	public ShadeDesigner()
	{
		setTitle("Shade Designer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,1));
		
		buildStylesPanel();
		buildSizesPanel();
		buildColorsPanel();
		buildCalculatePanel();
		
		add(stylesPanel);
		add(sizesPanel);
		add(colorsPanel);
		add(calculatePanel);
		
		pack();
		setVisible(true);
	}
	
	private void buildStylesPanel() 
	{
		stylesPanel = new JPanel();
		stylesPanel.setLayout(new GridLayout(3,3));
		
		stylesLabel = new JLabel("Select a style:");
		selectedStylesLabel =  new JLabel("Style Cost: $");
		stylesBox = new JComboBox(stylesArray);
		stylesBox.setSelectedItem(null);
		stylesBox.addActionListener(new ComboBoxListener());
		stylesField = new JTextField(10);
		stylesField.setEditable(false);	
		
		stylesPanel.add(stylesLabel);
		stylesPanel.add(stylesBox);
		stylesPanel.add(selectedStylesLabel);
		stylesPanel.add(stylesField);
	}

	private void buildSizesPanel() 
	{
		sizesPanel = new JPanel();
		sizesPanel.setLayout(new GridLayout(3,3));
		
		sizesLabel = new JLabel("Select a size :");
		selectedSizesLabel = new JLabel("Size Cost: $");
		sizesBox = new JComboBox(sizesArray);
		sizesBox.setSelectedItem(null);
		sizesBox.addActionListener(new ComboBoxListener());
	
		sizesField = new JTextField(10);
		sizesField.setEditable(false);
		
		sizesPanel.add(sizesLabel);
		sizesPanel.add(sizesBox);
		sizesPanel.add(selectedSizesLabel);
		sizesPanel.add(sizesField);
	}
	
	private void buildColorsPanel() 
	{
		colorsPanel = new JPanel();
		colorsPanel.setLayout(new GridLayout(3,3));
			
		colorsLabel = new JLabel("Select a color :");
		selectedColorsLabel = new JLabel("Color Cost: $");
		colorsBox = new JComboBox(colorsArray);
		colorsBox.setSelectedItem(null);
		colorsBox.addActionListener(new ComboBoxListener());
		
		colorsField = new JTextField(10);
		colorsField.setEditable(false);
			
		colorsPanel.add(colorsLabel);
		colorsPanel.add(colorsBox);
		colorsPanel.add(selectedColorsLabel);
		colorsPanel.add(colorsField);	
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
			String  stylesS, sizesS, colorsS;
			
			stylesS = (String) stylesBox.getSelectedItem();
			sizesS = (String) sizesBox.getSelectedItem(); 
			colorsS = (String) colorsBox.getSelectedItem(); 
			
			if(stylesS.startsWith("Re"))
			{
				TOTAL += 0.00;
				stylesField.setText("0.00");
			}	
			else if(stylesS.startsWith("F"))
			{
				TOTAL += 10.00;
				stylesField.setText("10.00");
			}
			else if(stylesS.startsWith("Ro"))
			{
				TOTAL += 15;
				stylesField.setText("15.00");
			}
			
			
			if(sizesS.startsWith("25"))
			{
				TOTAL += 0.00;
				sizesField.setText("0.00");
			}	
			else if(sizesS.startsWith("27"))
			{
				TOTAL += 2.00;
				sizesField.setText("2.00");
			}
			else if(sizesS.startsWith("32"))
			{
				TOTAL += 4.00;
				sizesField.setText("4.00");
			}
			else if(sizesS.startsWith("40"))
			{
				TOTAL += 6.00;
				sizesField.setText("6.00");
			}
			
			
			if(colorsS.startsWith("N"))
			{
				TOTAL += 5.00;
				colorsField.setText("5.00");
			}	
			else if(colorsS.startsWith("B"))
			{
				TOTAL += 0.00;
				colorsField.setText("0.00");
			}
			else if(colorsS.startsWith("T"))
			{
				TOTAL += 0.0;
				colorsField.setText("0.0");
			}
			else if(colorsS.startsWith("R"))
			{
				TOTAL += 0.0;
				colorsField.setText("0.0");
			}
			else if(colorsS.startsWith("G"))
			{
				TOTAL += 0.0;
				colorsField.setText("0.0");
			}
			
			SUBTOTAL = TOTAL + BASE_FEE;
			TAX = SALES_TAX * SUBTOTAL;
			TOTAL_FINAL =  TAX + SUBTOTAL;
				
			subTotalField.setText(String.format("%,.2f", SUBTOTAL));
		
			taxField.setText(String.format("%,.2f", TAX));
			
			totalField.setText(String.format("%,.2f", TOTAL_FINAL));
			
		}
	}
	
	public static void main(String[] args)
	{
		new ShadeDesigner();
	}

}