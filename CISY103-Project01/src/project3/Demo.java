package project3;

import java.util.Scanner;
public class Demo 
{
	public static void main(String[] args)
	{
		Scanner keybaord = new Scanner(System.in);
		char input;
		
		
		System.out.print("Item Cost ");
		input = keybaord.next().charAt(0);
		
		input = Character.toLowerCase(input);
		if(input == 'y')
		{
			System.out.print("\nB- 1.00 , H - 0.5,  Q - 0.25, N - 0.05, D - 0.10: ");
			input = keybaord.next().charAt(0);
			input = Character.toLowerCase(input);
			
			
			Vender demo = new Vender(1.25, 0.0, 0.0, input);
			
			System.out.println("Total: " + demo.getTotal());
		}
		
			
	}

}
