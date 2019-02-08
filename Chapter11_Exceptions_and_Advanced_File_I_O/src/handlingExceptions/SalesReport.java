package handlingExceptions;

// For File class and FileNotFoundException
import java.io.*;

// For Scanner and InputMismatchException
import java.util.*;

// For the JOptionPane class
import javax.swing.JOptionPane;

/**
 * This program demonstrates how multiple exceptions can be caught
 * with one try statement
 * @author emreyanmis
 */

public class SalesReport 
{

	public static void main(String[] args) 
	{
		// File name
		String filename = "SalesData.txt";
		
		// Month counter
		int months = 0;
		
		// One month's sales
		double oneMonth;
		
		// Total sales
		double totalSales = 0.0;
		
		// Average sales
		double averageSales;
		
		try
		{
			// Open the file
			File file = new File(filename);
			Scanner inputFile = new Scanner(file);
			
			// Process the contents of the file
			while(inputFile.hasNext())
			{
				// Get a month's sales amount.
				oneMonth = inputFile.nextDouble();
				
				// Accumulate the amount.
				totalSales += oneMonth;
				
				// Increment the month counter
				months++;
				
			}
			
			// Close the file
			inputFile.close();
			
			// Calculate the average
			averageSales = totalSales / months;
			
			// Display the results
			JOptionPane.showConfirmDialog(null, 
					String.format("Number of months: %d\n"
							+ "Total Sales: $%,.2f\n"
							+ "Average Sales: $%,.2f", months, totalSales, averageSales));
			
		}
		catch(FileNotFoundException e)
		{
			// Thrown by the Scanner constructor when the file was not found
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		catch(InputMismatchException e)
		{
			// Thrown by the Scanner class's nextDouble method when  a
			// non - numeric value is found.
			JOptionPane.showMessageDialog(null, "Non- numeric data found in the file");
		}
		
		System.exit(0);

	}

}
