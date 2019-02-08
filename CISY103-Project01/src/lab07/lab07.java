package lab07;

//Author: Didar Sounov
//Course: CISY 103
//Date: 10/18/2018
//Instructor: Linda Yang
import java.util.Scanner;
import java.util.Random;
public class lab07 
{
	public static void main(String[] args)
	{
		// Creates a Scanner object to read input.	
		Scanner keybaord = new Scanner(System.in);
		
		// Creates a Random object.
		Random rand = new Random();
		
		// Guesses a random number from 1 to 100
		int computerGuess = rand.nextInt(100) + 1;
		
		// Gets the guess of the user
		int userGuess;
		
		// Counts the number of user attempts to find the computer's guess
		int count = 1;
	
		// Prompts user to guess the first guess.
		System.out.print("I'm thinking of a number between 1 and 100\n\n"
				+ "What is your guess? ");
		userGuess = keybaord.nextInt();
		
		
	while(userGuess != computerGuess)
	{				
			if(userGuess > 100  || userGuess < 0)
			{	
				System.out.println("Your guess is out of range. Your guess should be between 1 and 100");
				System.out.print("\nWhat is your guess? ");
				userGuess = keybaord.nextInt();
				count++;
			}
			else if(userGuess < computerGuess)
			{
				System.out.println("\noooh sorry - too low. Guess again!");
				System.out.print("\nWhat is your guess? ");
				userGuess = keybaord.nextInt();
				count++;
			}
			else if(userGuess > computerGuess)
			{
				System.out.println("\noooh sorry - too high. Guess again!\n");
				System.out.print("What is your guess? ");
				userGuess = keybaord.nextInt();
				count++;
			}
	}	
	
	// Displays the number of guesses the user attempt to find the computer's guess
	// and congratulates the user since the user the found the right guess of computer
	System.out.print("\nYou got it! And it only took you " + count + " guesses!");		
  }
}
