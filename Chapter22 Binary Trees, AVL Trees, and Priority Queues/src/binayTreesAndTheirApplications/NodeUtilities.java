package binayTreesAndTheirApplications;

public class NodeUtilities 
{
	public static final String NodeUtilities = null;
	/**
	 * Inorder traversal of a binary tree rooted at a node.
	 * @param btree : The root of the binary tree
	 */
	
	static int count1,count2,count3,count4 = 0;
	static void inorder(Node btree)
	{			
		if(btree != null)
		{
			inorder(btree.left);
			System.out.print(btree.value + " ");
			inorder(btree.right);
			count1++;
		}	
	}
	
	static void preorder(Node btree)
	{			
		if(btree != null)
		{
			System.out.print(btree.value + " ");
			preorder(btree.left);
			preorder(btree.right);
			count2++;
		}	
	}
	
	static void postorder(Node btree)
	{			
		if(btree != null)
		{	
			postorder(btree.left);
			postorder(btree.right);
			System.out.print(btree.value + " ");
			count3++;
		}	
	}
	
	
	
	static void counter()
	{
		if(count1 != 0)
			System.out.println("\nNumber of nodes: " + count1);
		if(count2 != 0)
			System.out.println("\nNumber of nodes: " + count2);
		if(count3 != 0)
			System.out.println("\nNumber of nodes: " + count3);
	}
	
	static void incrementSubtrees(Node tree)
	{	
		if(tree.left != null)
		{	
			tree.left.value++;
			incrementSubtrees(tree.left);
		}	
		
		if(tree.right != null)
		{
			tree.right.value++;
			incrementSubtrees(tree.right);
		}	
	}
	
   static int NodeCount(Node tree)
	{
		if(tree != null)
		{
			NodeCount(tree.left);
			NodeCount(tree.right);
			count4++;
		}
		return count4;
	}
	
	static void incrementRoot(Node tree)
	{
		tree.value++;
	}
	
	static int treeSizeCount = 0;
	
	static int treeSize(Node bTree)
	{
		if(bTree!= null)
		{
			treeSizeCount++;
			treeSize(bTree.left);	
			treeSize(bTree.right);
		}
			return treeSizeCount;
	}	
	
	static int  leafCounter = 0;
	
	static int leafCount(Node bTree)
	{
		if(bTree.left != null)
		{
			leafCount(bTree.left);	
			leafCounter++;
		}
		if(bTree.right != null)
		{
			leafCount(bTree.right);
			leafCounter++;
		}
			return (leafCounter - 1);
	}	
	
	
	static boolean contains(Node btree, int x)
	{
		if(btree == null)
			return false;
		else if(btree.value == x)
			return true;
		
		if(contains(btree.left,x))
			return true;
		if(contains(btree.right,x))
			return true;
		else
			return false;
		
	}
}
