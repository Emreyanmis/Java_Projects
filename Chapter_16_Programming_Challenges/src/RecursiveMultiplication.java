import java.util.Scanner;

public class RecursiveMultiplication 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int x;
		
		System.out.println("Enter an integer:");
		x = keyboard.nextInt();
		
		int y;
		
		System.out.println("Enter another integer:");
		y = keyboard.nextInt();
		
		System.out.println("The multiplication of " + x +  " and " + y + " is: " + multiplication(x,y));
	}
	
	public static int multiplication(int k , int j)
	{
		int sum = j;
		
		if(k == 1)
			return sum;
		else if (k == 0)
			return 0;
		else
			return  sum + multiplication(k -1, j);
	}
}
