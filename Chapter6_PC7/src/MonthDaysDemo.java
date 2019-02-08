import java.util.Scanner;

public class MonthDaysDemo 
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int month, year;
		
		System.out.print("Enter a month (1-12): ");
		month = keyboard.nextInt();
		
		System.out.print("Enter a year: ");
		year = keyboard.nextInt();
       
		MonthDays tester = new MonthDays(month,year);
		
		System.out.println(tester.getNumberOfDays() + " days");

	}

}
