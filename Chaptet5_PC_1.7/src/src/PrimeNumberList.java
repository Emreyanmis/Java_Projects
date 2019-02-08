import java.util.Scanner;

public class PrimeNumberList 
{

	public static void main(String[] args) 
	{	
		
      int number;
      boolean prime;
      
      System.out.println("The list of prime numbers: ");
    
      for(int j = 1; j <= 100; j++)
		{		  
    		  
    	  	prime = isPrime(j);	
      
    	  	if(prime == true)
    	  		System.out.println(j + " is a prime number!");
		}
	}
	
	public static boolean isPrime(int j)
	{
		
		
			int count = 0;
		
			for(int i = 2; i <= j / 2 ; i++)
			{
				if(j % i == 0)
					count++;
			}
		
			if(count > 0)
				return false;
			else
				return true;		
				
	}		
}