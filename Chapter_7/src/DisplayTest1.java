import java.util.Scanner; // Needed for the Scanner class

/**
 * This program demonstrates how the user may specify an array's size.
 * @author emreyanmis
 */

public class DisplayTest1 
{

	public static void main(String[] args) 
	{
		int numTests; // The number of tests
		int [] tests; // Array of test scores
		
		// Create a canner object for keyboard input.
		Scanner keybaord = new Scanner(System.in);
		
		// Get the number of tests scores.
		System.out.println("How many tests do you have? ");
		numTests =  keybaord.nextInt();
	    
		// Create an array to hold that number of scores.
		tests = new int[numTests];
		
		// Get the individual test scores.
		for(int index = 0; index < tests.length; index++)
		{
			System.out.println("Enter test score " + (index + 1) + " : ");
			tests[index] = keybaord.nextInt();
		}
		
		// Display the test scores.
		System.out.println();
		System.out.println("Here are the scores you entered: ");
		
		for(int index = 0 ; index < tests.length ; index++)
		{
			System.out.print(tests[index] + " ");
		}	   
	}

}