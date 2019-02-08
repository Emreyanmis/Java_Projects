
import java.util.Scanner;
	
public class InternetServiceProvider 
{
  public static void main(String args[])
  {
	  Scanner keyboard = new Scanner(System.in);
	  
	  int numOfHours;
	  double totalCharges;
	  String input;
	  
	  System.out.print("Enter the package you have purchased (A,B, or C): ");
	  input = keyboard.nextLine();
	  
	  if(input.equalsIgnoreCase("a"))
	  {
		  System.out.print("Enter number of hours were used: ");
		  numOfHours = keyboard.nextInt();
		  
		  if(numOfHours > 10)
		  {
			  totalCharges = 9.95 + ((numOfHours -10) * 2);
			  System.out.print("Your monthly bill is: $" + totalCharges);
		  }
		  else
		  {	  
			  totalCharges = 9.95;
		      System.out.print("Your monthly bill is: $" + totalCharges);
		  }   
	  }
	  else if(input.equalsIgnoreCase("b"))
	  {
		  System.out.print("Enter number of hours were used: ");
		  numOfHours = keyboard.nextInt();
		  
		  if(numOfHours > 20)
		  {
			  totalCharges = 13.95 + ((numOfHours -20) * 1);
			  System.out.print("Your monthly bill is: $" + totalCharges);
		  }
		  else
		  {	  
			  totalCharges = 13.95;
		      System.out.print("Your monthly bill is: $" + totalCharges);
		  }   
	  }
	  else if(input.equalsIgnoreCase("c"))
	  {	  
			  totalCharges = 19.95;
		      System.out.print("Your monthly bill is: $" + totalCharges);
	  }
	  else
		  System.out.print("You entered an invalid package choice!");
  }
}
