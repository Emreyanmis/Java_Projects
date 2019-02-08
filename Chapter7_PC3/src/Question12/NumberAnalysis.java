package Question12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NumberAnalysis 
{

	public static void main(String[] args) throws IOException
	{
		File file = new File("numbers.txt");
		Scanner names = new Scanner(file);
		
		double[] numbers = new double[12];
		System.out.print("[ ");
		for(int i = 0; i < numbers.length; i++)
		{	
			numbers[i] = names.nextDouble();
			System.out.print(numbers[i] + "  ");
		}
		System.out.print("]");
		
		System.out.printf("\n\nThe sum of the array: %.2f"  +
						  "\nThe average of the array: %.2f " +  
						  "\nThe highest value in the array: " + getHighest(numbers) +
						  "\nThe lowest value in the array: " + getLowest(numbers) +
						  "\nThe highest value location index in the array: " + getHighestLocation(numbers) +
						  "\nThe lowest value location index in the array: " + getLowestLocation(numbers),
				  	   getTotal(numbers),getAverage(numbers));

         		
	}
	
	public static double getLowest(double[] array)
	{
		double lowest = array[0];
		
		for(int i = 0; i < array.length; i ++)
		{
			if(lowest > array[i])
				lowest = array[i];
		}
		
		return lowest;	
	}
	
	public static double getHighest(double[] array)
	{
		double highest = array[0];
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > highest)
				highest = array[i];
		}
		return highest;
	}
	
	public static double getTotal(double[] array)
	{
		double sum = 0.0;
		
		for(int i = 0;i < array.length; i++)
			sum += array[i];
		
		return sum;
			
	}
	
	public static double getAverage(double[] array)
	{
		double average;
		double sum = 0.0;
		
		for(int i = 0;i < array.length; i++)
			sum += array[i];
		
		average = sum / array.length;
		
		return average;	
	}
	
	public static int getHighestLocation(double[] array)
	{
		double highest = array[0];
		int h = 0;
		
		for(int i = 1; i < array.length; i++)
		{
			if(array[i] > highest)
			{		
				highest = array[i];
				h = i;
			}	
		}
		return h;
	}
	
	public static int getLowestLocation(double[] array)
	{
		double lowest = array[0];
		int l = 0;
		
		for(int i = 0; i < array.length; i ++)
		{
			if(lowest > array[i])
				l = i;
			
		}
		
		return l;	
	}

}
