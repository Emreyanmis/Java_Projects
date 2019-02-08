import java.util.Scanner;

public class Question1 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String str;
		
		System.out.print("Enter your name:");
		str = keyboard.nextLine();
		
		System.out.print("Enter your name was :");
		inOrder(str,0);
	}
	
	public static void inOrder(String n, int j)
	{
		
		if( j < n.length())
		{	
			System.out.print(n.charAt(j));
		    inOrder(n, j + 1);	  
		}   
	}

}
