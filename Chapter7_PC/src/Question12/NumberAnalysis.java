package Question12;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NumberAnalysis 
{

	public static void main(String[] args) throws IOException
	{
		File file = new File("Numbers.txt");
		Scanner names = new Scanner(file);
		
		double[] numbers = new double[12];
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = names.nextDouble();
		
	  
		for(int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	   
		
	
		
	}

}
