
public class CelsiusTemperatureTable 
{

	public static void main(String[] args)
	{
	   /**
	   for(int i = 0; i <= 200 ; i++)
		    System.out.println(i + " Fahrenheit is equal to " + celcius(i) + " celcius.");
	   */
	   
	   
		System.out.println(celcius(100));
	}
	
	
	
	public static double celcius(double f)
	{
		double c;
		c =  ( 5.0 / 9.0) * ( f- 32);
		
		return c;
	}
}
