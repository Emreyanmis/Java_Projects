import java.util.Scanner;

public class BookClubPoints 
{

	public static void main(String[] args) 
	{
	   Scanner keyboard = new Scanner(System.in);
	   
	   int numOfBooksPurchased,
	   	   pointsEarned;
	   
	   System.out.print("Enter the number of books you have purchased this month: ");
	   numOfBooksPurchased = keyboard.nextInt();
	   
	   if(numOfBooksPurchased == 0)
		   System.out.println("You have earned 0 points");
	   else if(numOfBooksPurchased == 1)
		   System.out.println("You have earned 5 points!");
	   else if(numOfBooksPurchased == 2)
		   System.out.println("You have earned 15 points!");
	   else if(numOfBooksPurchased == 3)
		   System.out.println("You have earned 30 points!");
	   else if(numOfBooksPurchased >= 4)
		   System.out.println("You have earned 60 points!");
	}

}
