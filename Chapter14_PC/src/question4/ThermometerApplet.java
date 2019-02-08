package question4;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;

public class ThermometerApplet extends JFrame
{
	private JTextField temperatureField,cel;
	private JSlider slider;
	private JLabel label,cp;
    private JPanel fPanel, cPanel, sliderPanel;
    private double c = 0, f = 0;
    private double celsius, fahrenheit = 32.00;
    
    public ThermometerApplet()
    {
       setTitle("Thermometer Applet");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLayout(new GridLayout(3,1));
       
       buildfPanel();
       buildSliderPanel();
       
       
       add(fPanel);
       add(sliderPanel);
       
       pack();
       setVisible(true);
       
    }

	private void buildfPanel() 
	{
		fPanel = new JPanel();
		fPanel.setLayout(new BorderLayout());
		label = new JLabel("Fahrenheit: ");
		temperatureField = new JTextField("32.00",5);
		temperatureField.setEditable(false);
		
		fPanel.add(label,BorderLayout.WEST);
		fPanel.add(temperatureField,BorderLayout.EAST);	
	}
	
	private void buildSliderPanel() 
	{
		sliderPanel = new JPanel();
		sliderPanel.setLayout(new BorderLayout());
		cp = new JLabel("Celcius:");
		cel =  new JTextField("0.00",5);
		cel.setEditable(false);
		
		slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.addChangeListener(new SliderListener());
		
		sliderPanel.add(cp, BorderLayout.WEST);
		sliderPanel.add(cel,BorderLayout.EAST);
		sliderPanel.add(slider, BorderLayout.AFTER_LAST_LINE);	
	}
	public class SliderListener implements ChangeListener
	{

		@Override
		public void stateChanged(ChangeEvent e) 
		{
			
			celsius = slider.getValue();
			fahrenheit = (9.0 / 5.0) * celsius + 32.00;
			
			cel.setText(Double.toString(celsius));
			temperatureField.setText(String.format("%,.1f", fahrenheit));
		}

	}
	
	public static void main(String[] args)
	{
		new ThermometerApplet();
	}
}
