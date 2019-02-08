/**
 * This program demonstrates passing individual array 
 * elements as arguments to a method
 * @author emreyanmis
 *
 */

public class PassElements 
{

	public static void main(String[] args) 
	{
	   int[] numbers = { 2, 4, 6, 8, 10 };
	   
	   for(int i = 0; i < numbers.length; i++)
	      showValue(numbers[i]);
	   
	}
	
	 /**
	 *  The showValue method displays its argument.
	 *  @param n The value to display.
	 */

	public static void showValue(int n)
	{
		System.out.print(n + " ");
		
	}

}
