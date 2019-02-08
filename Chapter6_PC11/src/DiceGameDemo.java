
public class DiceGameDemo 
{

	public static void main(String[] args) 
	{
		
	   System.out.println("Welcome to the Dice Game!\n");
	   
	   int userTotal = 0;
	   int compTotal = 0;
	   
	   DiceGame user1 = new DiceGame();
	   DiceGame user2 = new DiceGame();
	   
	   DiceGame comp1 = new DiceGame();
	   DiceGame comp2 = new DiceGame();
	   
	   for(int i = 0; i < 10; i++)
	   {   
		   System.out.println("Now playing round " + (i +1 )); 
		   
		   user1.roll();
		   user2.roll();
		   userTotal = user1.getValue() + user2.getValue();
		   
		   comp1.roll();
		   comp2.roll();
		   compTotal = comp1.getValue() + comp2.getValue();
		   
		   if(userTotal > compTotal)
		   {   
			   System.out.println("You won the round " + (i + 1) + "!");
			   userTotal++;
		   }	   
		   else if(compTotal > userTotal)
		   {   
			   System.out.println("Computer won the round " + (i + 1) + ".");
			   compTotal++;
		   }
		   else 
			   System.out.println("Round " + (i + 1) + " is tie.");
		   
		   System.out.println("========================");
	   }
	   
	   if(userTotal > compTotal)
		   System.out.println("\nYou won the game!");
	   else if(compTotal > userTotal)
		   System.out.println("\nComputer won the game.");   
	   else
		   System.out.println("\nThe game is tie.");   
	   
	}

}
