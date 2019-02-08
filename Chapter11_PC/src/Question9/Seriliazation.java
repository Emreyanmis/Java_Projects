package Question9;

import java.util.Scanner;
import java.io.*;
public class Seriliazation 
{

	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		int students; 
		
		// System.out.print("Enter the number of students: ");
		students = 5;
		
		TestScores[] tests = new TestScores[students];
		
		int numTests;
		
		System.out.print("Enter the number of tests: ");
		numTests = keyboard.nextInt();
		
		int testScores[] = new int[numTests];
		
		
		for(int j = 0; j < tests.length; j++)
		{	
			System.out.println();
			for(int i = 0; i < testScores.length; i++)
			{
				System.out.print("Enter the test score #" + (i+1) + " for student #" + (j + 1 ) + ": ");
				testScores[i] = keyboard.nextInt();

				if(testScores[i] < 0 || testScores[i] > 100)
					throw new IllegalArgumentException("The test score cannot be less than 0 or"
														+ " greater than 100");
			}
			
			
			tests[j] = new TestScores(testScores);
			
		}

		  // Create the stream objects.
	      FileOutputStream outStream =  new FileOutputStream("Question.dat");
	      ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
	      
	      // Write the serialized objects to the file.
	      for (int i = 0; i < tests.length; i++)
	      {
	         objectOutputFile.writeObject(tests[i]);
	      }
	      
		// Close the file.
		objectOutputFile.close();
		
		System.out.print("The serialized objects were written to hte Question9.dat file.");
	
	}
	

}
