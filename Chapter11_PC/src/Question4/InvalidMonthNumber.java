package Question4;

public class InvalidMonthNumber extends Exception
{
  public InvalidMonthNumber()
  {
	   super("Error: The month number cannot be either less than  1 or greater than 12");
  }
}
