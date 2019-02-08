package Question2;


import java.util.Scanner;
import java.util.*;
public class Demo1
{

	public static void main(String[] args) throws InvalidTestScores 
	{
		Scanner keybaord = new Scanner(System.in);
		int numTests;
		
		System.out.print("Enter the number of tests: ");
		numTests = keybaord.nextInt();
		
		int testScores[] = new int[numTests];
		
		try
		{
			for(int i = 0; i < testScores.length; i++)
			{
				System.out.print("Enter the test score #" + (i+1) + ": ");
				testScores[i] = keybaord.nextInt();
				
				if(testScores[i] < 0 || testScores[i] > 100)
					throw new InvalidTestScores(testScores[i]);
			}
			TestScores1 demo = new TestScores1(testScores);
				
		}
		catch(InvalidTestScores e)
		{
			System.out.println(e.getMessage());
		}
	}

}
