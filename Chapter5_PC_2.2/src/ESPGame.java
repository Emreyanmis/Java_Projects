import java.util.Scanner;
import java.util.Random;

public class ESPGame 
{

	public static void main(String[] args)
	{
		Random randomColor = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int choice1;
		int correct = 0 , incorrect = 0;
		String color2,color3, color4, color5;
		String input;
		
		for(int i= 0; i < 10; i++)
		{	
		   String color1;
			
			choice1 = randomColor.nextInt(4);
			color1 =  compChoice(choice1);
			
			System.out.print("Choose of of the following colors:\n"+ "Red\n" + "Green\n" 
			                 + "Blue\n" + "Orange\n" +"Yellow\n" + "Enter your choice: " );
			
		    	input = keyboard.nextLine();
		    	
		    	if(color1.equalsIgnoreCase(input))
		    	{	
		    		System.out.println("You guessed correctly!\n");
		    		correct++;
		    	}	
		    	else
		    	{	
		    		System.out.println("You guessed incorrectly!\n");
		    		incorrect++;
		    		
		    	}	
		    
			
		}
		System.out.println("Number of correctly guess is: " + correct);
		System.out.println("Number of incorrectly guess is: " + incorrect);
	
	}
	
	public static String compChoice(int choice1)
	{
		String color1 = null;
		
		if(choice1 == 0)
			color1 = "Red";
		else if(choice1 == 1)
			color1 = "Green";
		else if(choice1 == 2)
			color1 = "Blue";
		else if(choice1 == 3)
			color1 = "Orange";
		else if(choice1 == 4)
			color1 = "Yellow";
		
		return color1;
		
	}

}