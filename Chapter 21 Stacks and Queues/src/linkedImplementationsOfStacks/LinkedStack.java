package linkedImplementationsOfStacks;

public class LinkedStack 
{
	class StackOverFlowException extends RuntimeException
	{
		
	}
	
	class EmptyStackException extends RuntimeException
	{
		
	}

	private class Node
	{
		String value;
		Node next;
		Node(String val, Node n)
		{
			value = val;
			next = n;
		}
	
	}	
		// Top of the stack
	    private Node top = null; 
	  
	    /**
	     * The empty method checks for an empty stack 
	     * @return true if the stack is empty, false otherwise
	     */
	    public boolean empty()
	    {
	    	return top == null;
	    }
	    
	    
	    /**
	     * The push method adds a new item to the stack.
	     * @param s The item to be pushed onto the stack
	     */
	    public void push(String s)
	    {
	    	top = new Node(s, top);
	    }
	    
	    
	    /**
	     * The Pop method removes the value at the top of the stack
	     * @return The value at the top of the stack.
	     * @exception EmptyStackException When the stack is empty
	     */
	    public String pop()
	    {
	    	if(empty())
	    		throw new EmptyStackException();
	    	else
	    	{
	    		String retValue = top.value;
	    		top = top.next;
	    		return retValue;
	    	}
	    }
	    
	    
	    /**
	     * The peek method returns the top value on the stack
	     * @return The value at the top of the stack.
	     * @exception EmptyStackException When the stack is empty
	     */
	    public String peek()
	    {
	    	if(empty())
	    		throw new EmptyStackException();
	    	else
	    		return top.value;
	    }
	    
	    
	    public String toString()
	    {
	    	StringBuilder strb = new StringBuilder();
	    	Node p = top;
	    	while(p != null)
	    	{
	    		strb.append(p.value);
	    		p = p.next;
	    		if(p != null)
	    			strb.append("\n");
	    	}
	    	return strb.toString();
		
	    }
}
