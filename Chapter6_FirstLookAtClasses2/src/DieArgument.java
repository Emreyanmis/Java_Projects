
public class DieArgument 
{

	public static void main(String[] args)
	{
		final int sixSides = 6;
		final int twentySides = 20;
		
		Die sixDie = new Die(sixSides);
		Die twentyDie = new Die(twentySides);
		
		// Roll the dice
		rollDie(sixDie);
		rollDie(twentyDie);
	}
	
	public static void rollDie(Die d)
	{
		System.out.println("Rolling a " + d.getSides() + " sided die.");
		
		// roll the die.
		d.roll();
		
		System.out.println("The die's value: " + d.getValue());		
	}
}
