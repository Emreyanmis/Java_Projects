import java.util.Scanner;

public class PaintJobEstimator 
{

	public static void main(String[] args) 
	{
	  Scanner keyboard = new Scanner(System.in);
	  
	  int  numOfRooms,
	       squareFeetOfEachRoom,
	       paintRequired;
	  
	 double  pricePaintPerGallon,
	         paintCost,
	         laborHourRequired,
	         labor,
	         paint;
	  
	  System.out.print("Enter the number of rooms to be paineted: ");
	  numOfRooms = keyboard.nextInt();
	  
	  System.out.print("Enter the price of the paint per gallon: ");
	  pricePaintPerGallon = keyboard.nextDouble();
	  
	  System.out.print("Enter the square feet of wall space in each room : ");
	  squareFeetOfEachRoom = keyboard.nextInt();
	  
	  paintRequired = getPaintRequired(numOfRooms , squareFeetOfEachRoom);
	  
	  laborHourRequired = getHoursLaborRequired(paintRequired);
	  
	  labor  = laborCharges(laborHourRequired);
	  
	  paint = paintCost(paintRequired, pricePaintPerGallon);
	  
	  totalCost(labor, paint);
	  
	}
	
	public static int getPaintRequired(int rooms, int squareFeet)
	{
		int paintRequired;
		
		paintRequired = rooms * squareFeet;
		
		return paintRequired;
	}
	
	public static double getHoursLaborRequired(int paintRequired)
	{
		double hoursLaborRequired;
		
		hoursLaborRequired = (paintRequired / 115) / 8;
		
		return hoursLaborRequired;
	}
	
	public static double laborCharges(double laborHour)
	{
		double cost;
		
		cost = 18 * laborHour;
	
		return cost;
	}
	
	public static double paintCost(double paintRequired, double pricePaintPerGallon)
	{
		double gallons,
		      costOfPaint;
		
		gallons = paintRequired / 115;
		costOfPaint = gallons * pricePaintPerGallon;
		
		return costOfPaint;
	}
	
	public static void totalCost(double labor, double paint)
	{
         double cost;
         cost = labor + paint;
         
         System.out.println("The total cost is: $" + cost);
	}

}
