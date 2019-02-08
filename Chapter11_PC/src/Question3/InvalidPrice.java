package Question3;

public class InvalidPrice extends Exception
{
  public InvalidPrice()
  {
		super("Error: price cannot be a negative number !");
  }

}
