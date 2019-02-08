package priorityQueues;

import javax.swing.*;
import javax.swing.tree.*;

public class JTreeExample 
{

	public static void main(String[] args)
	{
		// Create all the leaf nodes
		DefaultMutableTreeNode kate = new DefaultMutableTreeNode("Kate");
		DefaultMutableTreeNode amy = new DefaultMutableTreeNode("Amy");
		DefaultMutableTreeNode chuck = new DefaultMutableTreeNode("Chuck");
		DefaultMutableTreeNode joey = new DefaultMutableTreeNode("Joey");
		DefaultMutableTreeNode bob = new DefaultMutableTreeNode("Bob");
		
		bob.add(amy);
		bob.add(chuck);
	
		
		DefaultMutableTreeNode sydney = new DefaultMutableTreeNode("Sydney");
		DefaultMutableTreeNode emre = new DefaultMutableTreeNode("Emre");
		
		emre.add(bob);
		emre.add(kate);
		emre.add(sydney);
		
		DefaultTreeModel myTreeModel = new DefaultTreeModel(emre);
		
		JTree myTree  = new JTree(myTreeModel);
		
		JFrame myFrame = new JFrame("Tree Exhibition Program");
		myFrame.add(myTree);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.pack();
		myFrame.setVisible(true);	
		
	}

}
