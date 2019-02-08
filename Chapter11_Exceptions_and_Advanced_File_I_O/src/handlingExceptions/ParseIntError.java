package handlingExceptions;

public class ParseIntError 
{

	public static void main(String[] args) 
	{
		String str = "1234";
		int number;
		
		try
		{
			number = Integer.parseInt(str);
			System.out.println("Number is: " + number);
		}
		// If try statement is not compiled the catch statement will automate the following message:
		//  For input string:
		catch(NumberFormatException e)
		{
			System.out.println("Conversion error: " + e.getMessage());
		}

	}

}
