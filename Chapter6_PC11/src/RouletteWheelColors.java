
public class RouletteWheelColors 
{
	private int pocketNumber;

	public RouletteWheelColors(int pocketNumber) 
	{
		this.pocketNumber = pocketNumber;
	}
	
	public String getPocketColor()
	{
		if(pocketNumber == 0)
			return "Green";
		else if(pocketNumber >= 1 && pocketNumber <= 10)
		{
			if(pocketNumber % 2 == 0)
				return "Black";
			else
				return "Red";
		}
		
		else if(pocketNumber >= 11 && pocketNumber <= 18)
		{
			if(pocketNumber % 2 == 0)
				return "Red";
			else
				return "Black";
		}
		
		else if(pocketNumber >= 19 && pocketNumber <= 28)
		{
			if(pocketNumber % 2 == 0)
				return "Black";
			else
				return "Red";
		}
		
		else if(pocketNumber >= 28 && pocketNumber <= 36)
		{
			if(pocketNumber % 2 == 0)
				return "Red";
			else
				return "Black";
		}
		else
			return "You entered a number that is outside the range of 0 through 36!";
	}
	
}
