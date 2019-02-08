package question1;

/**
This class implements AVLTrees.
*/
public class AVLTrees extends BinaryTree
{    
	
	
	// Convenience method casts the inherited root
	// from Node to AVLNode.
	private AVLNode getRoot()
	{
	    return (AVLNode) root;
	}
	
	/**
	   The getHeight method computes the height of an AVL tree.
	   @param tree An AVL tree.
	   @return The height of the AVL tree.
	 */
	static int getHeight(AVLNode tree)
	{
	    if (tree == null)
	        return -1;
	    else
	        return tree.height;        
	}
	
	/**
	   The add method adds a value to this AVL tree.
	   @param x The value to add.
	   @return true.
	 */
	public boolean add(int x)
	{
	    root = add((AVLNode) root, x);
	    return true;
	}
	
	/**
	   The remove method removes a value from this AVL tree.
	   @param x The value to remove.
	   @return true.
	 */
	public boolean remove(int x)
	{
		AVLNode result = remove((AVLNode) root, x);
		if(result == null)
			return false;
		else
		{	
		root = result.left;
	    return true;
		} 
	}
	
	/**
	   The remove method removes a value from an AVL tree.
	   @return The root of the augmented AVL tree.
	 */
	private AVLNode remove(AVLNode bTree, int x)
	{
	    if (bTree == null)
	    {
	        return null;
	    }
	    if (x < bTree.value)
	    {
	    	AVLNode result = remove(bTree.getLeft(), x);
	    	
	    	if(result == null)
	    		return null;
	    	bTree.left = result.tree;
	    	result.tree = bTree;
	    	return result;
	    }
	    if(x > bTree.value)
	    {
	    	AVLNode result = remove(bTree.getRight(), x);
	    	if(result == null)
	    		return null;
	    	bTree.right = result.tree;
	    	result.tree = bTree;
	    	return result;
	    }
	
	  
	  // x is in this root node.
	  // Is it a leaf?
	  if(bTree.right == null && bTree.left ==null)
		  return new AVLNode(x, null, null);
	  
	  
	  // Does the node have two children?
	  if(bTree.right != null && bTree.left != null)
	  {
		  // Remove largest node in left subtree and make it the root of the remaining tree
		  AVLNode remResult = removeLargest(bTree.left);
		  Node newRoot = remResult.node;
		  newRoot.left = remResult.tree;
		  newRoot.right = remResult.tree;
		  
		  // Prepare the result to be returned.
		  bTree.left = null;
		  bTree.right = null;
		  return new AVLNode(x, bTree, newRoot);
				  
	  }
	  
	  // The node has one child
	  Node node = bTree;
	  Node tree;
	  if(bTree.left != null)
		  tree = bTree.left;
	  else
		  tree = bTree.right;
	  
	  node.left = null;
	  node.right = null;
	  return new AVLNode(x,node, tree);
	}
	
	private AVLNode removeLargest(Node bTree)
    {
  	  if(bTree == null)
  		  return null;
  	  if(bTree.right == null)
  	  {
  		  // Root is the largest node
  		  Node tree = bTree.left;
  		  bTree.left = null;
  		  return new AVLNode(0, bTree, tree);
  	  }
  	  else
  	  {
  		  // Remove the largest node from the right subtree.
  		  AVLNode remResult = removeLargest(bTree.right);
  		  bTree.right = remResult.tree;
  		  remResult.tree = bTree;
  		  return remResult;
  	  }
    }
	
	
	
	
	/**
	   The add method adds a value to an AVL tree.
	   @return The root of the augmented AVL tree.
	 */
	private AVLNode add(AVLNode bTree, int x)
	{
	    if (bTree == null)
	    {
	        return new AVLNode(x);
	    }
	    if (x < bTree.value)
	    {
	        bTree.left = add(bTree.getLeft(), x);
	    } else
	    {
	        bTree.right = add(bTree.getRight(), x);
	    }
	
	    // Compute heights of the left and right subtrees
	    // and rebalance the tree if needed.
	    int leftHeight = getHeight(bTree.getLeft());
	    int rightHeight = getHeight(bTree.getRight());
	    if (Math.abs(leftHeight - rightHeight) == 2)
	    {
	        return balance(bTree);
	    } else
	    {
	        bTree.resetHeight();
	        return bTree;
	    }
	}
	
