package Question5;

public class InvalidHourlyPayRate extends Exception
{
 public  InvalidHourlyPayRate()
 {
	 super("Error: Hourly pay rate cannot be less than 0 or greater 25 ");
 }
}
