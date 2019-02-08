package layoutManagers;

import javax.swing.*;
import java.awt.*;

public class GridWindow extends JFrame
{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	public GridWindow()
	{
		setTitle("Grid Layout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(2,3));
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		button6 = new JButton("Button 6");
		
		
		add(button1); // r#1, c#1
		add(button2); // r#1, c#2
		add(button3); // r#2, c#1
		add(button4); // r#2, c#2
		add(button5); // r#3, c#1
		add(button6); // r#3, c#2
		

		setVisible(true);
	}
	
	
	public static void main(String[] args) 
	{
		new GridWindow();
	}

}
