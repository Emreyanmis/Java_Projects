package question2;

public class Node 
{
	String value;
	Node left, right; 
	
	// Constructor for leaf nodes
	public Node(String val)
	{
		value = val;
		left = null;
		right = null;
	}
	
	// Constructor for non-leaf nodes.
	Node(String val, Node leftChild, Node rightChild)
	{
		value = val;
		left = leftChild;
		right = rightChild;
	}
}
