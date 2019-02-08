package Question1_PC;


import java.util.Scanner;
public class BackwardString 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String input;
		
		System.out.print("Enter a string: ");
		input =  keyboard.nextLine();
		
	  format(input);
	  
	  System.exit(0);
		
	}
	
	public static void format(String str)
	{
	  
		for(int i = str.length() - 1; i >= 0; i--)
			System.out.print(str.charAt(i));
		 
		
	}

}
