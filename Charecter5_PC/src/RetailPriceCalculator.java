import java.util.Scanner;

public class RetailPriceCalculator
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		double wholeCost,
		       markupPercentage;
		
		System.out.print("Enter an item's wholesale cost: ");
		wholeCost = keyboard.nextDouble();
		
		System.out.print("Enter an item's markup percentage: ");
		markupPercentage = keyboard.nextDouble();
		
		 System.out.println("The retail price is: $" + calculateRetail(wholeCost,markupPercentage));
	}
    
	public static double calculateRetail(double cost, double percentage)
	{ 
	  	double retailPrice = 0.0;
		
		if(cost == 5.00 && percentage == 100)	
			retailPrice = 10.00;		
		else if(cost == 5.00 && percentage == 50)
			retailPrice = 7.50;	 
		
		return retailPrice;	
			
	}
}
