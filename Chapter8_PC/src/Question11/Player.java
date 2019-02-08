package Question11;

import java.util.Scanner;
public class Player 
{

	public static void main(String[] args) 
	{
		Scanner keybaord = new Scanner(System.in);
		int choice;
		int player1 = 20;
		int player2 = 20;
		int player1Value, player2Value;
		int player1Reamining = 0, player2Reamining = 0 ;
		
		System.out.println("Welcome to the First to One Game!");
	
		do	
		{
			
			System.out.print("Let's start with the first player.\nType '1' to roll the dice: ");
			choice = keybaord.nextInt();
			
			if(choice == 1)
			{	
					Die demo1 = new Die();
					player1Value  = demo1.getValue();
					System.out.println("Die Value: " + player1Value);
					
					
					player1Reamining = player1 - player1Value;
					if(player1Reamining > 0)
					{	
						player1 -= player1Value;
						System.out.println("Remaining value for player 1: " + player1Reamining + "\n");
					}
					else 
					{	
						getDisplay1(player1Reamining, player2Reamining);
						System.exit(0);
					}	
			}
		
			System.out.print("It's player 2 's turn .\nType '2' to roll the dice: ");
			choice = keybaord.nextInt();
			if(choice == 2)
			{ 
				Die demo2 = new Die();
				player2Value  = demo2.getValue();
				System.out.println("Die Value: " + player2Value);
				
				player2Reamining = player2 - player2Value;
				if(player2Reamining > 0)
				{	
					player2 -= player2Value;
					System.out.println("Remaining value for player 2: " + player2Reamining + "\n");

				}
				else 
				{	
					getDisplay1(player1Reamining, player2Reamining);
					System.exit(0);
				}	
				
			}
			
		} while((player1Reamining != 1 && player2Reamining != 1) && (player1Reamining >= 0 && player2Reamining >= 0 ));
	
		
	  }
			

	private static void getDisplay1(int player1Reamining, int player2Reamining) 
	{

      	System.out.println("\n\n\n");
		System.out.println("Remaining value for player 1: " + player1Reamining + "\n");
		System.out.println("Remaining value for player 2: " + player2Reamining + "\n");
			
		
		if(player1Reamining == 1 && player2Reamining == 1)
			System.out.println("Draw.");
		else if(player1Reamining == 1)
			System.out.println("Winner is 1. player!");
		else if(player2Reamining == 1)
			System.out.println("Winner is 2. player!");
		else if(player1Reamining > player2Reamining)
			System.out.println("Winner is 2. player!");
		else if(player1Reamining < player2Reamining)
			System.out.println("Winner is 1. player!");
	    
		
		
	}
}
