package exam2;

//Author: Didar Sounov
//Course: CISY 103
//Date: 11/20/2018
//Instructor: Linda Yang

import java.util.*;
public class Exam2DidarSoyunov 
{
	public static void main(String[] args) 
	{
		// Creates a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);
		
		// Hold NFL, Borderlands, and Pandaries sold
		int NFL_SOLD, Borderlands_SOLD, Pandaries_SOLD;
		
		// Get input from user for NFL sold
		System.out.print("Enter number of Madden NFL 13 sold: ");
		NFL_SOLD = keyboard.nextInt();
		
		// Get input from user for Borderlands sold
		System.out.print("Enter number of Borderlands sold: ");
		Borderlands_SOLD = keyboard.nextInt();
		
		// Get input from user for Pandaries sold
		System.out.print("Enter number of WOW:Mists of Pandaries sold: ");
		Pandaries_SOLD = keyboard.nextInt();
	    
		// Calculate and display it
		calculate(NFL_SOLD, Borderlands_SOLD, Pandaries_SOLD);	
	}

	public static void calculate(int NFL_SOLD, int borderlands_SOLD, int pandaries_SOLD)
	{
		// holds NFL_PRICE
		double NFL_PRICE = 59.96;
		
		// holds the total NFL_PRICE
		double NFL_PRICE_SALES = NFL_PRICE * NFL_SOLD;
		
		// holds the Borderlands_PRICE
		double Borderlands_PRICE = 59.99;
		
		// holds the total Borderlands_PRICE
		double Borderlands_SALES = Borderlands_PRICE * borderlands_SOLD;
		
		// holds the Pandaries_PRICE
		double Pandaries_PRICE = 39.96;
		
		// holds the total Pandaries_PRICE
		double Pandaries_SALES = Pandaries_PRICE * pandaries_SOLD;
		
		// holds the total sales
		double total;
		total = NFL_PRICE_SALES + Borderlands_SALES + Pandaries_SALES;
				
		// Display the data
		System.out.println("Item\t\tQty\t\tSales\n"
							+ "---------------------------------------");
	    System.out.printf("Madden NFL 13\t %d\t\t$%,.2f\n",NFL_SOLD,NFL_PRICE_SALES);
	    System.out.printf("Borderlands\t %d\t\t$%,.2f\n",borderlands_SOLD,Borderlands_SALES);
	    System.out.printf("Wow\t\t %d\t\t$%,.2f\n",pandaries_SOLD,Pandaries_SALES);
	    System.out.printf("Total: \t\t\t\t$%,.2f",total);
	}
}
