package question10;

import java.awt.*;
import javax.swing.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardDealer extends JFrame
{
	private JPanel calculatePanel;
	private JButton dealButton ,card1Button, card2Button;
	private static int value1, value2;
	private Random rand;
	private ImageIcon image1, image2;

	// Window width 
    private final int WINDOW_WIDTH = 120;
    
    // Window height
    private final int WINDOW_HEIGHT = 200;
    
    public CardDealer()
    {
    	setTitle("Dice Simulator");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	    calculatePanel = new JPanel();
        calculatePanel.setLayout(new BorderLayout());
        
        image1 = new ImageIcon("10_Clubs.jpg");
		image2 = new ImageIcon("10_Diamonds.jpg");
		
		card1Button = new JButton();
		card1Button.setIcon(image1);
		
		card2Button = new JButton();
		card2Button.setIcon(image2);
		
        
        
        
        
    }

	public static void main(String[] args) 
	{
		
	}

}
