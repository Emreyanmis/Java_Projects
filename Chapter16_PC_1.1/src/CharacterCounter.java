import java.util.Scanner;

public class CharacterCounter 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		char[] characters = {'a','v','g','a','j','s','e','e','r','q','o'};
		char search;
		int count, position = 0;
		String input;
		
		System.out.print("Enter a character to search for its occurence: ");
		input = keyboard.nextLine();
		
		search = input.charAt(0);
		
		count = CountOcurrance(characters,search,position);
		
		System.out.print(input + " occurance is: " +  count);
	}
	
	public static int  CountOcurrance(char[] array, int search, int position)
	{
		if(position < array.length)
		{
			if(search == array[position])
				return 1 + CountOcurrance( array, search, position + 1);
			else
				return CountOcurrance( array, search, position + 1);
		}
		return 0;
	}

}
