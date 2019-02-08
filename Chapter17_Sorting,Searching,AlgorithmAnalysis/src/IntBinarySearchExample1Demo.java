import java.util.Scanner;

public class IntBinarySearchExample1Demo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		int result, searchValue;
		int[] numbers = { 5,6,7,2,47,93,90};

		IntSelectionSorter.selectionSort(numbers);
		
		System.out.println("The ascending order: ");
	    for(int i = 0; i < numbers.length; i++)
	    		System.out.print(numbers[i] + " ");
	   
	    System.out.print("\nEnter the number that you are searching for: ");
	    searchValue = keyboard.nextInt();
	    
	    result = IntBinarySearchExample1.binarySearch(numbers, searchValue);
	    
	    if(result == -1 )
	    		System.out.println(searchValue + " was not found!");
	    else
	    		System.out.println(searchValue + " was found at " + (result + 1));

	} 
}
