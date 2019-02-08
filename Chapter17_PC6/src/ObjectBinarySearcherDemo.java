import java.util.Scanner;

public class ObjectBinarySearcherDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String searchValue;
		int result;
		
		String[] names = {"emre","yako","hilmi","agah","oguz"};
		
		System.out.print("\n\nEnter the name that you search for: ");
		searchValue = keyboard.nextLine();
		

		
		System.out.println("The original order:");
		for(int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");
		
		
		ObjectSelectionSort.selectionSort(names);
		
		System.out.println("\n\nThe sorted order by selection sort:");
		for(int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");
		
		result = ObjectBinarySearcher.BinarySearch(names, searchValue);
		
		
		System.out.print("\n\nEnter the name that you search for: ");
		searchValue = keyboard.nextLine();
		
		if(result == -1)
			System.out.println(searchValue + " was not found.");
		else
			System.out.println(searchValue + " was found at the position " + (result + 1));
		
	}

}
