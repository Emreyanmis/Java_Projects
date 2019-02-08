package Question7_PC;

import java.util.Scanner;
public class Check_Writer
{
	static final String[] tensPayNames = {""," ten", " twenty" , " thirty", " forty", " fifty", " sixty", " seventy", " eighty", " ninety"};
	
	static final String[] numPayNames = {"", " one ", " two", " three" , " four", " five" ," six", " seven", " eight", " nine" , " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen",
								" sixteen", " eighteen" , " nineteen"};
	

	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		String name, date;
		double check;
		
		System.out.print("Enter the payee's name: ");
		name = keyboard.nextLine();
		
		System.out.print("Enter the date \nFormat: MM/DD/YYY : " );
		date = keyboard.nextLine();
		
		System.out.print("Enter the amount of the check: $");
		check = keyboard.nextDouble();
		
	}
	
	public static String Converts(int number)
	{
		String favor;
		
		if(number % 100 < 200)
		{
			favor = numPayNames[number % 100];
			number /= 100; 
		}
		else
		{
			favor = numPayNames[number  % 10];
			number /= 10;
			favor = numPayNames[number  % 10] + favor;
			number /= 10;
		}	
		if(number == 0)
			return favor;
		
		return numPayNames[number] + " hundred " + favor;
	} 

}
