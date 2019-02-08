import java.util.Scanner;
import java.lang.Math;

public class PresentValue 
{

	public static void main(String[] args) 
	{
		Scanner keybaord = new Scanner(System.in);
		int P,F = 10000 , r,n, ps;
		
		System.out.print("Enter the amount you need to deposit today: $");
		P = keybaord.nextInt();
		
		System.out.print("Enter the annual interest: ");
		r = keybaord.nextInt();
		
		System.out.print("Enter the number of years that you plan to let the money sit in the account: ");
		n = keybaord.nextInt();
	
		ps = presentValue(P,F,r,n);
		
		System.out.println("The present value is: " + ps);
	}
	
	public static int presentValue(int P , int F , int r , int n)
	{
		P = (int) (F / (Math.pow((1+r), n)));
		
	   return P;
	}
}
