package stackAndsTheirApplications;


import java.util.*;
public class StackDemo1 
{

	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<>();
		String names[]  = {"Al", "Bob", "Carol"};
		System.out.println("Pushing onto the stack the names: ");
		System.out.println("Al Bob Carol");
		
		for(String s: names)
			stack.push(s);
		
		// Now pop and print everything on the stack
		String message = "Popping and printing all stack values:";
		System.out.println(message);
		System.out.println("The peek item: " + stack.peek());
		while(!stack.empty())
			System.out.print(stack.pop() + " ");

	}

}
