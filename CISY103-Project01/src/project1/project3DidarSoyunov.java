package project1;

//Author: Didar Sounov
//Course: CISY 103
//Date: 11/08/2018
//Instructor: Linda Yang

import java.util.Random;
public class project3DidarSoyunov
{
	public static void main(String[] args) 
	{
		// holds number of wins
		double wins = 0;
		
		// holds number of losses
		double losses = 0;
		
		// holds number of marks
		double marks = 0;
		
		// holds sum of marks, losses, and wins
		double total = 0.0;
		
		// holds the percent of wins
		double winsPercent;
		
		// holds the percent of losses
		double lossesPercent;
		
		// holds the percent of marks
		double marksPercent;
		
		// hold the values of first and second dices
		int dice1, dice2;
		
		// hold the sum of first and second dices
		int sum;
		
		for(int i = 0; i < 100000000  ; i++)
		{
			Random rand1 = new Random();
			dice1 = rand1.nextInt(6) + 1;
			
			Random rand2 = new Random();
			dice2 = rand2.nextInt(6) + 1;
			
			sum = dice1 + dice2;
			
			if(sum == 7 || sum == 11)
				wins++;
			else if(sum == 2 || sum == 3 || sum == 12)
				losses++;
			else
				marks++;	
		}
	
		total = marks + losses + wins;
		winsPercent = (wins / total) * 100;
		lossesPercent = (losses / total) * 100;
		marksPercent = (marks / total) * 100;
		
		// Display the number of wins and wins percent 
		System.out.printf("Wins:   %,.0f\t%.1f", wins,winsPercent);
		System.out.print("%");
		
		// Display the number of losses and losses percent 
		System.out.printf("\nLosses: %,.0f \t%.1f",losses,lossesPercent);
		System.out.print("%");
		
		// Display the number of marks and marks percent 
		System.out.printf("\nMarks:  %,.0f \t%.1f",marks,marksPercent);
		System.out.print("%");	
	}
}
