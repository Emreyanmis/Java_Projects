import java.util.Scanner;

public class TestScoresClassesDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int score1, score2, score3;
		
		System.out.print("Enter your first test score: ");
		score1 = keyboard.nextInt();
		
		System.out.print("Enter your second test score: ");
		score2 = keyboard.nextInt();
		
		System.out.print("Enter your third test score: ");
		score3 = keyboard.nextInt();
		
		TestScoresClasses tests = new TestScoresClasses(score1, score2, score3);	
	
		System.out.println("Your average is: " + tests.getAverage());
	}

}
