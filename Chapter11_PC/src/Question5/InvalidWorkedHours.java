package Question5;

public class InvalidWorkedHours extends Exception
{
  public InvalidWorkedHours()
  {
	  super("Error: The number of worked hours cannot be less than 0 or greater than 84 ");
  }
}
