package project02;

//Author: Didar Sounov
//Course: CISY 103
//Date: 10/11/2018
//Instructor: Linda Yang

import java.util.Scanner;
public class ParkingSolutionEstimator 
{
	public static void main(String[] args) 
	{
		// Creates a Scanner object to read input.	
	    Scanner keyboard = new Scanner(System.in);
	    
	    //holds the number of levels
	    int level;
	    
	    // holds the total number of parking spaces
	    int spaces;
	    
	    // holds the total cost and initializes it
	    double cost = 0.0;
	    
	    // get the the number of levels from the user
	    System.out.print("Parking Solution Estimator\n\nHow many levels of parking do you want? ");
	    level = keyboard.nextInt();
	    
	    // get the total number of parking spaces from the user
	    System.out.print("How many total parking spaces do you want? ");
	    spaces = keyboard.nextInt();
	    
	    if(level == 1)
	    	cost = spaces * 1685.43;
	    else 
	    	cost = (spaces * 26236.71) + (1000000.00 * (level - 1));
	  
	    // displays the estimated cost of the Parking Lot	
	    System.out.printf("\nEstimated cost of the Parking Lot is $%,3.2f", cost);
	}
}
