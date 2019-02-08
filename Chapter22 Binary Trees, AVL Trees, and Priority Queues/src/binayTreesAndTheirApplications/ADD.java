package binayTreesAndTheirApplications;

public class ADD 
{
    static Node aNode = new Node(10);
	
	public static void main(String[] args) 
	{
	
	}
	
	static Node add(Node tree, int value)
	{
		if(tree == null)
			return new Node(value);
		if(value < tree.value)
			tree.left = add(tree.left, value);
		else
			tree.right = add(tree.right, value);
		return tree;
	}

}
