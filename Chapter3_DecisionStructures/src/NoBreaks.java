import java.util.Scanner;

/**
 * This program demonstrates the switch statement.
 * @author emreyanmis
 *
 */
public class NoBreaks 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter 1,2, or 3");
		number = keyboard.nextInt();
		
	   switch(number)
	   {
	       case 1:
	    	     System.out.println("You entered 1");
	    
	    	   
	       case 2:
	    	     System.out.println("You entered 2");

	    	   
	       case 3:
	    	     System.out.println("You entered 3");

	    	  
	    	   default:
		    	     System.out.println("That is not 1,2, or 3!");
		        
	   } 
	}
}
