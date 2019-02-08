import java.util.Scanner; // Neeeded for Scanner class

/**
 * This program shows values being stored in an array's 
 * elements and displayed.
 * @author emreyanmis
 */

public class ArrayDemo2 
{

	public static void main(String[] args) 
	{
	   final int EMPLOYEES = 3;                // Number of employees	
	   int[] hours = new int[EMPLOYEES];     //  Array of hours
	   
	   // Create a Scanner object for keyboard input.
	   Scanner keyboard = new Scanner(System.in);
	   
	   System.out.println("Enter the hours worked by " + EMPLOYEES + " employees");
	   
	   // Get the hours worked by employee 1.
	   for(int index = 0; index < EMPLOYEES; index++)
	   {
		   System.out.print("Employee " + (index + 1) + ":");
		   hours[index] = keyboard.nextInt();
	   }
	   
	   System.out.println("The hours you entered are: ");
	   
	    // Display the values entered.
	   for(int index = 0; index < EMPLOYEES; index++ )
		   System.out.println(hours[index]);  
	}
}
