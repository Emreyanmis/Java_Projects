import java.util.Scanner;

public class FishingGameSimulationDemo
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int choice;
		int totalPoints = 0;
		int i = 0;
		
		System.out.println("Welcome to Fishing Game!");
		System.out.println("1 - Start the Game\n2 - Exit the Game");
		System.out.print("Enter your choice:  ");
		choice = keyboard.nextInt();
		
		FishingGameSimulation demo = new FishingGameSimulation();
		
		do
		{
			if(i > 0)
			{	
				System.out.println("\n1 - Continue the Game\n2 - Exit the Game");
				System.out.print("Enter your choice:  ");
				choice = keyboard.nextInt();
			}	
			
			demo.roll();
			totalPoints += demo.getValue();
			
			if(demo.getValue() == 6)
				System.out.println("Wooow you got a huge fish!");
			else if(demo.getValue() == 5)
				System.out.println("Nice you got a shark!");
			else if(demo.getValue() == 4)
				System.out.println("Nice you got a small shark!");
			else if(demo.getValue() == 3)
				System.out.println("Nice you got a salmon!");
			else if(demo.getValue() == 2)
				System.out.println("Great you got a old shoe!");
			else if(demo.getValue() == 1)
				System.out.println("You got a little fish!");
			
			i++;
		}
		while(choice != 2);
		   
			System.out.println("\nHere is your total points at the end of round #" + (i + 1) +": " +
							   totalPoints);

	}

}
