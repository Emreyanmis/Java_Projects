package LeetCode_easy;

import java.util.HashMap;
import java.util.Stack;

public class number4 
{
	
	// Hash table that takes care of the mappings.
	  private static HashMap<Character, Character> mappings;

	  // Initialize hash map with mappings. This simply makes the code easier to read.
	  public number4() {
	    this.mappings = new HashMap<Character, Character>();
	    this.mappings.put(')', '(');
	    this.mappings.put('}', '{');
	    this.mappings.put(']', '[');
	  } 
	public static void main(String[] args) 
	{
		
        String str = "{]";
		
		System.out.println(isValid(str));

	}
	
	public static boolean isValid(String s) 
    {

			    // Initialize a stack to be used in the algorithm.
			    Stack<Character> stack = new Stack<Character>();

			    for (int i = 0; i < s.length(); i++) {
			      char c = s.charAt(i);

			      // If the current character is a closing bracket.
			      if (mappings.containsKey(c)) 
			      {

			        // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
			        char topElement = stack.empty() ? '#' : stack.pop();

			        // If the mapping for this bracket doesn't match the stack's top element, return false.
			        if (topElement != mappings.get(c)) {
			          return false;
			        }
			      } else {
			        // If it was an opening bracket, push to the stack.
			        stack.push(c);
			      }
			    }

			    // If the stack still contains elements, then it is an invalid expression.
			    return stack.isEmpty();
	
        
    }
}
