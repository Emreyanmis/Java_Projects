import java.util.Random;

public class DiceGame 
{
	private int sides = 6;
	private int value;

	
	public DiceGame()
	{
		roll();
	}
	
	public void roll()
	{
		Random rand = new Random();
		
		value = rand.nextInt(6)  + 1;			
	}
	
	public int getValue()
	{
		return value;
	}
	
}
