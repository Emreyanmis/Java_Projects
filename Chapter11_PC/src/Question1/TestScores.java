package Question1;


public class TestScores 
{
	private double sum = 0;
	private double average;
	
	public TestScores(int array[])
	{
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] < 0 || array[i] > 100)
				throw new IllegalArgumentException("The test score cannot be less than 0 or"
						+ " greater than 100");
			else
				sum += array[i];
		}
		average = sum / array.length;
		
		System.out.println("\nThe sum of the tests is: " + sum +"\nThe average is: " + average );
	}

}
