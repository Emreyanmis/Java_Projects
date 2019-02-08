import java.util.Scanner;

public class GradeDemo
{
	public static void main(String[] args)
	{
		double testScore; // To hold a test score.
		
		// Create a Scanner object for keyboard input.
		// Create a GradeActivity object.
		GradedActivity grade = new GradedActivity();
		
		// Get a test score from the user.
		System.out.println("Enter a numeric test score: ");
		testScore = new Scanner(System.in).nextDouble();
		
		// Set the GradedActivity object's score.
		grade.setScore(testScore);
		
		// Display the letter grade for that score.
		System.out.println("The grade for that test is " + grade.getGrade());
		
	}

}
