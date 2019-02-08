import javax.swing.JOptionPane;

/**
 * This program demonstrates the if statement
 * @author emreyanmis
 *
 */

public class AverageScore 
{

	public static void main(String[] args) 
	{
		double score1;    // To hold score 1
		double score2;    // To hold score 2
		double score3; 	 //  To hold score 3
		double average;  //  To hold the average score
		String input;     // To hold the user's input.
		
		input = JOptionPane.showInputDialog("Enter ths score #1 :");
		score1 = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter ths score #2 :");
		score2 = Double.parseDouble(input);
		
		input = JOptionPane.showInputDialog("Enter ths score #3 :");
		score3 = Double.parseDouble(input);
		
		
		average = (score1 + score2 + score3) / 3;
		
		JOptionPane.showMessageDialog(null, "The avereage is: " + average);
		
		if(average > 95)
			JOptionPane.showMessageDialog(null,average + " is a great score!");
		
		System.exit(0);
	}
}

