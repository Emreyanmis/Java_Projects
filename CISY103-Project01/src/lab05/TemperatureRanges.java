package lab05;

//Author: Didar Sounov
//Course: CISY 103
//Date: 10/02/2018
//Instructor: Linda Yang

import java.util.Scanner;
public class TemperatureRanges 
{
   public static void main(String[] args) 
	{
		// Creates a Scanner object to read input.	
	    Scanner keyboard = new Scanner(System.in);
	    
	    // holds the temperature
	    int temperature;
	    
	    // holds the activity
	    String activity;
	    
	    // Get the temperature from the user
	    System.out.print("Enter the outdoor temperature: ");
	    temperature = keyboard.nextInt();
	    
	    if(temperature <= 10)
	    	activity = "Stay inside by the fire, play checkers, and drink hot cocoa!";
	    else if(temperature <= 32)
	    	activity = "Hit the slopes and go skiing!";
	    else if(temperature <= 50)
	    	activity = "Put on an ugly sweater and play golf!";
	    else if(temperature <= 80)
	    	activity = "How about a nice game of tennis?";
	    else if(temperature <= 100)
	    	activity = "Go swimming and cool off!";
	    else
	    	activity = "Move further north!!!";
	    
	    // Display results
	    System.out.println("\nAt " + temperature + " degrees I recommend: \n" + activity );    
	}
}
