import java.util.Scanner;
import java.text.DecimalFormat;

public class RainFallDemo
{

	public static void main(String[] args)
	{
	   final int maxMonths = 12;
	   double totalRainfall;
	   double averageRainfall;
	   int monthOfMostRain;
	   int monthOfLeastRain;
	   
	   double[] rainfallInYear = new double[maxMonths];
	   
	   String months[] = {"January", "February","March",
			             "April","May","June","July",
			             "August","September","October",
			             "November", "December"};
	   
	   getRainfallValues(rainfallInYear, months);
	   
	   // Create an object for RainFall class
	   RainFall rainInYear = new RainFall(rainfallInYear);
	   
	   // Create an object for DecimalFormat class
	   DecimalFormat decimals = new DecimalFormat("0.00");
	   
	   // Get and display the total rainfall in a year
	   totalRainfall = rainInYear.getTotalRainfall();
	   System.out.println("The total rainfall in the year: "+ totalRainfall);
	   
	   // Get and display the average monthly rainfall
	   averageRainfall = rainInYear.getAverageRainfall();
	   System.out.println("The average monthly rainfall: "+ decimals.format(averageRainfall));
	   
	   // Display the month with the most rain
	   monthOfMostRain = rainInYear.getOfMostRainfall();
	   System.out.println("The month with the most rain: " + rainfallInYear[monthOfMostRain]+
			               " in " + months[monthOfMostRain]);
	}
	
	// getRainFallValues method prompts the user for the 
	// rainfall in very month in a year and stores
	// that monthly rainfall in the year
	
	public static void getRainfallValues(double[] rainfallInEachMonth, String[] monthNames)
	{
		// create an object for Scanner class
		Scanner input = new Scanner(System.in);
		
		// get the rain in every month
		for(int i =  0; i < rainfallInEachMonth.length; i++)
		{
			// prompt the user for rainfall in a month
			System.out.println("Enter the total rainfall in the month of" +
			                    monthNames[i] + ": ");
		
			rainfallInEachMonth[i] = input.nextDouble();
			
			// Verify whether the rain in the month is negative
			while(rainfallInEachMonth[i] < 0)
			{
				System.out.println("Enter positive value for rainfall: ");
				rainfallInEachMonth[i] = input.nextDouble();
			}
		}
		  System.out.println();
	}

}
