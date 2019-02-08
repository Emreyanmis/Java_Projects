
public class FibNumbers 
{

	public static void main(String[] args)
	{
		System.out.print("The first 10 elements of fibonacci numbers:");
		
		for(int i = 0; i < 10; i++)
			System.out.println(fib(i) + " ");
		
		System.out.println();

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
