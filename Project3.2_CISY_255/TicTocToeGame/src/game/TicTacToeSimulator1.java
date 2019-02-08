package game;

import java.awt.*;
import javax.swing.*;

import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToeSimulator1 extends JFrame
{
	private JPanel calcualtePanel;
	private JRadioButton newGameButton, exitButton;
	private ButtonGroup bg, bg1;
	private int[][] array = new int [3][3];
	private static int i = 2;
	
	private JRadioButton label11, label12, label13, 
				         label21, label22, label23, 
				          label31,label32, label33;
	
	private static int value1,value2, value3,
						value4, value5,value6,
						value7, value8, value9;
	private static int value;
	
	// Window width 
    private final int WINDOW_WIDTH = 120;
    
    // Window height
    private final int WINDOW_HEIGHT = 200;
    private Random rand;
    private ImageIcon  o, x, x1, o1;
	
	public TicTacToeSimulator1()
	{
		setTitle("Dice Simulator1.1");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		x = new ImageIcon("X.png");
		o = new ImageIcon("O.png");
		
		x1 = new ImageIcon("e7.png");
		o1 = new ImageIcon("e7.png");
		
		calcualtePanel = new JPanel();
		calcualtePanel.setLayout(new GridLayout(4,3));
		JOptionPane.showMessageDialog(null, "Let's start with the first player('X')!");
		
		bg = new ButtonGroup();
		

		label11 = new JRadioButton();
		label12 = new JRadioButton();
		label13 = new JRadioButton();
		label21 = new JRadioButton();
		label22 = new JRadioButton();
		label23 = new JRadioButton();
		label31 = new JRadioButton();
		label32 = new JRadioButton();
		label33 = new JRadioButton();
		
		label11.setIcon(x1);
		label12.setIcon(o1);
		label13.setIcon(o1);
		label21.setIcon(x1);
		label22.setIcon(o1);
		label23.setIcon(x1);
		label31.setIcon(o1);
		label32.setIcon(x1);
		label33.setIcon(x1);
		
		bg1 = new ButtonGroup();
		bg1.add(label11);
		bg1.add(label12);
		bg1.add(label13);
		bg1.add(label21);
		bg1.add(label22);
		bg1.add(label23);
		bg1.add(label31);
		bg1.add(label32);
		bg1.add(label33);
		
		newGameButton = new JRadioButton("New Game");
		exitButton  = new JRadioButton("Exit Button");
		bg.add(newGameButton);
		bg.add(exitButton);
		newGameButton.addActionListener(new ActionListener1());	
		exitButton.addActionListener(new ActionListener1());
		label11.addActionListener(new ActionListener1());	
		label12.addActionListener(new ActionListener1());	
		label13.addActionListener(new ActionListener1());	
		label21.addActionListener(new ActionListener1());	
		label22.addActionListener(new ActionListener1());	
		label23.addActionListener(new ActionListener1());	
		label31.addActionListener(new ActionListener1());	
		label32.addActionListener(new ActionListener1());	
		label33.addActionListener(new ActionListener1());	
		
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
	
	public  class ActionListener1 implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
		    boolean choosen = true;
		    boolean b = false, a = false;
		    
		     
		 if(i % 2 == 0)
		 {	 
			 JOptionPane.showMessageDialog(null, "First player('X') \nSelect a square");
			 value = 1;
		 }	 
		 else if(i % 2 != 0)
		 {	 
			 JOptionPane.showMessageDialog(null, "Second player('O') \nSelect a square");
			 value = 0;
		 }	 
			 
		 
		  if(label11.isSelected() && (choosen) && value == 1)  
		  {	  
			     array[0][0] = 1;
		         choosen = false;
		         i++;
		    	 label11.setIcon(x);
		         
		  }            
		  else if(label11.isSelected() && (choosen) && value == 0)
		  {	 
			    array[0][0] = 0;
			    choosen = false;
		        i++;
		    	label11.setIcon(o);	
		   }
		    
		    	
		   
		    if(label12.isSelected() && (choosen) && value == 1)
		    {    	
		        array[0][1] = 1;
		        choosen = false;
		        i++;
		        label12.setIcon(x);
		    } 
		    else if(label12.isSelected() && (choosen) && value == 0)	
		    {	
		    	
		    	array[0][1] = 0;
		    	choosen = false;
			    i++;
		    	label12.setIcon(o);
		    }
		    
		  
		    if(label13.isSelected() && (choosen) && value == 1)
		    {	 	
		    	array[1][2] = 1;
		    	choosen = false;
			    i++;
			    label13.setIcon(x);
		    }	
		    else if(label13.isSelected() && (choosen) && value == 0)
		    {	
		    	array[1][2] = 0;
		    	choosen = false;
			    i++;
		    	label13.setIcon(o);
		    }	
		    
		
		    if(label21.isSelected() && (choosen) && value == 1)
		    {	
		    	array[1][0] = 1;
		    	choosen = false;
			    i++;
			    label21.setIcon(x);
		    }	
		    else if(label21.isSelected() && (choosen) && value == 0)
		    {	
		    	array[1][0] = 0;
		    	choosen = false;
			    i++;
			    label21.setIcon(o);
		    }
		    
		    if(label22.isSelected() && (choosen) && value == 1)
		    {	
		    	array[1][1] = 1;
		    	choosen = false;
			    i++;
			    label22.setIcon(x);
		    }	
		    else if(label22.isSelected() && (choosen) && value == 0)
		    {	
		    	array[1][1] = 0;
		    	choosen = false;
			    i++;
			   	label22.setIcon(o);
		    }	
		    
		    
		    if(label23.isSelected() && (choosen) && value == 1)
		    {	
		    	array[1][2] = 1;
		    	choosen = false;
			    i++;
			    label23.setIcon(x);
		    }	
		    else if(label23.isSelected() && (choosen) && value == 0)
		    {	
		    	array[1][2] = 0;
		    	choosen = false;
			    i++;
			    label23.setIcon(o);
		    }
		    
		   	
		    if(label31.isSelected() && (choosen) && value == 1)
		    {	
		    	array[2][0] = 1;
		    	choosen = false;
			    i++;
			    label31.setIcon(x);
		    }	
		    else if(label31.isSelected() && (choosen) && value == 0)
		    {	
		    	array[2][0] = 0;
		    	choosen = false;
			    i++;
		    	label31.setIcon(o);
		    }	
		    
		
		    if(label32.isSelected() && (choosen) && value == 1)
		    {	
		    	array[2][1] = 1;
		    	choosen = false;
			    i++;
			    label32.setIcon(x);
		    }	
		    else if(label32.isSelected() && (choosen) && value == 0)
		    {	
		    	array[2][1] = 0;
		    	choosen = false;
			    i++;
			    label32.setIcon(o);
		    }	
		    
		
		    if(label33.isSelected() && (choosen) && value == 1)
		    {	
		    	array[2][2] = 1;
		    	choosen = false;
			    i++;
			    label33.setIcon(x);
		    }	
		    else if(label33.isSelected() && (choosen) && value == 0)
		    {	
		    	array[2][2] = 0;
		    	choosen = false;
			    i++;
			    label33.setIcon(o);
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
		new TicTacToeSimulator1();
	}	
}