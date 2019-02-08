package Question3;

public class InvalidUnitsOnHand extends Exception
{
	public InvalidUnitsOnHand()
	{
		super("Error: units cannot be a negative number !");
	}
}
