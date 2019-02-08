
public class RainFall 
{

	public static void main(String[] args)
	{
		   private double[] rainInYear;
		  
		  private static void RainFall(double[] rainfallInEachMonth)
		  {
	      	 rainInYear = new double[rainfallInEachMonth.length];
		  }
	      
		  // store the rainfall
		  for(int i = 0; i < rainfallInEachMonth.length;i++)
		  {
			  rainInYear[i] = rainfallInEachMonth[i];
		  }
   
	}
	
	public double getTotalRainfall()
	{
		// local variable
		double totalRainfall = 0.0;
		
		// calculate the total rainfall in the year
		for(int i = 0 ; i < rainInYear.length;i++)
			totalRainfall += rainInYear[i];
		
		// Return the total rainfall
		return totalRainfall;
	}
	
	// getAverageRainfall method calculates mand returns the average rainfall in a year
	public double getAverageRainfall()
	{
		 double averageRainfall = 0.0;
		
		averageRainfall = getTotalRainfall() / rainInYear.length;
		
		return averageRainfall;
	}
	
	public int getMonthOfMostRainfall()
	{
		double most;
		int monthNumber;
		
		most = rainInYear[0];
		monthNumber = 0;
		
		// loop finds the month of the most rainfall
		for(int i = 0; i < rainInYear.length;i++)
		{
			if(rainInYear[i] > most)
			{
				most = rainInYear[i];
				monthNumber = i;
			}
		}
		
		return monthNumber;
	}
	
	public int getMonthOfLeastRainfall()
	{
		 double least;
		 int monthNumber;
		 
		 least = rainInYear[0];
		 monthNumber = 0;
		 
		 // loop finds the month of the least rainfall
		 for(int i = 0; i < rainInYear.length; i++)
		 {
			 if(rainInYear[i] < least)
			 {
				 least = rainInYear[i];
				 monthNumber = i;		 
			 }
		 }
		 
		 return monthNumber;
	}
}
