package CharacterClass_9_2;

import javax.swing.JOptionPane;
public class CustomerNumber 
{

	public static void main(String[] args) 
	{
		String input;
		
		input = JOptionPane.showInputDialog("Enter a customer number in the form LLLNNNN\n"
				+ " (LLL = letters and NNNN = numbers.");
		
		if(isValid(input))	
			JOptionPane.showMessageDialog(null, "That is a valid customer number");
		else
			JOptionPane.showMessageDialog(null, "That is not the proper format of a customer "
					+ " number.\nHere is an example: ABC1234");
		
		System.exit(0);
	}
	
	public static boolean isValid(String custNumber)
	{
		boolean status = true;
		int i = 0;
		
		if(custNumber.length() != 7)
			status = false;
		
		while(status && i < 3)
		{
			if(!Character.isLetter(custNumber.charAt(i)))
				status = false;
			i++;
		}
		
		while(status && i < 7)
		{
			if(!Character.isDigit(custNumber.charAt(i)))
				status = false;
			i++;
		}
		
		return status;
	}

}
