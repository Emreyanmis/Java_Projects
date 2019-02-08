import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;



public class SalesReport 
{

	public static void main(String[] args) throws IOException
	{
		final int numDays = 30;
		String filename;           //the name of the file to open
		double totalSales; 
		double averageSales;
		
		filename = getFileName();
		
		totalSales = getTotalSales(filename);
		
		averageSales = totalSales / numDays;
		
		displayResults(totalSales, averageSales);

		System.exit(0);
	}
	
	public static String getFileName()
	{
		String file = "MonthlySales.txt";
		
		file = JOptionPane.showInputDialog("Enter the name of the file\n" 
		                                  + " contaning 30 days of sales amounts.");
		
		return file;             
	}
	
	public static double getTotalSales(String filename)  throws IOException
	{
		double total = 0.0;
		double sales;
		
		File file = new File(filename);
		
		Scanner keybaord = new Scanner(file);
		
		while(keybaord.hasNext())
		{
			sales = keybaord.nextDouble();
			
			total += sales;
		}
		
		keybaord.close();
		
		return total;
	}
	
	public static void displayResults(double total, double avg)
	{
		JOptionPane.showMessageDialog(null,
				String.format("The total sales for the period is $%,.2f\n"
						+ "The average daily sales were $,.2f",total, avg));
	}

}
