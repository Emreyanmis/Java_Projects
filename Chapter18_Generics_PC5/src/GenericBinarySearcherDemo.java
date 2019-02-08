import java.util.Scanner;

public class GenericBinarySearcherDemo
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String searchValue;
		int result;
		
		GenericBinarySearch<String> demo1 = new GenericBinarySearch<String>();
		
		String[] names = {"emre","yako","hilmi","agah","oguz"};
		
		System.out.print("\n\nEnter the name that you search for: ");
		searchValue = keyboard.nextLine();
	    
		
		
		System.out.println("The original order:");
		for(int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");
		

		
        demo1.quickSort(names);
		
	
		System.out.println("\n\nThe sorted order by selection sort:");
		for(int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");
		
		result = demo1.BinarySearch(names, searchValue);
		
		
		System.out.print("\n\nEnter the name that you search for: ");
		searchValue = keyboard.nextLine();
		
		if(result == -1)
			System.out.println(searchValue + " was not found.");
		else
			System.out.println(searchValue + " was found at the position " + (result + 1));
		
	}

}



