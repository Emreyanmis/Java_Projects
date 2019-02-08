import java.util.Scanner;
public class FibNumbers 
{

	public static void main(String[] args)
	{
        Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter what term of fibonacci numbers you want to find : ");
		int x = keyboard.nextInt();
		
		System.out.println("The first " + x +" elements of fibonacci numbers: ");
		
		int sum = 0;
		

		for(int i = 0; i < x; i++)
		{
			System.out.print(fib(i) + " ");
			sum += fib(i);
		}
		System.out.println();
		System.out.println("The sum " + x +" elements of fibonacci numbers: " + sum);

	}
	
	public static int fib(int n)
	{
		if(n == 0)
			return 0; // base case
		else if (n == 1)
		    return 1; // base case
		else
			return fib(n-1) + fib(n-2);
	}

}
