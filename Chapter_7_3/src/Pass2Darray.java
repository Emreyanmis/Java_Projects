/**
 * This program demonstrates methods that accept
 * a two-dimensional array as an argument
 * @author emreyanmis
 */

public class Pass2Darray 
{

	public static void main(String[] args) 
	{
		int[][] numbers = {{ 1,  2,  3,  4},
				           { 5,  6,  7,  8},
				           { 9, 10, 11, 12} };
		
		// Display the contents of the array.
		System.out.println("Here are the values in the array: ");
		
		showArray(numbers);
		
		// Display the sum of the array's values:
		System.out.println("The sum of the values is  " + arraySum(numbers));		
		
	}
	
	/**
	 *  The  arrayShow method displays the contents
	 *  of a two-dimensional in array
	 *  @param numbers The array to display.
	 */
     
	private static void showArray(int[][] numbers)
	{
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
				System.out.print(numbers[i][j] + " ");
			System.out.println();	
		}	
	}
	
	/**
	 *  The arraySum method returns the sum of the values in 
	 *  a two-dimensional int array.
	 *  @param numbers the  array to sum
	 *  @return The sum of the array elements
	 */
	
	private static int arraySum(int[][] numbers)
	{
		int total = 0; // Accumulator
		
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
				total += numbers[i][j];
		}
		
		return total;
	}
}
