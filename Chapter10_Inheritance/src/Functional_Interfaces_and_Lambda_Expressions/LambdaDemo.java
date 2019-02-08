package Functional_Interfaces_and_Lambda_Expressions;

import java.util.Scanner;

public class LambdaDemo 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int num;
		
		// Create an object that implements IntCalculator class
		IntCalculator square = x -> x * x;
		
		System.out.print("Enter an integer number: ");
		num = keyboard.nextInt();
		
		System.out.println("The square of " + num + " is: " + square.calculate(num));

	}

}
