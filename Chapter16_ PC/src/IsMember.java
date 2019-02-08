import java.util.Scanner;

public class IsMember 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int[] numbers = {12,23,49,58,69,79,99,101,103,761,854,921,932,934};
        
		int searchValue;   // The value to search for
		boolean result;       // The search result
		System.out.println("Enter a value to search for: ");
		searchValue = keyboard.nextInt();
		
		result = isMethod(numbers , 0, (numbers.length - 1) ,searchValue);
		
		if(result)	
			System.out.println(searchValue + " was found.");	
		else
			System.out.println(searchValue + " was not  found ");
	}
    
	public static boolean isMethod(int[] array, int first, int last, int value)
	{
		int middle;
		
		if(first > last)
			return false;
		
		middle = (first + last ) / 2; 
		
		if(array[middle] == value)
			return true;
		else if (array[middle] < value)
			return isMethod(array, middle + 1, last, value);
		else
			return isMethod(array, first, middle -1 , value);
	}
}