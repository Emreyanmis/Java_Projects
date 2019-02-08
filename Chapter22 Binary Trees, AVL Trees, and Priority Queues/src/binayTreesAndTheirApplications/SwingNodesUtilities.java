package binayTreesAndTheirApplications;

/**
 * Graphical Display of Binary Trees Using Swing
 * This class is a utility for the graphical display 
 * of a binary tree using Swing.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.color.*;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingNodesUtilities 
{
	// Returns a component that displays a binary tree
	public static JPanel getView(Node root)
	{
		// Empty tree is displayed as a blank JPanel
		if(root == null)
		{
			return new JPanel();
		}
		
		// Leaf node displayed as a panel containing a single text field.
		if(root.left == null && root.right == null)
		{
			JTextField tf = new JTextField(String.valueOf(root.value));
			tf.setEditable(false);
			tf.setBackground(Color.WHITE);
			JPanel leafPanel = new JPanel();
			leafPanel.add(tf);
			
			return leafPanel;
		}
		
		// Non- leaf node displayed in BorderLayout JPanel whose NORTH region displays 
		// the node's value, whose WEST and EAST regions display the left and right
		// subtree at node.
		JPanel panel = new JPanel(new BorderLayout());
		
		// Display the value in the node in NORTH.
		String value = String.valueOf(root.value);
		JTextField tf = new JTextField(String.valueOf(root.value));
		tf.setEditable(false);
		tf.setBackground(Color.WHITE);
		JPanel valuePanel = new JPanel();
		valuePanel.add(tf);
		panel.add(valuePanel, BorderLayout.NORTH);
		
		// Display the left and right subtrees in WEST and EAST.
		panel.add(getView(root.left), BorderLayout.WEST);
		panel.add(getView(root.right), BorderLayout.EAST);
		
		return panel;
	
	}

}
