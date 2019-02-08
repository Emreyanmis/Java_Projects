package Question13;

import java.util.Scanner;
import java.io.*;

public class NameSearch
{

	public static void main(String[] args) throws IOException
	{	
		int result;
		String searchValue;
		String input;
      
		// Create the console input objects.
		Scanner keyboard = new Scanner(System.in);
		
		File file = new File("BoyNames.txt");
		Scanner names = new Scanner(file);
		String[] boys = new String[200];
		
		
		for(int i = 0; i < boys.length; i++)
		{	
			boys[i] = names.nextLine();
			System.out.println(boys[i]);
		}
		
		System.out.println("\n\n");
		
		ObjectSelectionSort.selectionSort(boys);
		
		for(int i = 0; i < boys.length; i++)
		{	
			System.out.println(boys[i]);
		}
		
		

	      do
	      {
	         // Get a value to search for.
	         System.out.print("Enter a value to search for: ");
	         searchValue = keyboard.nextLine();

	         // Search for the value
	         result = ObjectBinarySearcher.BinarySearch(boys, searchValue);

	        // Display the results.
	        if (result == -1)
	           System.out.println(searchValue + " was not found.");
	        else
	        {
	           System.out.println(searchValue + " was found at " +
	                              "element " + result);
	        }

			  // Consume the remaining newline.
			  keyboard.nextLine();
			  
	        // Does the user want to search again?
	        System.out.print("Do you want to search again? (Y or N): ");
	        input = keyboard.nextLine();
	      } while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
	   }
}
