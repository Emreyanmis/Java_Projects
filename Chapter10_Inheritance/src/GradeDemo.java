import javax.swing.JOptionPane;

public class GradeDemo 
{

	public static void main(String[] args) 
	{
		String input;
		double score;
		
		GradedActivity grade = new GradedActivity();
		
		input = JOptionPane.showInputDialog("Enter yout test score: ");
		score = Double.parseDouble(input);
		
		grade.setScore(score);
		JOptionPane.showMessageDialog(null, " Your letter grade is: " + grade.getGrade());
	}
}
