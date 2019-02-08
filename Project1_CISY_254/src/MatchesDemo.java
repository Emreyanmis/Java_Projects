//  Programmed by Halis Emre Yanmis
//  TesterClass

import java.util.Scanner;

public class MatchesDemo 
{
    // The main method 
	public static void main(String[] args) 
	{
		int l,d,w;
		String name,
		        arg;
		
		l = 0;
		d = 0;
		w = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is the name of your team : ");
		name = keyboard.nextLine();
		
		System.out.print("What is the name of your league: " );
		arg = keyboard.nextLine();
		
		System.out.print("Enter the number of matches your team won: ");
		w  = keyboard.nextInt();
		
		System.out.print("Enter the number of matches your team lost: ");
		l  = keyboard.nextInt();
		
		System.out.print("Enter the number of matches your team had draw: ");
		d  = keyboard.nextInt();
		
        // Refers back to Matches class using its object called points
		Matches points = new Matches(w ,l, d);		

	}

}
