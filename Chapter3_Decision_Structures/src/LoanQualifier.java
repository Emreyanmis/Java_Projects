import javax.swing.JOptionPane;
/**
 * This program demonstrates a nested if statement.
 * @author emreyanmis
 *
 */

public class LoanQualifier 
{
	public static void main(String[] args)
	{
	   double salary;
	   double yearsOnJob;
	   String input;
	   
	   input = JOptionPane.showInputDialog("Enter your annual salary:");
	   salary = Double.parseDouble(input);
	   
	   input = JOptionPane.showInputDialog("Enter the number of years at your current job:");
	   yearsOnJob = Double.parseDouble(input);
	   
	   if(salary >= 30000)
	   {
		   if(yearsOnJob >= 2)
		   {
			   JOptionPane.showMessageDialog(null, "You qualify for the loan!");
		   }
		   else
		   {
			   JOptionPane.showMessageDialog(null,"You must have been at your current job for"
			   		+ " at least 2 years.");
		   }	   
	   }
	   System.exit(0);
	}
}
