package Question8_PC;


import java.util.Scanner;
public class Sum_of_Numbers_in_a_String 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String input;
		int sum = 0 ;
		
		System.out.print("Enter a series of numbers separated by comma: ");
		input = keyboard.nextLine();
		
		String[] tokens = input.split(",");
		
		for(int i = 0; i< tokens.length; i++)
		{
			    sum += Integer.parseInt(tokens[i]);
	    }
		
		
		System.out.println(sum);
	}
}
