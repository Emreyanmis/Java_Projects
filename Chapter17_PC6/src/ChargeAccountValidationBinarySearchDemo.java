import java.util.Scanner;

public class ChargeAccountValidationBinarySearchDemo
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int[] accountNumbers = {565884, 4520125, 7895122 , 8777541, 8451277,
                1302850, 8080152,4562555, 5552012, 5050552,
                7825877,1250255, 1005231, 6545231, 3852085,
                7576651,7881200,4581002};
		
		int searchValue;
		int result;
		
		System.out.print("Enter a charge numer to search for: ");
		searchValue = keyboard.nextInt();
	
		IntSelectionSorter.selectionSort(accountNumbers);
		
		result = ChargeAccountValidationBinarySearch.searchNumbers(accountNumbers,searchValue);
		
		if(result == -1)
			System.out.println("It is NOT a valid charge number.");
		else
		{	
			System.out.println("It is a valid charge number!");
			System.out.println(searchValue + " is located at element " + (result + 1) );
		}	

	}
}
