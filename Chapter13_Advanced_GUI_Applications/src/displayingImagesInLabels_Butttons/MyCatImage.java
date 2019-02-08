package displayingImagesInLabels_Butttons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCatImage extends JFrame
{
	// To hold the label
	private JPanel imagePanel;
	
	// To hold a button
	private JPanel buttonPanel;
	
	// To show an image
	private JLabel imageLabel;
	
	// To get an image
	private JButton button;
	
	public MyCatImage()
	{
		setTitle("My Cat");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		// Build the panels
		buildImagePanel();
		buildButtonPanel();
		
		// Add the panels to the content pane
		add(imagePanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		pack();
		setVisible(true);
	}

	private void buildButtonPanel() 
	{
		ImageIcon smileyImage;
		
		buttonPanel = new JPanel();
		
		// Get the smile face image
		smileyImage = new ImageIcon("Smiley.gif");
		
		// Create a button
		button = new JButton("Get Image");
		button.setIcon(smileyImage);
		
		
		// Register an action listener with the button
		button.addActionListener(new ButtonListener());
		
		buttonPanel.add(button);
	}

	private void buildImagePanel() 
	{
		imagePanel = new JPanel();
		imageLabel = new JLabel("Click the button to see an image of my cat.");
		imagePanel.add(imageLabel);
	}
	
	public class ButtonListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			// Read the image file into an ImageIcon object.
			ImageIcon catImage = new ImageIcon("Cat.jpg");
			
			// Display the image in the label
			imageLabel.setIcon(catImage);
			
			//Remove the text from the label
			imageLabel.setText(null);
			
			// Pack the frame again to accommodate the new size of the label
			pack();
		}

	}

	public static void main(String[] args) 
	{
		new MyCatImage();
	}
}
