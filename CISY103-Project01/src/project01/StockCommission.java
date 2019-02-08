package project01;

// Author: Didar Sounov
// Course: CISY 103
// Date: 09/27/2018
// Instructor: Linda Yang


// Needed for the Scanner class
import java.util.Scanner;
public class StockCommission 
{
	public static void main(String[] args)
	{
	  
	  // Creates a Scanner object to read input.	
	  Scanner keyboard = new Scanner(System.in);
		 
	  //holds the number of stock purchased. 
	  int purchased;
	  
	  
	  //holds the stock price.
	  double price;
	  
	  
	  //  holds the commission percent.
	  double commissionPercent;
	  
	  
	  // hold the amount paid for the stock
	  double paidStock;
	  
	  // total amount paid
	  double totalPaid;
	  
	  // hold the commission amount
	  double commissionAmount;
	  
	    
	  // Get the number of shares of stock user purchased
	  System.out.print("Enter the number of shares of stock purchased: ");
	  purchased = keyboard.nextInt();
	  
	  
	  // Get the stock price 
	  System.out.print("Enter stock price: ");
	  price = keyboard.nextDouble();
	  
	  // Get the Commission Percent
	  System.out.print("Enter Commission Percent: ");
	  commissionPercent = keyboard.nextDouble();
	  
	  
	  // hold the amount paid for the stock is product of purchased and price 
	  paidStock = purchased * price;
	  
	  
	  // hold the commission amount is product of paidStock and commissionPercent
	   commissionAmount = paidStock * commissionPercent;
	  
	  
	  // total amount paid is sum of paidStock and commissionAmount
	   totalPaid = paidStock + commissionAmount;
	  
	  
	  // Display the amount paid for the stock
	  System.out.println("\nAmount paid for the stock: " + paidStock );
	  
	  
	  // Display the commission amount
	  System.out.println("Commission Amount: " +  commissionAmount);
	  
	  
	  // Display the total amount paid
	  System.out.println("\nTotal Ammount Paid: " +  totalPaid);
	 }
}
