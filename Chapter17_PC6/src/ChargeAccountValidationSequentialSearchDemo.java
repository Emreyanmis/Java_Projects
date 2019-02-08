import java.util.Scanner;

public class ChargeAccountValidationSequentialSearchDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int searchValue;
		boolean result;
		
		System.out.print("Enter a charge numer to search for: ");
		searchValue = keyboard.nextInt();
		
		result = ChargeAccountValidationSequentialSearch.searchNumbers(searchValue); 
		
		if(result)
			System.out.println("It is a valid charge number!");
		else
			System.out.println("It is NOT a valid charge number.");
		

	}

}
