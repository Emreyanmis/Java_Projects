/**
 * This program demonstrates a returning boolean value.
 * @author emreyanmis
 */
public class ReturningBooleanValue 
{

	public static void main(String[] args) 
	{
		int value = 20;
		
		if(isValid(value))
			System.out.println("The value is within the range.");
		else
			System.out.println("The value is NOT within the range.");
	}
	
	public static boolean isValid(int number)
	{
		boolean status;
		
		if(number >= 1 && number <= 100)
			status = true;
		else
			status = false;
		
		return status;
	}

}
