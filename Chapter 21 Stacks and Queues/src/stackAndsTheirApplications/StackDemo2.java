package stackAndsTheirApplications;


import java.util.*;
public class StackDemo2 
{

	public static void main(String[] args) 
	{
		Stack<Integer> intStack = new Stack<>();
	     
		for(int k = 1;  k < 10; k++)
		{	
			intStack.push(k * k);
			System.out.println("The item #:" + k +", " + intStack.peek() + " is added");
		}	
		
		System.out.println("\nThe peek item: " + intStack.peek() + "\n");
		
		while(!intStack.isEmpty())
			System.out.print(intStack.pop() + " ");
	}

}
