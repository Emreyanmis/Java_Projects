import java.util.Scanner;

public class GameOfTwentyOneDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int choice;
		int userTotal = 0;
		int compTotal = 0;
	
		
		final int die1Sides = 6;
		final int die2Sides = 6;

	    
	    GameOfTwentyOne die1Comp = new GameOfTwentyOne(die1Sides);
	    GameOfTwentyOne die2Comp = new GameOfTwentyOne(die2Sides);
	    
	    GameOfTwentyOne die1 = new GameOfTwentyOne(die1Sides);
	    GameOfTwentyOne die2 = new GameOfTwentyOne(die2Sides);
	    
	    System.out.println("Welcome to a Game Of Twnety-One Against the Computer!");
	    System.out.print("Each round you will have two options: 1 - Exit or 2 - Roll the"
	    		+ " Dice");
	  
	    
	    
	    do 
	    {
	    	 	System.out.print("\n1 - Exit\n2 - Roll the"
	 	    		+ " Dice\nEnter your choice (1 or 2): ");
	    	 		choice = keyboard.nextInt();
	    	    
	    	 	
	    	 	die1Comp.roll();
	    	 	die2Comp.roll();
	    	 	
	    	 	compTotal +=  die1Comp.getValue() + die2Comp.getValue();
	    	 
		       
		    System.out.println("\nRolling your dice:");
		    	  // Roll the dice.
		    	  die1.roll();
		    	  die2.roll(); 	  
		    	  // Display the values of the dice.
		    	  System.out.println(die1.getValue() + "  " + die2.getValue());   
		    	  
	
		    	  userTotal +=  die1.getValue() + die2.getValue();
		    	 
	     }  
	     while(choice != 1 && userTotal < 21);
	    
	    	System.out.println("The total points of Computer: " + compTotal);
	    	System.out.println("Your total points: " + userTotal);
	    	
	    	if(compTotal > userTotal)
	    		System.out.println("Computer won.");
	    	else if(userTotal > compTotal)
	    		System.out.println("You won!");
	    	else
	    		System.out.println("Tie."); 
	}
}
