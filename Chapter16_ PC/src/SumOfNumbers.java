import java.util.Scanner;

public class SumOfNumbers 
{

	public static void main(String[] args)
    {   
		Scanner keyboard = new Scanner(System.in);
		int x;
		
        System.out.print("Enter the last term of integers you want: ");
        x = keyboard.nextInt();
        
        for(int i = 0; i < x ; i++)
        	   System.out.print((i + 1) + " ");
        
        System.out.println();
        System.out.println("The sum of all the integers form 1 up to " + x + " is: " + sum(1,x));
        
	}
	
	public static int sum(int start , int last)
	{    
		
		if(start == last)
			return last;
		else 
			return last + sum(start, last-1);	
		 		
	}

}
