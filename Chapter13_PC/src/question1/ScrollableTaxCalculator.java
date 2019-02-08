package question1;

import javax.swing.*;
import javax.swing.event.*;



import java.awt.*;

public class ScrollableTaxCalculator extends JFrame
{
	private JLabel label1, label2, taxOnPurchase1;
	
	private JTextField purchase;
	private JTextField tax;
	private JTextField taxOnPurchase;
	
	private JPanel purchasePanel;
	private JPanel taxPanel;
	private JPanel taxOnPurchasePanel;
	
	private JPanel sliderPanel;
	
	// Tax adjuster
	private JSlider slider;
	
	public ScrollableTaxCalculator()
	{
		setTitle("Scrollable Tax Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label1 = new JLabel("Amount of purchase: $");
		label2 = new JLabel("Enter the tax rate: %");
		taxOnPurchase1 = new JLabel("Amount of sale tax $: ");
		
		// Create the read only text fields
		purchase = new JTextField(10);
		purchase.setEditable(true);
		tax = new JTextField(10);
		tax.setEditable(true);
		taxOnPurchase = new JTextField(10);
		taxOnPurchase.setEditable(false);
		
		// Create the slider
		slider = new JSlider(JSlider.HORIZONTAL, 0, 10, 0);
		slider.setMajorTickSpacing(5);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new SliderListener());
		
		purchasePanel = new JPanel();
		purchasePanel.add(label1);
		purchasePanel.add(purchase);
		
		taxPanel = new JPanel();
		taxPanel.add(label2);
		taxPanel.add(tax);
		
		taxOnPurchasePanel =  new JPanel();
		taxPanel.add(taxOnPurchase1);
		taxPanel.add(taxOnPurchase);
		
		sliderPanel = new JPanel();
		sliderPanel.add(slider);
		
		setLayout(new GridLayout(6, 1));
		add(purchasePanel);
		add(taxPanel);
		add(sliderPanel);
		add(taxOnPurchasePanel);
	
		
		pack();
		setVisible(true);
	}
	
	public class SliderListener implements ChangeListener
	{

		@Override
		public void stateChanged(ChangeEvent e) 
		{
			double tax1, purchase1, taxOnIt;
			
			tax1 = slider.getValue();
			purchase1 = Double.parseDouble(purchase.getText());
			taxOnIt = purchase1 *(tax1 / 100);
			
			
			tax.setText(Double.toString(tax1));
			
			purchase.setText(String.format("%,.2f", purchase1));
			
			taxOnPurchase.setText(String.format("%,.2f",taxOnIt));
		}

	}
	
	
	public static void main(String[] args)
	{
		new ScrollableTaxCalculator();
	}
}
