package operationsOnLinkedLists;


import java.util.Scanner;
public class LinkedList1Demo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		LinkedList1 demo = new LinkedList1();
		String input;
		demo.add("amy");
		demo.add("emre");
		demo.add(0, "cenk");
		demo.add(2, "beth");
		demo.add(4, "carol");
		
		System.out.println("The members of the list are: ");
		System.out.print(demo);
		
		System.out.print("\nEnter a name to remove:");
		input = keyboard.nextLine();
		input = input.toLowerCase();
		
		demo.remove(input);
		System.out.println("\n\nThe new  members of the list are: ");
		System.out.print(demo);
		
		

	}

}
