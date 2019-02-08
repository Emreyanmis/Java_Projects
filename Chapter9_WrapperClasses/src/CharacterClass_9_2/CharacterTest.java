package CharacterClass_9_2;

import javax.swing.JOptionPane; 
public class CharacterTest 
{

	public static void main(String[] args)
	{
		String input;
		char ch;
		
		input  = JOptionPane.showInputDialog("Enter any single character.");
		ch = input.charAt(0);
		
		if(Character.isLetter(ch))
		{
			JOptionPane.showMessageDialog(null, "That is a letter");
		}
		
		if(Character.isDigit(ch))
		{
			JOptionPane.showMessageDialog(null, "That is a digit");
		}
		
		if(Character.isLowerCase(ch))
			JOptionPane.showMessageDialog(null, "That is a lowercase letter.");
		
		if(Character.isUpperCase(ch))
			JOptionPane.showMessageDialog(null, "That is a uppercase letter.");
		
		if(Character.isSpace(ch))
			JOptionPane.showMessageDialog(null, "That is a space.");
		
		if(Character.isWhitespace(ch))
			JOptionPane.showMessageDialog(null, "That is a whitespace character.");
		
		System.exit(0);
	}
	
	

}
