import java.util.Scanner;

public class IsMember 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int[] numbers = {1,23,4,5,6,7,789,9,6,5,6,54,2,3232,34};
        
		int searchValue;   // The value to seach for
		int result;       // The search result
		String input;
		System.out.println("Enter a value to search for: ");
		searchValue = keyboard.nextInt();
		
		result = binarySearch(numbers ,0 , (numbers.length - 1) ,searchValue);
		
		if(result == -1)
			System.out.println(searchValue + " was not found.");
		else
			System.out.println(searchValue + " was found at : " + result);
	}
    
	public static int binarySearch(int[] array, int first, int last, int value)
	{
		int middle;
		
		if(first > last)
			return -1;
		
		
		middle = (first + last ) / 2; 
		
		if(array[middle] == value)
			return middle;
		else if (array[middle] < value)
			return binarySearch(array, middle + 1, last, value);
		else
			return binarySearch(array, middle -1, last , value);
		
	}
}
