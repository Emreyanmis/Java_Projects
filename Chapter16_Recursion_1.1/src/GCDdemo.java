import java.util.Scanner;

public class GCDdemo 
{

	public static void main(String[] args) 
	{
		Scanner keybaord = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Enter an integer:");
		x = keybaord.nextInt();
		
		System.out.println("Enter another integer:");
		y = keybaord.nextInt();
		
		System.out.println("The greatest common dinaminator of " + x + " and " + y + " is: " + gcd(x,y));
	}
	
	public static int gcd(int num1,  int num2)
	{
		if( num1 % num2 == 0)
			return num2;
		else 
		    return gcd(num2, num1 % num2);
		
	}

}
