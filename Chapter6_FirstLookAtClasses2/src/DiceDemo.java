
public class DiceDemo
{

	public static void main(String[] args) 
	{
		final int die1Sides = 6;
		final int die2Sides = 12;
	    final int maxRolls = 5;
	    
	    Die die1 = new Die(die1Sides);
	    Die die2 = new Die(die2Sides);
	    
	    System.out.println("This stimulates the rolling of a " + die1Sides + " sided die and a "
	    						+ die2Sides + " sided die");
	    
	    System.out.println("Initial value of the dices: ");
	    System.out.println(die1.getValue() + "  " + die2.getValue());
	    
	    System.out.println("Rolling the dice " + maxRolls + " times:");
	    
	    // Roll the dice five times
	    for(int i = 0; i < maxRolls; i++)
	    {
	    	  // Roll the dice.
	    	  die1.roll();
	    	  die2.roll();
	    	  
	    	  // Display the values of the dice.
	    	  System.out.println(die1.getValue() + "  " + die2.getValue());    	
	    }	    
	}
}
