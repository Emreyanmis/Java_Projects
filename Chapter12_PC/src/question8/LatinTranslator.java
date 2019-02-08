package question8;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class LatinTranslator extends JFrame
{
	private JPanel panel;
	private JRadioButton sinisterButton;
	private JRadioButton dexterButton;
	private JRadioButton mediumButton;
	private ButtonGroup bg;
	
	private JLabel message;
	
	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 600;
	
	public LatinTranslator()
	{
		setTitle("Latin Translator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		add(panel);
		
		pack();
		setVisible(true);
	}
	
	private void buildPanel() 
	{
		sinisterButton = new JRadioButton("Sinister");
		dexterButton = new JRadioButton("Dexter");
		mediumButton = new JRadioButton("Medium");
		
		message = new JLabel("Pick a latin word!");
		
		bg = new ButtonGroup();
		bg.add(sinisterButton);
		bg.add(dexterButton);
		bg.add(mediumButton);
		
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		panel.add(message);
		panel.add(sinisterButton);
		panel.add(dexterButton);
		panel.add(mediumButton);
		
		sinisterButton.addActionListener(new ActionListeners());
		dexterButton.addActionListener(new ActionListeners());
		mediumButton.addActionListener(new ActionListeners());
	}
	
	public class ActionListeners implements ActionListener 
	{	

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(sinisterButton.isSelected())
				JOptionPane.showMessageDialog(null, "Left");
			if(dexterButton.isSelected())
				JOptionPane.showMessageDialog(null, "Right");
			if(mediumButton.isSelected())
				JOptionPane.showMessageDialog(null, "Center");				
		}
	}	

	public static void main(String[] args) 
	{
        new LatinTranslator();
	}

}