	/**
	    The balance method rebalances an AVL tree.
	    @param bTree The AVL tree needing to be balanced.
	    @return The balanced AVL tree.
	 */
	private AVLNode balance(AVLNode bTree)
	{
	    int rHeight = getHeight(bTree.getRight());
	    int lHeight = getHeight(bTree.getLeft());
	
	    if (rHeight > lHeight)
	    {
	        AVLNode rightChild = bTree.getRight();
	        int rrHeight = getHeight(rightChild.getRight());
	        int rlHeight = getHeight(rightChild.getLeft());
	        if (rrHeight > rlHeight)
	        {
	            return rrBalance(bTree);
	        } else
	        {
	            return rlBalance(bTree);
	        }
	    } else
	    {
	        AVLNode leftChild = bTree.getLeft();
	        int llHeight = getHeight(leftChild.getLeft());
	        int lrHeight = getHeight(leftChild.getRight());
	        if (llHeight > lrHeight)
	        {
	            return llBalance(bTree);
	        } else
	        {
	            return lrBalance(bTree);
	        }
	    }
	}
	
	/**
	    The rrBlance method corrects an RR imbalance.
	    @param bTree The AVL tree wih an RR imbalance.
	    @return The balanced AVL tree.
	 */
	private AVLNode rrBalance(AVLNode bTree)
	{
	    AVLNode rightChild = bTree.getRight();
	    AVLNode rightLeftChild = rightChild.getLeft();
	    rightChild.left = bTree;
	    bTree.right = rightLeftChild;
	    bTree.resetHeight();
	    rightChild.resetHeight();
	    return rightChild;
	}
	
	/**
	   The rlBalance method corrects an RL imbalance.
	   @parame bTree The AVL tree with an RL imbalance.
	   @return The balanced AVL tree.
	 */
	private AVLNode rlBalance(AVLNode bTree)
	{
	    AVLNode root = bTree;
	    AVLNode rNode = root.getRight();
	    AVLNode rlNode = rNode.getLeft();
	    AVLNode rlrTree = rlNode.getRight();
	    AVLNode rllTree = rlNode.getLeft();
	
	    // Build the restructured tree.
	    rNode.left = rlrTree;
	    root.right = rllTree;
	    rlNode.left = root;
	    rlNode.right = rNode;
	
	    // Adjust heights.
	    rNode.resetHeight();
	    root.resetHeight();
	    rlNode.resetHeight();
	
	    return rlNode;
	}
	
	/**
	    The llBalance method corrects an LL imbalance.
	    @param bTree The AVL tree with an LL imbalance.
	    @return The balanced AVL tree.
	 */
	private AVLNode llBalance(AVLNode bTree)
	{
	    AVLNode leftChild = bTree.getLeft();
	    AVLNode lrTree = leftChild.getRight();
	    leftChild.right = bTree;
	    bTree.left = lrTree;
	    bTree.resetHeight();
	    leftChild.resetHeight();
	    return leftChild;
	}
	
	/**
	   The lrBalance method corrects an LR imbalance.
	   @param bTree The AVL tree with an LR imbalance.
	   @return The balanced AVL tree.
	 */
	private AVLNode lrBalance(AVLNode bTree)
	{
	    AVLNode root = bTree;
	    AVLNode lNode = root.getLeft();
	    AVLNode lrNode = lNode.getRight();
	    AVLNode lrlTree = lrNode.getLeft();
	    AVLNode lrrTree = lrNode.getRight();
	
	    // Build the restructured tree.
	    lNode.right = lrlTree;
	    root.left = lrrTree;
	    lrNode.left = lNode;
	    lrNode.right = root;
	
	    // Adjust heights.
	    lNode.resetHeight();
	    root.resetHeight();
	    lrNode.resetHeight();
	
	    return lrNode;
	}
}	