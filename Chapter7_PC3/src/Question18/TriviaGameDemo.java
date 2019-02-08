package Question18;

import java.util.Scanner;
import java.util.Random;
public class TriviaGameDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String[] answers = {"Mercury","France","Madrid","Toronto","Rio","Buenos Aires","Roma","Lizbon",
	                       "Berlin","Atina"};
		
		String[] pa = {"Mercury","France","Madrid","Toronto","Rio","Buenos Aires","Roma","Lizbon",
                		"Berlin","Atina"};
		

		String[] questions = {"What is the closest planet to the sun?", "World Cup 2018 winner",
				              "Capital of Spain?", "Capital of Canada?","Capital of Brazil?",
				              "Capital of Argentina?", "Capital of Italy?","Capital of Portugal?",
				                "Capital of Germany?" , "Capital of Greece?"};
		
		String[] p1answers = new String[5];
		String[] p2answers = new String[5];
			
		String a1,a2;
		
		System.out.println("Welocome to the Trivia Game!");
		System.out.println("Player1 :");
		
		TriviaGame demo = new TriviaGame();
		int p1Correct = 0;
		int p2Correct = 0;
		int v1,v2,v3,v4;
	    
		for(int i = 0; i < (questions.length) / 2;i++)
		{	
			Random rand = new Random();
				v1 = rand.nextInt(9);
				v2 = rand.nextInt(9);
				v3 = rand.nextInt(9);
				v4 = rand.nextInt(9);
			
			System.out.println(questions[i]);
			System.out.println(pa[v1] + "  " + pa[v2] + " " + pa[v3] + " " + pa[v4]);
			a1 = keyboard.nextLine();
			p1answers[i] = a1;
			
			if(p1answers[i].equalsIgnoreCase(answers[i]))
				p1Correct++;
			
			System.out.println();
		}
		
		int r =((questions.length) / 2);
		
		System.out.println("\n\nPlayer2 :");
		for(int i = r ; i < questions.length;i++)
		{	
		  int j = 0;	
			Random rand = new Random();
				v1 = rand.nextInt(9);
				v2 = rand.nextInt(9);
				v3 = rand.nextInt(9);
				v4 = rand.nextInt(9);
			
			System.out.println(questions[i]);
			System.out.println(pa[v1] + "  " + pa[v2] + " " + pa[v3] + " " + pa[v4]);
			a2 = keyboard.nextLine();
			p2answers[j] = a2;
			
			if(p2answers[j].equalsIgnoreCase(answers[i]))
				p2Correct++;
			
			j++;
			System.out.println();
		}
		
		System.out.println("correct: " + p1Correct);
		System.out.println("correct: " + p2Correct);
	   
		if(p1Correct > p2Correct)
			System.out.println("Player 1 won!");
		else if(p1Correct < p2Correct)
			System.out.println("Player 2 won!");
		else
			System.out.println("Draw");
	}

}
