package CharacterClass_9_2;

import java.util.Scanner;
public class CircleArea 
{

	public static void main(String[] args)
	{
		double radius;
		double area;
		String input;
		char choice;
		
		Scanner keyboard = new Scanner(System.in);
		
		do 
		{
			System.out.print("Enter the circle's radius: ");
			radius = keyboard.nextDouble();
			
			// Consume the remaining newline character
			keyboard.nextLine();
			
			area = Math.PI * Math.pow(radius, 2);
			System.out.printf("The area is %.2f.\n", area);
			
			System.out.println("Do you want to do this again? (Y or N)");
			input = keyboard.nextLine();
			choice = input.charAt(0);
			
		}while(Character.toUpperCase(choice) == 'Y');
		

	}

}
