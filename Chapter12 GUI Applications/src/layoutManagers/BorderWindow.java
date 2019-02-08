package layoutManagers;

// Needed for the Swing classes
import javax.swing.*;

// Needed for the FlowLayout class
import java.awt.*;

public class BorderWindow extends JFrame
{

	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;

	public BorderWindow()
	{
		setTitle("Border Layout");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("North Button");
		button2 = new JButton("East Button");
		button3 = new JButton("South Button");
		button4 = new JButton("West Button");
		button5 = new JButton("Center Button");
		
		add(button1, BorderLayout.NORTH);
		add(button2, BorderLayout.EAST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.WEST);
		add(button5, BorderLayout.CENTER);
			
			
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new BorderWindow();
	}

}
