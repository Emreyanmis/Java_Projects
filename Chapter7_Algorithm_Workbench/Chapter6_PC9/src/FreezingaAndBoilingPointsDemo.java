import java.util.Scanner;

public class FreezingaAndBoilingPointsDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int temperature;
		
		System.out.print("Enter a temperature in Fahrenheit: ");
		temperature = keyboard.nextInt();
		
		FreezingaAndBoilingPoints demo = new FreezingaAndBoilingPoints(temperature);
		
		if(demo.isEthylFreezing() == true)
			System.out.println("Ethyl Alchol will freeze at " + temperature + " Fahrenheit");
		else if(demo.isEthylBoiling() == true)
			System.out.println("Ethyl Alchol will boil at " + temperature + " Fahrenheit");
		
		if(demo.isOxygenBoiling() == true)
			System.out.println("Oxygen will boil at " + temperature + " Fahrenheit");
		else if(demo.isOxygenFreezing() == true)
			System.out.println("Oxtgen will freeze at " + temperature + " Fahrenheit");
		
		if(demo.isWaterBoiling() == true)
			System.out.println("Water will boil at " + temperature + " Fahrenheit");
		else if(demo.isWaterFreezing() == true)
			System.out.println("Water will freeze at " + temperature + " Fahrenheit");
		
			
	}

}
