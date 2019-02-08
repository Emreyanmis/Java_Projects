package Question11_PC;


public class Sales_Analysis 
{
	public double getTotalSales(double[] sales)
	{
		double total = 0.0;
		
		for(int i = 0; i < sales.length; i++)
		{
			 total += sales[i];
		}
		
		return total;
	}
	
	public double getAverageDaily(double total)
	{
		double average;
		
		average = total  / 7;
	
		return average;
	}
	
	public int getHighestWeekSales(double totalSales1, double totalSales2, 
								   double totalSales3)
	{
		if(totalSales1 > totalSales2 &&  totalSales1 > totalSales3)
			 return 1;
		else if(totalSales2 > totalSales3 &&  totalSales2 > totalSales1)
			return 2;
		else
			return 3;
	}
	
	public int getLowestWeekSales(double totalSales1, double totalSales2, 
			   double totalSales3)
	{
			if(totalSales1 < totalSales2 &&  totalSales1 < totalSales3)
				return 1;
			else if(totalSales2 < totalSales3 &&  totalSales2 < totalSales1)
				return 2;
			else
				return 3;
	}
	
	
	
		
        


}
