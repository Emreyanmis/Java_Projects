package binayTreesAndTheirApplications;

import java.io.IOException;

public class BinaryTreesNodes 
{

	public static void main(String[] args) throws IOException
	{
		Node root = null;
		
		Node aNode = new Node(10);
		aNode.left = new Node(20);
		Node dNode = new Node(40);
		Node cNode = new Node(30, dNode, new Node(50));
		aNode.right = cNode;
		
		root = aNode;
		
		System.out.println("Inoder traversal is: ");
		NodeUtilities.inorder(root);
		System.out.println("\n\nPreorder traversal is");
		NodeUtilities.preorder(root);
		System.out.println("\n\nPostorder traversal is");
		NodeUtilities.postorder(root);
		
		System.out.println("\n\n\nNumber of nodes: " + NodeUtilities.NodeCount(root));
		System.out.println("\nAW 4 :Number of nodes: " + NodeUtilities.treeSize(root));
		System.out.println("\nAW 5 :Number of nodes: " + NodeUtilities.leafCount(root));
		System.out.println("\nSearching for 50 : " + NodeUtilities.contains(root, 50));
		
	
	
		
		
		

	}

}
