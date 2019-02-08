import java.util.Scanner;

public class CupConverter 
{

	public static void main(String[] args) 
	{
		double cups,
		       ounces; 
	    cups = getCups();
	    
	   ounces = cupsToOunces(cups);
	   
	   
	   displayResults(cups, ounces);

	}
	
	public static double getCups()
	{
		Scanner keyboard  = new Scanner(System.in);
		
		int numOfCups;
		System.out.print("Enter the number of cups: ");
		numOfCups = keyboard.nextInt();
		
		return numOfCups;	
	}
	
	public static double cupsToOunces(double cups)
	{
		double ounces;
		
		ounces = cups / 8;
		
		return ounces;
	}
	
	 public static void displayResults(double cups, double ounces)
	 {
		 System.out.println("There are " + ounces + " fluid ounces in " +  cups + " cups.");
	 }
}
