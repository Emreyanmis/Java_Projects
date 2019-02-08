package linkedListImplementationOfQueues;


public class LinkedQueue 
{
	
	class QueueOverFlowException extends RuntimeException
	{
		
	}
	
	class EmptyQueueException extends RuntimeException
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
	
	private Node front = null;
    private Node rear = null;
    
    public void enqueue(String s)
    {
    	if(rear != null)
    	{
    		rear.next = new Node(s, null);
    		rear = rear;
    	}
    }
    
    public boolean empty()
    {
    	return front == null;
    }
    
    public String peek()
    {
    	if(empty())
    	  throw new EmptyQueueException();
    	else
          return front.value;
    }
    
    public String dequeue()
    {
    	if(empty())
      	  throw new EmptyQueueException();
    	else
    	{
    		String value = front.value;
    		front = front.next;
    		
    		if(front == null)
    			rear = null;
    		
    		return value;
    	}
    }
    
    
    public String toString()
    {
    	StringBuilder strb = new StringBuilder();
    	
    	// Walk down the list and append all values
    	Node p = front;
    	
    	while(p != null)
    	{
    		strb.append(p.value + " ");
    		p = p.next;
    	}
    	
    	return strb.toString();
    }

}
