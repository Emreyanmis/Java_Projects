import javax.swing.JOptionPane; 


public class NestedDecision 
{

	public static void main(String[] args) 
	{
		double finalScore;
		String input;
		
		input = JOptionPane.showInputDialog("Enter your final score: ");
		finalScore = Double.parseDouble(input);
		
		if(finalScore <= 60)
			JOptionPane.showMessageDialog(null," You failed the course.");
		else
		{
			if(finalScore < 70)
			{
				JOptionPane.showMessageDialog(null, "You received a D");
			}
			else
			{
				if(finalScore < 80)
				{
				  JOptionPane.showMessageDialog(null,"You recieved a C");
				}
				else
				{
					if(finalScore < 90)
					{
						JOptionPane.showMessageDialog(null,"You recieved a B");
					}
					else
						JOptionPane.showMessageDialog(null,"You recieved an A");
				}
			}		
		}
		System.exit(0);
	}
}
