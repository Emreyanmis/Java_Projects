import java.util.Scanner;

public class Question6 
{

	public static void main(String[] args) 
	{
		 Scanner keybaord = new Scanner(System.in);
		 
		 int n;
	     
		 System.out.print("Enter the number of times you want to see the sign: ");
		 n = keybaord.nextInt();
		 
		 sign(n);
	}
	
	public static void sign(int x)
	{
		if(x > 0)
		{	
			System.out.println("No Parking");
			sign(x-1);
		}
	}

}
