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
			System.out.println("The et will free");
		

	}


}
