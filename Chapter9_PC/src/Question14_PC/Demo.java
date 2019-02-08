package Question14_PC;

import java.util.Scanner;
public class Demo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String input;
		
		System.out.print("Enter a sente that every word starts with a capital letter: ");
		input = keyboard.nextLine();
		
		System.out.println("The new sentence: " +  Word_Separator.format(input));
		
	}

}
