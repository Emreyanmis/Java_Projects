package linkedImplementationsOfStacks;

public class LinkedStackDemo 
{

	public static void main(String[] args)
	{
		LinkedStack demo = new LinkedStack();
		System.out.println("Pushing: Amy Bob Chuck");
		System.out.println("Contents of Stack");
		
		demo.push("Amy");
		demo.push("Bob");
		demo.push("Chuck");
		
		System.out.println(demo);
     
		String name = demo.pop();
		
		System.out.println("Popped: " + name);
		System.out.println("Contents of Stack:");
		System.out.println(demo);
		
		String name1 = demo.pop();
		System.out.println("\nPopped: " + name1);
		System.out.println("Contents of Stack:");
		System.out.println(demo);
		
		
		
		 

	}

}
