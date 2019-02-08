
public class SumArray2D 
{

	public static void main(String[] args) 
	{
         
		int[][] numbers = { {45,35,54,65},
				            {45,31,32,69},
				            {40,23,5,10},
				            {89,43,4,12}};
				             
		int total = 0;
		for(int i = 0; i< numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			   total += numbers[i][j];		
		}
		System.out.println("The sum of the numbers arrays is: " +  total);
		
	}

}
