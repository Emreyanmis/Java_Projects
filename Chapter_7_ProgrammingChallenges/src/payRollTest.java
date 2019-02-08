import java.util.Scanner;

public class payRollTest 
{

	public static void main(String[] args)
	{
		System.out.println("     Payroll Application     ");
		PayRoll payroll = new PayRoll();
		Scanner keyboard = new Scanner(System.in);
		
		// Variable declaration
		int  employeeID,hours;
		double payRate, wages;
		
		// Loop repeats for all 7 employees
		for(int i = 0; i < 7; i++)
		{
			System.out.print("Employee #" + (i + 1));
			 
			// get the hours
			do
			{	
			System.out.print("\n\tHours: ");
			hours = Integer.parseInt(keyboard.nextLine());
			}
			while(hours < 0 );
			payroll.setHours(i, hours);
			do
			{
				System.out.print("\tPay Rate: ");
				payRate = Double.parseDouble(keyboard.nextLine());
			}
			while( payRate < 6.00);
			payroll.setPayRate (i, payRate);
			employeeID = payroll.getEmployeeID(i);
			wages = payroll.calculateGrossPay(employeeID);
			payroll.setWages(i, wages);					
		}
		
		// display each employee's ID and gross pay
		System.out.println("        ");
		for(int i = 0; i <  7; i++)
		{
			System.out.println("Employee ID: " + payroll.getEmployeeID(i));
			System.out.println("\tGross Wages: " + payroll.getWages(i));
		}		
		// Exit the program
		System.out.println(0);
	}

}
