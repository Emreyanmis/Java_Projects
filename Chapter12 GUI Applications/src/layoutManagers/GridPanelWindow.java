package layoutManagers;

import javax.swing.*;
import java.awt.*;

public class GridPanelWindow extends JFrame
{
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	
	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	
	// Window width
	private final int WINDOW_WIDTH = 400;  
	
	// Window height
	private final int WINDOW_HEIGHT = 300;
	
	public GridPanelWindow()
	{
		setTitle("Grid Layout");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 3));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel();
		
		button1 = new JButton("Button 1");
		button2 = new JButton("Button 2");
		button3 = new JButton("Button 3");
		button4 = new JButton("Button 4");
		button5 = new JButton("Button 5");
		button6 = new JButton("Button 6");
		
		label1 = new JLabel("This is cell 1");
		label2 = new JLabel("This is cell 2");
		label3 = new JLabel("This is cell 3");
		label4 = new JLabel("This is cell 4");
		label5 = new JLabel("This is cell 5");
		label6 = new JLabel("This is cell 6");
		
		panel1.add(label1);
		panel2.add(label2);
		panel3.add(label3);
		panel4.add(label4);
		panel5.add(label5);
		panel6.add(label6);
		
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
		panel4.add(button4);
		panel5.add(button5);
		panel6.add(button6);
			
		add(panel1);
		add(panel2);
		add(panel3);
		add(panel4);
		add(panel5);
		add(panel6);
		
		setVisible(true);
	}
 
	
	public static void main(String[] args) 
	{
		new GridPanelWindow();
	}

}
