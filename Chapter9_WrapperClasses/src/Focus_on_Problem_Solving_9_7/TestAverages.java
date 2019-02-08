package Focus_on_Problem_Solving_9_7;

import java.io.*;
public class TestAverages 
{

	public static void main(String[] args)  throws IOException
	{
		double average;
		int studentNumber = 1;
		
		TestScoreReader scoreReader = new TestScoreReader("grades.txt");
		
		while(scoreReader.readNextLine())
		{
			average = scoreReader.getAvearge();
			
			System.out.println("Average for student " + studentNumber + " is " + average);
			
			studentNumber++;
		}
		
		scoreReader.close();
		System.out.println("No more scores.");

	}

}
