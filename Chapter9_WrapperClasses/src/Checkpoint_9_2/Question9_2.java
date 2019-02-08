package Checkpoint_9_2;

import java.util.*;
public class Question9_2
{
    
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String input1;
		char input;
		char r = 'r';
		
		String word = "2343";
		char ch;
		boolean status = false;
		
		int i = 0;
		while(i < 2)
		{
			if(Character.isDigit(word.charAt(i)))
				 status = true;
			i++;
		}
		
		System.out.println(status);
	
		System.out.println(Character.toUpperCase(Character.toLowerCase('A')));
		
		
		do
		{
			System.out.print("Do you want to repeat the program or quit? (R \\ Q) ");
			input1 = keyboard.nextLine();
			input = input1.charAt(0);
		    
		}while(! ((Character.toUpperCase(input) == 'R' && Character.toLowerCase(input) == 'r' ) ||
					(Character.toUpperCase(input) == 'Q' && Character.toLowerCase(input) == 'q' )));
		
		char var = '$';
		System.out.println(Character.toUpperCase(var));
		
		String str = "EmreYanmis";
		int count = 0;
		int j = 0;
		
	    while(j < str.length())
	    {
	    	if(Character.isUpperCase(str.charAt(j)) )
	    	  	count ++;
	    	  	
	    	j++;  	
	    }
	    
	    System.out.println("Number of upper case characters: " + count);
		
		
	}

}
