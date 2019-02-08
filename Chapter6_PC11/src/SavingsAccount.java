
public class SavingsAccount 
{
	private double savingAccountBalance;
	private double balance,totalWithdraw, totalDeposit, totalInterest, annualInterestRate,
					monthlyInterestRate;

	public SavingsAccount(double savingAccountBalance) 
	{
		balance = savingAccountBalance;
	}

	/**
	 * @return the savingAccountBalance
	 */
	public double getSavingAccountBalance()
	{
		return savingAccountBalance;
	}

	/**
	 * @param savingAccountBalance the savingAccountBalance to set
	 */
	public void setSavingAccountBalance(double savingAccountBalance) 
	{
		this.savingAccountBalance = savingAccountBalance;
	}
	
	public void withdrawal(double amount)
	{
	   balance -= amount;
	   totalWithdraw -= amount;
	}
	
	public void deposit(double amount)
	{
		balance += amount;
		totalDeposit += amount;
		
	}

	public void setAnnualInterest(double annual_InterestRate)
	{
		annualInterestRate = annual_InterestRate;
		monthlyInterestRate = annualInterestRate / 12;	
	}
	
	public void calculateMonthlyInterstRate()
	{
		totalInterest = totalInterest + balance * monthlyInterestRate;
		
		balance = balance + balance * monthlyInterestRate;
	}
	
	public void displayData()
	{
		System.out.println("The ending balance:              $" + balance);
		System.out.println("The total amount of withdrawals: $" + totalWithdraw);
		System.out.println("The total amount of diposits:    $" + totalDeposit);	
		System.out.println("The total interest rate earned:  $" + totalInterest);
	}
	 
}
