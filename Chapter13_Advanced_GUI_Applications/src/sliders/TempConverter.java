package sliders;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TempConverter extends JFrame
{
	// Message labels
	private JLabel label1, label2;
	
	// Fahrenheit temp
	private JTextField fahrenheitTemp; 
	
	// Celsius temp
	private JTextField celsiusTemp;
	
	// Fahrenhiet panel
	private JPanel fpanel;
	
	// Celsius panel
	private JPanel cpanel;
	
	// Slider panel
	private JPanel sliderPanel;
	
	// Temperature adjuster
	private JSlider slider;
	
	public TempConverter()
	{
		setTitle("Temperatures");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		label1 = new JLabel("Fahrenheit: ");
		label2 = new JLabel("Celsius: ");
		
		// Create the read only text fields
		fahrenheitTemp = new JTextField("32.00", 10);
		fahrenheitTemp.setEditable(false);
		celsiusTemp = new JTextField("0.0", 10);
		celsiusTemp.setEditable(false);
		
		// Create the slider
		slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new SliderListener());
		
		fpanel = new JPanel();
		fpanel.add(label1);
		fpanel.add(fahrenheitTemp);
		cpanel = new JPanel();
		cpanel.add(label2);
		cpanel.add(celsiusTemp);
		sliderPanel = new JPanel();
		sliderPanel.add(slider);
		
		setLayout(new GridLayout(3, 1));
		add(fpanel);
		add(cpanel);
		add(sliderPanel);
		
		pack();
		setVisible(true);
	}
	
	public class SliderListener implements ChangeListener
	{

		@Override
		public void stateChanged(ChangeEvent e) 
		{
			double celsius, fahrenheit;
			
			celsius = slider.getValue();
			fahrenheit = (9.0 / 5.0) * celsius + 32.00;
			
			celsiusTemp.setText(Double.toString(celsius));
			
			fahrenheitTemp.setText(String.format("%,.1f", fahrenheit));
		}

	}
	
	public static void main(String[] args) 
	{
		new TempConverter();
	}

}
