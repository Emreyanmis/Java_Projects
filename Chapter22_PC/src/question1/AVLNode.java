package question1;

public class AVLNode extends Node
{
	int height;
	
	// These elements cast the inherited NODE links
	// AVLNode links.
	AVLNode getLeft()
	{
		return (AVLNode) left;
	}
	
	AVLNode getRight()
	{
		return (AVLNode) right;
	}
	
	public AVLNode(int value)
	{
		this(value, null, null);
		// Call the other (sister) constructor.
		
		
	}

	public AVLNode(int value, Object left1, Object right1) 
	{
		super(value, left1, right1);
		height = 0;
	}
	
	/**
	 * The resetHeight methods recomputes height if the left or right subtrees have changed
	 */
	void resetHeight()
	{
		int leftHeight = -1;
		int rightHeight = -1;
		
		if(left != null)
			leftHeight = getLeft().height;
		if(right != null)	
			rightHeight = getRight().height;
		
		height = 1 + Math.max(leftHeight, rightHeight);
	}
}
