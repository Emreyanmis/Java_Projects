import java.util.Scanner;

public class TemperatureClassDemo
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int value;
		
		System.out.print("Enter the temperature in Fahrenheit: ");
		value = keyboard.nextInt();
		
		TemperatureClass temperature = new TemperatureClass(value);
		
		System.out.println("The temperature in Celcius: " + temperature.getCelcius() +
				           "\nThe temperature in Kelvin: " + temperature.getKelvin());
	}

}
