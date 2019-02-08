package question9;

import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DiceSimulator extends JFrame
{
	private JPanel dice1Panel, dice2Panel, calculatePanel;
	private JButton rollButton ,dice1Button, dice2Button;
	private JLabel messageLabel;
	private static int value1, value2;
	private JLabel imageLabel1, imageLabel2;
	private Random rand;
	private ImageIcon image1, image2;
	
	// Window width 
    private final int WINDOW_WIDTH = 120;
    
    // Window height
    private final int WINDOW_HEIGHT = 200;
	
	public DiceSimulator()
	{
		setTitle("Dice Simulator");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	   
	    calculatePanel = new JPanel();
	    calculatePanel.setLayout(new GridLayout(3,1));
        calculatePanel.setLayout(new BorderLayout());
    
		
        image1 = new ImageIcon("Die3.png");
		image2 = new ImageIcon("Die4.png");
		
		
		//imageLabel1.setIcon(image1);
		//imageLabel2.setIcon(image2);
		
		dice1Button = new JButton();
		dice1Button.setIcon(image1);
		
		dice2Button = new JButton();
		dice2Button.setIcon(image2);
		
		rollButton = new JButton("Roll the Dice");
		rollButton.addActionListener(new ActionListener1());
		
		//calculatePanel.add(imageLabel1);
		//calculatePanel.add(imageLabel2);
		calculatePanel.add(dice1Button,BorderLayout.WEST);
		calculatePanel.add(dice2Button,BorderLayout.EAST);
		calculatePanel.add(rollButton, BorderLayout.SOUTH);
		
		add(calculatePanel);
		
		pack();
		setVisible(true);
	}


	public class ActionListener1 implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			rand = new Random();
			value1 = rand.nextInt(6) + 1;
			value2 = rand.nextInt(6) + 1;
			
			ImageIcon n1 = new ImageIcon("Die1.png");
			ImageIcon n2 = new ImageIcon("Die2.png");
			ImageIcon n3 = new ImageIcon("Die3.png");
			ImageIcon n4 = new ImageIcon("Die4.png");
			ImageIcon n5 = new ImageIcon("Die5.png");
			ImageIcon n6 = new ImageIcon("Die6.png");
		
					
			if(value1 == 1 )
				dice1Button.setIcon(n1);
			else if(value1 == 2 )
				dice1Button.setIcon(n2);
			else if(value1 == 3)
				dice1Button.setIcon(n3);
			else if(value1 == 4)
				dice1Button.setIcon(n4);
			else if(value1 == 5)
				dice1Button.setIcon(n5);
			else if(value1 == 6)
				dice1Button.setIcon(n6);
		
			
			if(value2 == 1)
				dice2Button.setIcon(n1);
			else if(value2 == 2)
				dice2Button.setIcon(n2);
			else if(value2 == 3)
				dice2Button.setIcon(n3);
			else if(value2 == 4)
				dice2Button.setIcon(n4);
			else if(value2 == 5)
				dice2Button.setIcon(n5);
			else if(value2 == 6)
				dice2Button.setIcon(n6);
			
			calculatePanel.add(dice1Button);
			calculatePanel.add(dice2Button);
		}
	}
	
	public static void main(String[] args) 
	{
		new DiceSimulator();
	}
}
