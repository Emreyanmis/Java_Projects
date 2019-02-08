package Passing_Objects_as_Arguments_to_Methods;


import javax.swing.JOptionPane;
public class ReturnObject 
{

	public static void main(String[] args) 
	{
		BankAccount account;
		
		account = getAccount();
		
		JOptionPane.showMessageDialog(null,"The account has a balance of $" +
									 account.getBalance());

	}
	
	public static BankAccount getAccount()
	{
		String input;
		double balance;
		
		input = JOptionPane.showInputDialog("Enter the account balance:");
		balance = Double.parseDouble(input);
		
		// Create a BankAccount object and return a reference to it.
		return new BankAccount(balance);
	}

}
