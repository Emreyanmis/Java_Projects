package lab8;

import java.util.Scanner;
public class Dating 
{
	static int count = 0;
	
	public static void main(String[] args)
	{
		int myAge;
		int loveInterestAge;
		int interest;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your age: ");
		myAge = keyboard.nextInt();
			
		System.out.print("How many interests do you have: ");
		interest = keyboard.nextInt();
		
		if(interest == 0)
			System.out.println("\nWhat...no love interests????!!!");
		
		while(count < interest)
		{
			System.out.print("\nWhat is your love interst age: ");
			loveInterestAge = keyboard.nextInt();
			lover(myAge, loveInterestAge);
			count++;
		}
				
	}

	public static boolean lover(int myAge, int loveInterestAge)
	{
		
		int counter = 0;
		System.out.print("For date interest "+ (count + 1) +": ");
		counter++;
		boolean flag = false;
		
		if(loveInterestAge < myAge / 2 + 7)
		{	
			System.out.println("Too creapy -- you are too old to date this person!!!!! ");
			flag = true;
		}
		else		
			System.out.println("It's okay to date this person!!!");
			
		return flag;
	}
}
