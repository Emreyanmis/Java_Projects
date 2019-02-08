package Question2_PC;

import java.util.Scanner;
public class WordCounter 
{

	public static void main(String[] args) 
	{
		Scanner keybaord = new Scanner(System.in);
		String input;
		
		System.out.print("Enter a string: ");
		input = keybaord.nextLine();
		
		format(input);
	}
	
	public static void format(String str)
	{
		
		String[] tokens = str.split(" ");
		
		System.out.println("The number of words: " + tokens.length);
	}
}
