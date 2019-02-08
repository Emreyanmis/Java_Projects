package Question10;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class ProductionWorkerDemo 
{
	final static String DATE_FORMAT = "dd/mm/yyyy";
	
	public static void main(String[] args) throws InvalidEmployeeNumber, InvalidShift, InvalidPayRate
	{
		Scanner keyboard = new Scanner(System.in);
		String name, employeeNumber,hireDate;
		int shift;
		double payRate;
		
		System.out.print("Enter the employee name: ");
		name = keyboard.nextLine();
		
		System.out.print("Enter the employee number in the format XXX-L, where each X is a digit"
				+ "\nwithin the range of 0-9 and the L is a letter within the range A-M: ");
		employeeNumber = keyboard.nextLine();
		
		do 
		{
			System.out.print("Enter the hire date in the form of dd/mm/yyyy: ");
			hireDate = keyboard.nextLine();
			
			SimpleDateFormat demo1 = new SimpleDateFormat("dd/mm/yyyy");
			
			if(hireDate.length() != 10)
			{	
				System.out.println("Please try to enter the date again!\nDon't"
									+ " forget to use slashes('/') ");
			}	
		
		} while(hireDate.length() != 10);
	   
		System.out.print("Enter your shift (1 = Day Shift or 2 = Night Shift): ");
		shift = keyboard.nextInt();
		
		System.out.print("Enter your hourly pay rate: $" );
		payRate = keyboard.nextInt();
		
		System.out.println("Here is your information: " );
		ProductionWorker demo2 = new ProductionWorker(name, employeeNumber, hireDate,shift, payRate);
		System.out.print(demo2);
	
	}

}
