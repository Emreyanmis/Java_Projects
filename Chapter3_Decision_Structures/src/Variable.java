import javax.swing.JOptionPane;

/**
 * This program demonstrates how variables may be declared in various locations throughout
 * a program
 * @author emreyanmis
 */
public class Variable 
{
   public static void main(String[] args)
   {
	   String firstName;
	   firstName = JOptionPane.showInputDialog("Enter your first name:");
	   
	   String lastName;
	   lastName = JOptionPane.showInputDialog("Enter your last name:");
	   
	   JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName + " !");
   }
}
