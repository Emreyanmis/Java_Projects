
public class SumRowArrays2D 
{

	public static void main(String[] args) 
	{
		int[][] numbers  = {{5,3,4,5},
	                        {4,1,2,6},
	                        {4,2,5,1},
	                        {9,3,4,1}};

		int total;  // Accumulator, set to 0
		for(int i = 0; i < numbers.length; i++)
		  {
			total = 0;
			
			for(int j=  0; j < numbers[i].length; j++)
			{
				total += numbers[i][j];
			}
			 
			System.out.println("The sum of the row " + i + " in this array is: " +  total);
		  }
		
	}	
}
