
public class Question7 
{

	public static void main(String[] args) 
	{
		int[][] grades = new int[30][10];
		
		final int numOfRows = 30;
		final int numOfColumns = 10;
		
		grades[0][0] = 1000;
		
		int total = 0;
		int average;
		
		for(int i = 0; i < grades.length; i++)
		{
			for(int j = 0; j < grades[i].length;j++)
			{
				total += grades[i][j];
			}
		}
		average = total / ( numOfRows * numOfColumns );
		 
		System.out.println("The average is: " + average);
       
	}
}
