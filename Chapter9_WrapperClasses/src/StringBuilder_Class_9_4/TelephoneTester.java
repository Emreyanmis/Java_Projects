package StringBuilder_Class_9_4;


import java.util.Scanner;
public class TelephoneTester 
{

	public static void main(String[] args) 
	{
		String phoneNumber;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a unformatted telephone number: ");
		phoneNumber = keyboard.nextLine();
		
		// Format the telephone number
		System.out.print("Formatted: " + Telephone.format(phoneNumber));
		
		// Get a formatted telephone number
		System.out.println("Enter a telephone number formatted as");
		System.out.print("(XXX) XXX-XXXX : ");
		phoneNumber = keyboard.nextLine();
		
		// Unformat the telephone number.
		System.out.println("Unformatted: " + Telephone.unformat(phoneNumber));
		

	}

}
