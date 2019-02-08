import java.util.Scanner;

public class Division 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
	    double number1,number2;
	    double quotient;
	    
	    System.out.println("Enter the first number:");
	    number1 = keyboard.nextDouble();
	    
	    System.out.println("Enter the second number:");
	    number2 = keyboard.nextDouble();
	    
	   if(number2 == 0)
	   {
		   System.out.println("It is not possible to divide a number by 0");
	   }
	   else
	   {
		   quotient = (number1 / number2);
		   System.out.println("The division of " + number1 + " to " + number2 + " is: " + quotient);
	   }
	}
}
