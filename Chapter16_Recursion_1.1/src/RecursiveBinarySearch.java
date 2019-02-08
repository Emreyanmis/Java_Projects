import java.util.Scanner;

public class RecursiveBinarySearch 
{

	public static void main(String[] args) 
	{
		int searchValue;
		int result; 
		String input;
		char again;
		
		int[] numbers = {101, 142, 423, 234, 239, 230, 656, 786, 678 , 980};
		
		Scanner keybaord = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter a value to search for:");
			
			searchValue = keybaord.nextInt();
			
			result = binarySearch(numbers, 0, (numbers.length - 1), searchValue);
			
			if(result == -1)
			{
				System.out.println(searchValue + " was not found.");
				
			}	
			else
			{
				System.out.println(searchValue + " was found at element " + result);
			}
			
				System.out.println("Do you want to search again? (Y or N): ");
				keybaord.nextLine();
				
				input = keybaord.nextLine();
			    
		}
		while(input.charAt(0) == 'y' || input.charAt(0) == 'Y'); 
	}
	
	public static int binarySearch(int[] array, int first, int last, int value)
	{
		int middle;       // Mid point of search
		
		if(first > last)
			return -1;
		
		middle = (first + last) / 2;
		
		if(array[middle] == value)
			return middle;
		else if(array[middle] < value)
			return binarySearch(array, middle + 1, last, value);
		else			
		    return  binarySearch(array, first, middle - 1, value);	
			
	}

}