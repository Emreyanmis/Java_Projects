package Question2;

public class BankAccountDemo 
{

	public static void main(String[] args) 
	{
		
		
		BankAccount account1 = new BankAccount(90.65);
		
		// Make a BankAccount variable and make it reference a copy of the 
		// object referenced by the account1
		BankAccount account2 = account1.copy();
		
		System.out.println("Your current balance: " + account1.getBalance());
		System.out.println("Your current balance: " + account2.getBalance());
        
		
		/**
		BankAccount[] account = new BankAccount[50];
		
		for(int i = 0; i < account.length; i++)
		{	
			 account[i] = new BankAccount(94.65);
			 System.out.println(account[i].getBalance());
             			
		}
		*/

	}

}
