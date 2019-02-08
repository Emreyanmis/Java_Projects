import java.util.Scanner;

public class ActScores 
{

	public static void main(String[] args)
	{
		 final int n = 3;
		 final int k = 3;  
		 int total = 0;
		 
		 int[][] scores = new int [n][k];
		 
		 Scanner keyabord = new Scanner(System.in);
		 System.out.println("This program will calculate the total ACT scores");
		 System.out.println("Enter the all scores you recieved on the ACTS exam: ");
		 
		 for(int i = 0;i < n; i++)
		 {
			 for(int j = 0; j < k; j++)
			 {
				 System.out.printf(" Test %d score, Time %d: ", (i + 1 ), (j + 1));
		         scores[i][j] = keyabord.nextInt();
			 }
			 
			 System.out.println();
		 }
		 
		 for(int i = 0;i < n; i++)
		 {
			 for(int j = 0; j < k; j++)
			 {
				 total += scores[i][j];
			 }
			 
		 }
		 
		 System.out.println("Your total score is : " + total );
	}
}
