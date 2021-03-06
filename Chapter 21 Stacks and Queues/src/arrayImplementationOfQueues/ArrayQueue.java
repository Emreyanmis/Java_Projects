package arrayImplementationOfQueues;


public class ArrayQueue 
{
	
	class QueueOverFlowException extends RuntimeException
	{
		
	}
	
	class EmptyQueueException extends RuntimeException
	{
		
	}
	
	
	// Holds queue elements
	private String[] q;
	
	// Next item to be removed
	private int front;
	
	// Next slot to fill
	private int rear;
	
	// Number of items in queue
	private int size;
	
	/**
	 * Constructor
	 * @param capacity The capacity of the queue
	 */
	ArrayQueue(int capacity)
	{
		q = new String[capacity];
		front = 0;
		rear = 0;
		size = 0;
	}
	
	/**
	 * The capacity method returns the length of the array used to implement the queue.
	 * @return The capacity of the queue.
	 */
	public int capacity()
	{
		return q.length;
	}
	
	/**
	 * The empty method checks to see if this queue is empty
	 * @return true if the queue is empty and false otherwise
	 */
	public boolean empty()
	{
		return size == 0;
	}
	
	
	/**
	 * The enqueue method adds an element to the queue.
	 * @param s The element to be added to the queue.
	 * @exception QueueOverFlowException When there is no more room in the queue.
	 */
	public void enqueue(String s)
	{
		if(size == q.length)
			throw new QueueOverFlowException();
		else
		{
			// Add to rear
			size++;
			q[rear]  = s;
			rear++;
			
			if(rear == q.length)
				rear = 0;
		}
	}
	
	
	public String peek()
	{
		if(empty())
			throw new EmptyQueueException();
		else
		  return q[front];	
	}
	
	
	
	/**
	 * The dequeue method removes and returns the element at the front of the queue.
	 * @return The element at the front of the queue.
	 * @exception EmptyQueueException When the queue is empty.
	 */
	public String dequeue()
	{
		if(empty())
			throw new EmptyQueueException();
		else
		{
			size--;
			// Remove from front
			String value = q[front];
			q[front] = null;
			
			// Update front
			front++;
			if(front == q.length) 	
				front = 0;
			
		    return value;	
		}
		
	 }	
		public String toString()
		{
			StringBuilder strb =  new StringBuilder();
			strb.append("front = " + front + "; ");
			strb.append("rear = " + rear + "; \n");
			
			for(int k = 0; k < q.length; k++)
			{
				if(q[k] != null)
					strb.append(k + " " + q[k]);
				else
					strb.append(k + " ? ");
				if(k != q.length - 1)
					strb.append("\n");
			}
			
			return strb.toString();
		}
}
