package creatingWindows;

// Needed for the Swing classes
import javax.swing.*;

public class ShowWindow 
{

	public static void main(String[] args) 
	{
		// Window width in pixels
		final int WINDOW_WIDTH = 350;
		
		// Window height in pixels
		final int WINDOW_HEIGHT = 250;
		
		// Create a window
		JFrame window = new JFrame();
		
		// Set the title
		window.setTitle("A Simple Window");
		
		// Set the size of the Window
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		// Specify what happens when the close buttin is clicked
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Display the window
		window.setVisible(true);

	}

}
