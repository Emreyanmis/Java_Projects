import java.util.Scanner;

public class TestAverageAndGrade 
{

	public static void main(String[] args) 
	{
		Scanner keybaord = new Scanner(System.in);
		
	    int score1, score2, score3, score4, score5;
	    int average;
	    char letterGrade1, letterGrade2, letterGrade3, letterGrade4, letterGrade5, letterGradeAverage;
	    
	    System.out.print("Enter the first test score: ");
	    score1 = keybaord.nextInt();
	    letterGrade1 = determineGrade(score1);
	    
	    
	    System.out.print("Enter the second test score: ");
	    score2 = keybaord.nextInt();
	    letterGrade2 = determineGrade(score2);
	    
	    System.out.print("Enter the third test score: ");
	    score3 = keybaord.nextInt();
	    letterGrade3 = determineGrade(score3);
	    
	    System.out.print("Enter the fourth test score: ");
	    score4 = keybaord.nextInt();
	    letterGrade4 = determineGrade(score3);
	    
	    System.out.print("Enter the fifth test score: ");
	    score5 = keybaord.nextInt();
	    letterGrade5 = determineGrade(score5);
	    
	    
	     average = calcAverage(score1, score2, score3, score4, score5);
	     letterGradeAverage = determineGrade(average);
	    
	    System.out.println("The test 1 letter grade: " + letterGrade1);
	    System.out.println("The test 2 letter grade: " + letterGrade2);
	    System.out.println("The test 3 letter grade: " + letterGrade3);
	    System.out.println("The test 4 letter grade: " + letterGrade4);
	    System.out.println("The test 5 letter grade: " + letterGrade5);
	    
	    System.out.println("The averge is: " + average + "and  letter grade:" + letterGradeAverage);
	    
	    
	}
	
	public static int calcAverage(int score1, int score2, int score3, int score4, int score5)
	{
	   int average;
	   average = (score1 + score2 + score3 + score4 + score5) / 5 ;
	   
	   return average;
	}
	
	public static char determineGrade(int score)
	{    
		 char letterGrade;
		 	
			 if(score >= 90 && score <= 100)
				 letterGrade = 'A';
			 else if (score >= 80 && score <= 89)
				 letterGrade = 'B';
			 else if (score >= 70 && score <= 79)
				 letterGrade = 'C';
			 else if (score >= 60 && score <= 69)
				 letterGrade = 'D';
			 else
				 letterGrade = 'F';
			 
			 return letterGrade;
			 
	}
	
}
