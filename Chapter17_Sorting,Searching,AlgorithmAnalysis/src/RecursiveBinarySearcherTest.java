import java.util.Scanner;

public class RecursiveBinarySearcherTest 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		 
		 int result, searchValue;
		 int[] numbers = { 9,8,7,6,5,4,3};
		 
		 	IntSelectionSorter.selectionSort(numbers);
		
			 System.out.print("Enter a value to search for: ");
			 searchValue = keyboard.nextInt();
			 
			 result = RecursiveBinarySearcher.search(numbers, searchValue);
			 
			 
			 System.out.print("The ascending order: \n");
			 for(int i = 0; i < numbers.length; i++)
				 System.out.print(numbers[i] + " ");
			 System.out.println();
			 
			 if(result == -1)
				 System.out.println(searchValue + " was not found");
			 else
		         System.out.println(searchValue + " was found at element " + (result + 1));

	}

}
