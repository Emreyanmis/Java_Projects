import java.util.Scanner;

public class SavingsAccountDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double annualInterestRate1, startingBalance,add1, withwdraw1;
		int MonthsAccountLong;
		
		System.out.print("Enter the annual interest rate: ");
		annualInterestRate1 = keyboard.nextDouble();
		
		System.out.print("Enter the starting balance: $");
		startingBalance = keyboard.nextDouble();
		
		System.out.print("Enter the number of months that have passed since "
				+ "the account was established: ");
		MonthsAccountLong = keyboard.nextInt();
		
		SavingsAccount demo1 = new SavingsAccount(startingBalance) ;
		
		demo1.setAnnualInterest(annualInterestRate1);
		
		for(int i = 0; i < MonthsAccountLong; i++)
		{
			System.out.print("Enter the amount deposited into the account during the month " + (i + 1) +": $"); 
			add1 = keyboard.nextDouble();
			demo1.deposit(add1);
			
			System.out.print("Enter the amount withdrawn from the account during the month " + (i + 1) +": $"); 
			withwdraw1 = keyboard.nextDouble();
			demo1.withdrawal(withwdraw1);
			
			demo1.calculateMonthlyInterstRate();
			
        }
		
		
		System.out.println("\nThe Transactions on your account:");
		demo1.displayData();
	

	}

}
