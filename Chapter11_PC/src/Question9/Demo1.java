package Question9;

import java.util.Scanner;
import java.util.*;
public class Demo1
{

	public static void main(String[] args) 
	{
		Scanner keybaord = new Scanner(System.in);
		int numTests;
		
		System.out.print("Enter the number of tests: ");
		numTests = keybaord.nextInt();
		
		int testScores[] = new int[numTests];
		
		
			for(int i = 0; i < testScores.length; i++)
			{
				System.out.print("Enter the test score #" + (i+1) + ": ");
				testScores[i] = keybaord.nextInt();

				if(testScores[i] < 0 || testScores[i] > 100)
					throw new IllegalArgumentException("The test score cannot be less than 0 or"
														+ " greater than 100");
			}
			
			TestScores demo = new TestScores(testScores);
		
	}

}
