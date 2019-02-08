package Question9_PC;


import java.util.Scanner;
public class Sum_of_Digits_in_a_String 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String input;
		int sum = 0 ;
		String sum1 = null;
		
		System.out.print("Enter a series of single digit numbers with nothing"
						 + " separating them: ");
		input = keyboard.nextLine();
		
      String [] array = new String[input.length()];
       
      int  highest = 0;
      int  lowest = Integer.parseInt(input);
      int h , l;
      for(int i = 0; i < input.length(); i++)
      {  	 
    	  /** 
    	  System.out.println("sum: " + sum);
    	  System.out.println("char: " + input.charAt(i));
    	  */
    	  
    	  sum1 = Character.toString(input.charAt(i));
    	  h = Integer.parseInt(sum1);
    	  l = Integer.parseInt(sum1);
    	  if(highest < h )
    		  highest = h;
    	  if(lowest > l)
    		  lowest = l;
    	    	  
    	  sum = sum + Integer.parseInt(sum1);
   	  
      }
      
      System.out.println("Sum: " + sum);
      System.out.println("Highest digit: " + highest);
      System.out.println("Lowest digit: " + lowest);

	}

}
