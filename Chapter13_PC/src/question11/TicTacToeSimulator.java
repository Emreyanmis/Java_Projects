package question11;

import java.awt.*;
import javax.swing.*;

import question9.DiceSimulator.ActionListener1;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeSimulator extends JFrame
{
	private JPanel calcualtePanel;
	private JRadioButton newGameButton, exitButton;
	private ButtonGroup bg;
	private int[][] array = new int [3][3];
	
	private JLabel label11, label12, label13, 
				    label21, label22, label23, 
				    label31,label32, label33;
	
	private static int value1,value2, value3,
						value4, value5,value6,
						value7, value8, value9;
	
	// Window width 
    private final int WINDOW_WIDTH = 120;
    
    // Window height
    private final int WINDOW_HEIGHT = 200;
    private Random rand;
    private ImageIcon  o, x, x1, o1;
	
	public TicTacToeSimulator()
	{
		setTitle("Dice Simulator");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		x1 = new ImageIcon("e7.png");
		o1 = new ImageIcon("e7.png");
		
		x = new ImageIcon("O.png");
		o = new ImageIcon("X.png");
		
		calcualtePanel = new JPanel();
		calcualtePanel.setLayout(new GridLayout(4,3));
		
		bg = new ButtonGroup();
		

		label11 = new JLabel();
		label12 = new JLabel();
		label13 = new JLabel();
		label21 = new JLabel();
		label22 = new JLabel();
		label23 = new JLabel();
		label31 = new JLabel();
		label32 = new JLabel();
		label33 = new JLabel();
		
		label11.setIcon(x1);
		label12.setIcon(o1);
		label13.setIcon(o1);
		label21.setIcon(x1);
		label22.setIcon(o1);
		label23.setIcon(x1);
		label31.setIcon(o1);
		label32.setIcon(x1);
		label33.setIcon(x1);
		
		
		newGameButton = new JRadioButton("New Game");
		exitButton  = new JRadioButton("Exit Button");
		bg.add(newGameButton);
		bg.add(exitButton);
		newGameButton.addActionListener(new ActionListener1());	
		exitButton.addActionListener(new ActionListener1());
		
		
		calcualtePanel.add(label11);
		calcualtePanel.add(label12);
		calcualtePanel.add(label13);
		calcualtePanel.add(label21);
		calcualtePanel.add(label22);
		calcualtePanel.add(label23);
		calcualtePanel.add(label31);
		calcualtePanel.add(label32);
		calcualtePanel.add(label33);
		calcualtePanel.add(newGameButton);
		calcualtePanel.add(exitButton);
		
		add(calcualtePanel);
		
		pack();
		setVisible(true);
		
	}
	
	public class ActionListener1 implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
		    
		    rand = new Random();
		    value1 = rand.nextInt(2);
		    boolean b = false, a = false;
		    
		  
		     if(value1 == 1)
		     {
		    	 label11.setIcon(x);
		    	 label11.setBorder(null);
		         array[0][0] = 1;
		     }   
		     else if(value1 == 0)
		     {	 
		    	label11.setIcon(o);
		    	label11.setBorder(null);
		    	array[0][0] = 0;
		     }	
		    	
		    value2 = rand.nextInt(2);	
		    
		    if(value2 == 1)
		    {
		    	label12.setIcon(x);
		        array[0][1] = 1;
		    } 
		    else if(value2 == 0)	
		    {	
		    	label12.setIcon(o);
		    	 array[0][1] = 0;
		    }
		    
		    value3 = rand.nextInt(2);
		    if(value3 == 1)
		    {	
		    	label13.setIcon(x);
		    	array[1][2] = 1;
		    }	
		    else if(value3 == 0)
		    {	
		    	label13.setIcon(o);
		    	array[1][2] = 0;
		    }	
		    
		    value4 = rand.nextInt(2); 
		    if(value4 == 1)
		    {	
		    	label21.setIcon(x);
		    	array[1][0] = 1;
		    }	
		    else if(value4 == 0)
		    {	
		    	label21.setIcon(o);
		    	array[1][0] = 0;
		    }
		    
		    value5 = rand.nextInt(2);	
		    if(value5 == 1)
		    {	
		    	label22.setIcon(x);
		    	array[1][1] = 1;
		    }	
		    else if(value5 == 0)
		    {	
		    	label22.setIcon(o);
		    	array[1][1] = 0;
		    }	
		    
		    value6 = rand.nextInt(2);	
		    if(value6 == 1)
		    {	
		    	label23.setIcon(x);
		    	array[1][2] = 1;
		    }	
		    else if(value6 == 0)
		    {	
		    	label23.setIcon(o);
		    	array[1][2] = 0;
		    }
		    
		    value7 = rand.nextInt(2);	
		    if(value7 == 1)
		    {	
		    	label31.setIcon(x);
		    	array[2][0] = 1;
		    }	
		    else if(value7 == 0)
		    {	
		    	label31.setIcon(o);
		    	array[2][0] = 0;
		    }	
		    
		    value8 = rand.nextInt(2);	
		    if(value8 == 1)
		    {	
		    	label32.setIcon(x);
		    	array[2][1] = 1;
		    }	
		    else if(value8 == 0)
		    {	
		    	label32.setIcon(o);
		    	array[2][1] = 0;
		    }	
		    
		    value9 = rand.nextInt(2);	
		    if(value9 == 1)
		    {	
		    	label33.setIcon(x);
		    	array[2][2] = 1;
		    }	
		    else if(value9 == 0)
		    {	
		    	label33.setIcon(o);
		    	array[2][2] = 0;
		    }	
		    
		    
		    if(array[0][0] == 1 && array[0][1] == 1 && array[0][2] == 1)
		    {	
		    	 b = true;
		    	 JOptionPane.showMessageDialog(null, "1x");
		    }	 
		    else if(array[1][0] == 1 && array[1][1] == 1 && array[1][2] == 1)
		    {	
		    	 b = true;
		    	 JOptionPane.showMessageDialog(null, "2x");
		    }	 
		    else if(array[2][0] == 1 && array[2][1] == 1 && array[2][2] == 1)
		    {	
		    	 b = true;
		    	 JOptionPane.showMessageDialog(null, "3x");
		    }	 
		    else if(array[0][0] == 1 && array[0][1] == 1 && array[0][2] == 1)
		    {	
		    	 b = true;
		    	 JOptionPane.showMessageDialog(null, "4x");
		    }	 	 
		    else if(array[0][1] == 1 && array[1][1] == 1 && array[2][1] == 1)
		    {	
		    	 b = true;
		    	 JOptionPane.showMessageDialog(null, "6x");
		    }	  
	        else if(array[0][0] == 1 && array[1][1] == 1 && array[2][2] == 1)
		    {	
		    	 b = true;
		    	 JOptionPane.showMessageDialog(null, "8x");
		    }
		    else if(array[0][2] == 1 && array[1][1] == 1 && array[2][0] == 1)
		    {	
		    	 b = true;
		    	 JOptionPane.showMessageDialog(null, "9x");
		    }
		    else if(array[2][0] == 1 && array[1][1] == 1 && array[0][2] == 1)
		    {	
		    	 b = true;
		    	 JOptionPane.showMessageDialog(null, "10x");
		    }
		    else if(array[0][2] == 1 && array[1][2] == 1 && array[2][2] == 1)
		    {	
		    	 b = true;
		    	 JOptionPane.showMessageDialog(null, "11x");
		    }
		    
		    
		    
		    if(array[0][0] == 0 && array[0][1] == 0 && array[0][2] == 0)
		    {	
		    	 a = true;
		    	 JOptionPane.showMessageDialog(null, "1");
		    }	 
		    else if(array[1][0] == 0 && array[1][1] == 0 && array[1][2] == 0)
		    {	
		    	 a = true;
		    	 JOptionPane.showMessageDialog(null, "2");
		    }	 
		    else if(array[2][0] == 0 && array[2][1] == 0 && array[2][2] == 0)
		    {	
		    	 a = true;
		    	 JOptionPane.showMessageDialog(null, "3");
		    }	 
		    else if(array[0][0] == 0 && array[0][1] == 0 && array[0][2] == 0)
		    {	
		    	 a = true;
		    	 JOptionPane.showMessageDialog(null, "4");
		    }	 	 
		    else if(array[0][1] == 0 && array[1][1] == 0 && array[2][1] == 0)
		    {	
		    	 a = true;
		    	 JOptionPane.showMessageDialog(null, "6");
		    }	  
		    else if(array[0][0] == 0 && array[1][1] == 0 && array[2][2] == 0)
		    {	
		    	 a = true;
		    	 JOptionPane.showMessageDialog(null, "8");
		    }
		    else if(array[0][2] == 0 && array[1][1] == 0 && array[2][0] == 0)
		    {	
		    	 a = true;
		    	 JOptionPane.showMessageDialog(null, "9");
		    }
		    else if(array[2][0] == 0 && array[1][1] == 0 && array[0][2] == 0)
		    {	
		    	 a = true;
		    	 JOptionPane.showMessageDialog(null, "10");
		    } 
		    else if(array[0][2] == 0 && array[1][2] == 0 && array[2][2] == 0)
		    {	
		    	 a = true;
		    	 JOptionPane.showMessageDialog(null, "11");
		    }
		    
		    if(a == true && b == true)
		    	JOptionPane.showMessageDialog(null, "Tie");
		    else if(a == false && b == false)
		    	JOptionPane.showMessageDialog(null, "Tie");
		    else if(b == false && a == true)
		    	JOptionPane.showMessageDialog(null, "O Wins!");
		    else if(a == false && b == true)
		    	JOptionPane.showMessageDialog(null, "X Wins!");
	
		}
	}	
	
	public static void main(String[] args) 
	{
		new TicTacToeSimulator();
	}
}
