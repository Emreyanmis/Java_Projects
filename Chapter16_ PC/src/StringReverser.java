import java.util.Scanner;

public class StringReverser 
{

	public static void main(String[] args) 
	{
	    Scanner keyboard = new Scanner(System.in);
	    
	    String str;
	    
	    System.out.println("Enter a word:");
	    str = keyboard.nextLine();
	    
	    System.out.println("The reversed order of the word" + str + " is: " );
	    reverseOrder(str, (str.length() - 1));
	   
	    System.exit(0);
	}
	
	public static void reverseOrder(String str, int size)
	{
	   if(size >= 0)
		   System.out.print(str.charAt(size));
	   
	   reverseOrder(str, size -1);	
	}
}
