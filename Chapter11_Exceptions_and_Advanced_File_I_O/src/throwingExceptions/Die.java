package throwingExceptions;

import java.util.Random;

public class Die 
{
	private final int MIN_SIDES = 4;
	private int sides;
	private int value;
	
	public Die(int numSides)
	{
		if(numSides < MIN_SIDES)
		{
			throw new IllegalArgumentException("The due must "
					+ "have at least " + MIN_SIDES+ " sides");	
		}
		
		//Store the number of sides and roll
		sides = numSides;
		roll();
	}
	
	public void roll()
	{
		// Create a Random object
		Random rand = new Random();
		
		// Get a value for the die.
		value = rand.nextInt(sides);
	}
	
	public int getSides()
	{
		return sides;
	}
	
	public int getValue()
	{
		return value;
	}
	
}
