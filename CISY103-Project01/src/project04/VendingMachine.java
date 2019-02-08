package project04;

//Author: Didar Sounov
//Course: CISY 103
//Date: 12/06/2018
//Instructor: Linda Yang

import java.util.*;
public class VendingMachine
{
    static double balance = 0.0;
    static String userInput;
    static char input;
    static final double ITEM_PRICE = 1.25;
	
	public static void main(String[] args)
	{
		Scanner keybaord = new Scanner(System.in);
			
		do
		{
			System.out.println("Item cost: $" + ITEM_PRICE + ", Balance: $" + balance );	
			System.out.print("\nEnter Money(Q,D,N,B for Bill) or command(R,P,X): ");
			userInput = keybaord.nextLine();
			input = userInput.charAt(0);
			input = Character.toLowerCase(input);

			if(input == 'n')
				getBalance('n');
			else if (input == 'd')
				getBalance('d');
			else if (input == 'q')
				getBalance('q');
			else if (input == 'b')
				getBalance('b');
			else if (input == 'r')
				System.out.println("Money returned: $" + balance);	
			else if (input == 'p')
				getBalance('p');
			else
				System.out.println("Invalid Coin or Bill or Comand");
				
		}while(input != 'x');
		
		System.exit(0);
	}
	
	public static String getBalance(char input)
	{
		input = Character.toLowerCase(input);
		
		if(input == 'b')
			balance += 1;
		else if(input == 'q')
			balance += 0.25;
		else if(input == 'd')
			balance += 0.10;
		else if(input == 'n')
			balance += 0.05;
		else if(input == 'p')
		{	
			if(balance > 1.25)
			{	
				balance = balance - ITEM_PRICE ;
				System.out.println("\nGot the product with change: $" + balance);
			}	
			else
				System.out.println("\nUnable to Dispense!");
				
		}
		return String.valueOf(balance) ;
	}

}
