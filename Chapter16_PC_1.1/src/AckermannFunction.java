import java.util.Scanner;

public class AckermannFunction 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int x,y;
		
		System.out.print("Enter an integer: ");
		x = keyboard.nextInt();
		
		System.out.print("Enter another integer: ");
		y = keyboard.nextInt();
		
		System.out.print("Ackermann's function is : " + ackermann(x,y));
	}
	
	public static int ackermann(int m, int n)
	{
		if(m == 0)	
			return n + 1;
		else if (n == 0)
			return ackermann(m-1,  1);
		else
			return ackermann(m - 1, ackermann(m , n -1 ));	
	}
}
