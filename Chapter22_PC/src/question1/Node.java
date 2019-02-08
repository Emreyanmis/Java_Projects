package question1;

public class Node 
{
	int value;
	Node left, right; 
	Node tree, node;

	
	// Constructor for leaf nodes
	public Node(int val)
	{
		value = val;
		left = null;
		right = null;
	}
	
	public Node(Node tree, Node node)
	{
		 this.node = node;
		 this.tree = tree;
	}
	
	
	// Constructor for non-leaf nodes.
	Node(int val, Object left1, Object right1)
	{
		value = val;
		left = (Node) left1;
		right = (Node) right1;
	}
}
