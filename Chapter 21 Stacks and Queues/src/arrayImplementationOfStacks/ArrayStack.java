package arrayImplementationOfStacks;

/**
 *  Array Implementation of a stack
 */
import java.util.*;
public class ArrayStack 
{
	
	class StackOverFlowException extends RuntimeException
	{
		
	}
	
	class EmptyStackException extends RuntimeException
	{
		
	}
	
	 private int[] s;
	 private int top;
	 
	 
	 public ArrayStack(int capacity)
	 {
		 s = new int[capacity];
		 top = 0;
	 }
	 
	 /**
	  * The empty method checks for an empty stack.
	  * @return true if the stack is empty.
	  */
	 public boolean empty()
	 {
		 return top == 0;
	 }
	 
	 /**
	  * The push method pushes a value onto the stack
	  * @param x The value to push onto the stack.
	  * @exception StackOverFlowException When the stack is full.
	  */
	 
	 public void push(int x)
	 {
		 if(top == s.length)
			 throw new StackOverFlowException();
		 else
		 {
			 s[top] = x;
			 top++;
		 }
		 
	 }
	 
	 
	 /**
	  * The pop method pops a value off the stack.
	  * @return The value popped
	  * @exception EmptyStackException When the stack is empty
	  */
	 public int pop()
	 {
		 if(empty())
			 throw new EmptyStackException();
		 else
		 {
			 top--;
			 return s[top];
		 }
	 }
	 
	 
	 /**
	  * The peek method returns the value at the top of the stack.
	  * @return value at top of the stack
	  * @exception EmptyStackException When the stack is empty
	  */
	 int peek()
	 {
		 if(empty())
			 throw new EmptyStackException();
		 else
		 {
			 return s[top-1];
		 }
	 }
}
