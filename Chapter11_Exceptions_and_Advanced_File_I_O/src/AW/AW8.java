package AW;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AW8 
{

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
         System.out.println(getValueFromFile());

	}

	public static double getValueFromFile() throws IOException, FileNotFoundException
	{

		double number = 0;
		
		try
		{
			// Open the file
			File file = new File("SalesData.txt");
			Scanner inputFile = new Scanner(file);
	
			
			// Process the contents of the file
			while(inputFile.hasNext())
			{
				// Get a number from the file
				number = inputFile.nextDouble();
				
				// Display the number
				System.out.println(number);
				
			}
			
			// Close the file
			inputFile.close();
			
		}
		catch( FileNotFoundException ex)
		{
			// Display an error
			System.out.println("Error  the file.");
		}
		catch(IOException ex)
		{
			// Display an error
			System.out.println("Error processing the file.");
		}
		return number;
	}
		
}
