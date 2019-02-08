import java.util.Scanner;

public class Question1 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String str;
		
		System.out.print("Enter your name:");
		str = keyboard.nextLine();
		
		System.out.print("Enter your name was :" + inOrder(str, (str.length() - 1)));	
	}
	
	public static String inOrder(String n, int j)
	{
		if(j >= 0)
			return n;
		else
			return inOrder(n, j - 1);			
	}

}
