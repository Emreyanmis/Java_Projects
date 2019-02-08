/**
 * This program uses the length of fields of a 2D  array 
 * to display the number of rows , and the number of columns in each row.
 * @author emreyanmis
 */
public class Lengths
{

	public static void main(String[] args)
	{
		 // Declare a  2D array with 3 rows and 4 columns
		
		int [][] numbers = { { 1, 2, 3, 5},
				             { 9, 4, 5, 9},
				             { 3, 5, 6, 7} };
		
		
		// Display the number of rows .
		System.out.println("The number of rows is " + numbers.length);
		
		// Display the number of columns in each row.
		for(int i= 0; i < numbers.length; i++)
		{
			System.out.println("The number of columns in row " + i + " is " + numbers[i].length);
		}
		
		for(int i= 0; i < numbers.length; i++)
		{
			for(int j= 0; j < numbers[i].length; j++)
			{
				System.out.print(numbers[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
	}

}
