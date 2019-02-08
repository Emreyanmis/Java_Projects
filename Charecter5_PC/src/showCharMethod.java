
public class showCharMethod 
{

	public static void main(String[] args)
	{
		showChar("NEW YORK", 2);
	}
	
	public static void showChar(String str, int num)
	{
		char character;
		character = str.charAt(2);
		
		 System.out.println("The character: " + character);
		 System.out.println("The number: " + num);
	}

}
 