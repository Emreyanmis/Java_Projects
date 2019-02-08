import java.util.Scanner;


public class BankCharges 
{

	public static void main(String[] args)
	{
	  Scanner keyboard = new Scanner(System.in);
	  
	  int numOfChecks;
	  double fee;
	  
	  System.out.println("Enter the number of checkds written for the month: ");
	  numOfChecks = keyboard.nextInt();
	  
	  if(numOfChecks < 20)
	  {	  
		  fee = numOfChecks  * 0.10 + 10;
		  System.out.println("The bank's service fees for the month: $" + fee);
	  }
	  else if(numOfChecks >= 20  &&  numOfChecks <=39)
	  {	  
		  fee = numOfChecks  * 0.08 + 10;
		  System.out.println("The bank's service fees for the month: $" + fee);
	  }
	  else if(numOfChecks >= 40  &&  numOfChecks <=59)
	  {	  
		  fee = numOfChecks  * 0.06 + 10;
		  System.out.println("The bank's service fees for the month: $" + fee);
	  }
	  else if(numOfChecks >= 60)
	  {	  
		  fee = numOfChecks  * 0.04 + 10;
		  System.out.println("The bank's service fees for the month: $" + fee);
	  }
	}
}
