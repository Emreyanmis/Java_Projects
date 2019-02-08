import java.util.Scanner;

public class RecursivePowerMethod 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		int x,y;
		
		System.out.print("Enter an integer: ");
		x = keyboard.nextInt();
		
		System.out.print("Enter another integer: ");
		y = keyboard.nextInt();
		
		System.out.print( x + " power " + y + " is: " + powerMethod(x,y));
		
	}
	
	public static int powerMethod(int x, int y)
	{
		if(y == 0)
			return 1;
		else
			return x * powerMethod( x, y - 1);
	}	

}
