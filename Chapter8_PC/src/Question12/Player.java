package Question12;


import java.util.Scanner;
public class Player 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int choice, choice1;
		
		int p1Points = 0,  p2Points = 0;
		
		System.out.println("Welcome to the Heads or Tails Game!");
		System.out.println("Let's start with player 1");
		
		while(p1Points < 5 && p2Points < 5)
		{	
			
			System.out.println("Player 1, enter your choice");
			System.out.print("Guess 1- Heads or 2- Tails: ");
			choice = keyboard.nextInt();
		    HeadsOrTail demo1 = new HeadsOrTail();
		    System.out.println("Face: " + demo1.getFace());
		    
		    if(demo1.getValue() == choice)
		    	p1Points++;
		    
		    System.out.println("Player1 points: " + p1Points);
		    
		    System.out.print("\nGuess 1- Heads or 2- Tails: ");
			choice1 = keyboard.nextInt();
		    HeadsOrTail demo2 = new HeadsOrTail();
		    System.out.println("Face: " + demo2.getFace());
		    
		    if(demo2.getValue() == choice1)
		    	p2Points++;
		    
		    System.out.println("Player2 points: " + p2Points + "\n");

		}
		
		if(p1Points ==  p2Points)
			System.out.println("Draw.");
		else if(p1Points > p2Points)
			System.out.println("Winner is 1. player!");
		else if(p1Points < p2Points)
			System.out.println("Winner is 2. player!");
	}
}
