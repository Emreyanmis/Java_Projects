
public class Pass2Darray
{

	public static void main(String[] args) 
	{
		int [] [] numbers = { {12,43,54,65},{12,34,54,64,22},{23,76,875,56,87}};
		
		System.out.println("Here are the values in the array");
		
		showArray(numbers);
		
		System.out.println("The sum of the values is"+ sum(numbers));
		


	private static void showArray(int[][] array) 
	{
		for(int row=0; row < array.length;row++)
		{
			for(int col=0; col< array[row].length; col++)
			{
				System.out.print(array[row][col]+" ");
				System.out.println();
			}
		}
		
	}
    
	private static int sum(int[][] array)
	{
		int total=0; // accumulator
		
		for(int row=0;row < array.length;row++)
		{
		  for(int col=0; col < array[row].length;col++)
		  {
			 total += array[row][col];  
		  }
		     return total;
	    }
	}	
}   
