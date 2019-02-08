package Question5_PC;

import java.util.Scanner;
public class Password_Verifier_Demo 
{

	public static void main(String[] args) 
	{
	   Scanner keyboard = new Scanner(System.in);
	   String input;
	   
	   System.out.print("Your password has to meet the following criteria:"
	   		+ "\n1- The password should be at least six characters long."
	   		+ "\n2- The password should contain at least one uppercase and at least one lowercase letter"
	   		+ "\n3- The password should have at least one digit\n\nEnter your password:");
	    input = keyboard.nextLine();
	    
	    Password_Verifier demo = new Password_Verifier(input);
	    
	    if(demo.getLength() == true && demo.getDigit() == true && demo.getLetters() == true)
	    	System.out.println("Your password is valid");
	    else 
	    {	
	    	System.out.println("Your password is NOT valid");
	    	System.out.println("Correctnes of your password:\nLength: " + demo.getLength() +
	    			         "\nDigit: " + demo.getDigit() + "\nLetters: " + demo.getLetters());
	    }	
	       
	}

}
