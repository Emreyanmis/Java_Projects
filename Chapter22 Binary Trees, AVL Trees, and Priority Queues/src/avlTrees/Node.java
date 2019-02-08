package avlTrees;

public class Node 
{
	int value;
	Node left, right; 
	
	// Constructor for leaf nodes
	public Node(int val)
	{
		value = val;
		left = null;
		right = null;
	}
	
	// Constructor for non-leaf nodes.
	Node(int val, Object left1, Object right1)
	{
		value = val;
		left = (Node) left1;
		right = (Node) right1;
	}
}
