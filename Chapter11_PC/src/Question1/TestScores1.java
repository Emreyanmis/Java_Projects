package Question1;

public class TestScores1 
{
	private double sum = 0;
	private double average;
	
	public TestScores1(int array[])
	{
		for(int i = 0; i < array.length; i++)
				sum += array[i];
		
		average = sum / array.length;
		
		System.out.println("\nThe sum of the tests is: " + sum +"\nThe average is: " + average );
	}

}
