package genericImplementationOfStacksAndQueues;



class StackOverFlowException extends RuntimeException
{
	
}

class EmptyStackException extends RuntimeException
{
	
}

public class GenStack<T> 
{

	
	
	private T []  s;  
    private int top;
    
    public GenStack(int capacity)
    {
    	s = (T[])  new Object[capacity];
    	top = 0;
    }
    
    
    public boolean empty()
    {
    	return top == 0;
    }
    
    public T push(T x)
    {
    	if(top == s.length)
    		throw new StackOverFlowException();
    	else
    	{
    		s[top] = x;
    		top++;
    		return x;
    	}
    }
    
    public T pop()
    {
    	if(top == s.length)
    		throw new StackOverFlowException();
    	else
    	{
    		T retVal = s[top - 1];
    		s[top -1 ] = null;
    		top--;
    		return retVal;
    	}
    }

}
