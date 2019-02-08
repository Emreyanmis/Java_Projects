package Question13_PC;


import java.util.Scanner;
public class Alphabetic_Telephone_Number_Translator 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String input;
		String newInput;
		
		System.out.print("Enter a 10- character telephone number in the "
				+ "format XXX-XXX-XXXX  :");
		input = keyboard.nextLine();
		
		PhoneNumber.format(input);
		
		
		
	}
	

}
