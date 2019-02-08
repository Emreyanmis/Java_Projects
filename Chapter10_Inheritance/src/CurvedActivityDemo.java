import java.util.Scanner;

public class CurvedActivityDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double rawScore, curvePercent;
		
		System.out.print("Enter the student's raw numeric score: ");
		rawScore = keyboard.nextDouble();
		
		System.out.print("Enter the curve percent: ");
		curvePercent = keyboard.nextDouble();
		
		CurvedActivity demo = new CurvedActivity(curvePercent);
		
		demo.setScore(rawScore);
		
		System.out.println("The raw score is: " + demo.getRawScore());
		System.out.println("The curved score is: " + demo.getScore());
		System.out.println("The curved score is: " + demo.getGrade());
		

	}

}
