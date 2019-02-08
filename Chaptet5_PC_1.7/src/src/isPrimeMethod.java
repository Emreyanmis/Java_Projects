import java.util.Scanner;

public class isPrimeMethod 
{

	public static void main(String[] args) 
	{
	  Scanner keyboard = new Scanner(System.in);	
		
      int number;
      boolean prime;
      
      System.out.print("Enter a number to test whether it is a prime number: ");
      number = keyboard.nextInt();
      
      prime = isPrime(number);	
      
      if(prime == true)
    	  	 System.out.println(number + " is a prime number!");
      else
    	  	System.out.println(number + " is NOT a prime number.");
	}
	
	public static boolean isPrime(int number)
	{
		int count = 0;
		
		for(int i = 2; i <= number / 2 ; i++)
		{
			if(number % i == 0)
				count++;
		}
		
		if(count > 0)
			return false;
		else
			return true;		
			
	}		
}


