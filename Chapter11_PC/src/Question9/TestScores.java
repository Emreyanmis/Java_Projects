package Question9;

import java.io.*;
import java.io.Serializable;

public class TestScores implements Serializable
{
	private double sum = 0;
	private double average;
	
	public TestScores(int array[])  
	{
		for(int i = 0; i < array.length; i++)
				sum += array[i];
		
		average = sum / array.length;
	}
	
	public double sum()
	{
		return sum;
	}
	
	public double getAverage()
	{
		return average;
	}

}

