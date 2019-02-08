package Functional_Interfaces_and_Lambda_Expressions;

import java.util.Scanner;
public class LambdaDemo2 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		final int factor = 10;
		int num;
		
		IntCalculator multiplier = x -> x * factor;

		System.out.print("Enter an integer number: ");
		num = keyboard.nextInt();
		
		System.out.print("Multiplied by 10, that number is: " + multiplier.calculate(num));
			
	}

}
