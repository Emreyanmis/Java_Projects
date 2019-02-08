package Question3_PC;


import java.util.Scanner;
public class SentenceCapatilizer 
{

	public static void main(String[] args)
	{
		Scanner keybaord = new Scanner(System.in);
		String input;
		
		System.out.print("Enter a string: ");
		input = keybaord.nextLine();
		
		System.out.println("I got you: "+ format(input));
		
	}
	
	public static String format(String str)
	{
		StringBuilder strb = new StringBuilder(str);
		int i;
		
		if(strb.length() > 0)
		   strb.setCharAt(0, Character.toUpperCase( strb.charAt(0) ) );
	    
		i = strb.indexOf(" ");
		
		while(i !=  -1)
		{
			i++;
			
			while(i < strb.length() && strb.charAt(i) == ' ')
				i++;
			
			strb.setCharAt(i, Character.toUpperCase(strb.charAt(i)));
			
			i = strb.indexOf(" ", i);
			
		}
		
		return strb.toString();
		
     		
	}

}
