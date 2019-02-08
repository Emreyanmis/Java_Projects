import java.util.Scanner;

public class Question7 
{

	public static void main(String[] args)
	{
	    Scanner keybaord = new Scanner(System.in);
	    
	    int n;
	    
	    System.out.print("Enter a number to find its factor: ");
	    n = keybaord.nextInt();
	    
	    System.out.print(n + "! is: " + factorial(n));
	}
	
	public static int factorial(int n)
	{
		int fact = 1;
		
		for(int i = 1; i <= n; i++)
		{
			fact = fact * i;
		}
		return fact;
	}
}
