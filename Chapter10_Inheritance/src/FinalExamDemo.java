import  javax.swing.JOptionPane;

public class FinalExamDemo 
{

	public static void main(String[] args) 
	{
		String input;
		double score;
		int questions, missed;
		
		
		
		input = JOptionPane.showInputDialog("Enter number of questions on the exam: ");
		questions = Integer.parseInt(input);
		
		input = JOptionPane.showInputDialog("Enter number of questions you missed on the exam: ");
		missed = Integer.parseInt(input);
		
		FinalExam demo = new FinalExam(questions,missed);
		
		JOptionPane.showMessageDialog(null, "Your letter grade for this exam is: " + demo.getGrade() );

	}

}
