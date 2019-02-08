package Question1;


import java.util.Scanner;
public class Demo
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
		}
		TestScores demo = new TestScores(testScores);
	}

}
