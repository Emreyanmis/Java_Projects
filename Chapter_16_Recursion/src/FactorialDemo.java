import javax.swing.JOptionPane;

/**
 * This program demonstrates the recursive factorial method.
 * @author emreyanmis
 */

public class FactorialDemo 
{

	public static void main(String[] args) 
	{
		String input;      // To hold user input
		int number;        // To hold a number
		
		// Get a number from the user.
		input = JOptionPane.showInputDialog("Enter a nonnegative integer: ");
		
		number = Integer.parseInt(input);
		
		// Display a factorial of the number.
		JOptionPane.showMessageDialog(null, number +" ! is " + factorial(number));
		
		System.exit(0);
	}
	
	/**
	 * The factorial method calculates the factor of the number that user typed
	 */
    
	public static int factorial(int n)
	{
		if(n==0)
			return 1;     // base case
		else 
			return n * factorial(n-1);
	}
}
