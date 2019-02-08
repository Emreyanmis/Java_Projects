import java.util.Scanner;
import java.io.*;

public class NameSearchDemo 
{

	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);
		String searchValue;
		int result;
		
		String firstNames[] = new String[65];
		
		File file = new File("names.txt");
		Scanner names = new Scanner(file);
		
		for(int i = 0; i < 65; i++)
		{
			firstNames[i] = names.nextLine();
		}	
		
		System.out.println("Before the sorting, 65 most popular female first names: ");
		for(int i = 0; i < 65; i++)
			System.out.println(firstNames[i]);
		
		ObjectSelectionSort.selectionSort(firstNames);

		System.out.println("\nAfter the sorting, 65 most popular female first names: ");
		for(int i = 0; i < 65; i++)
			System.out.println(firstNames[i]);
		
		System.out.print("Enter the name that you want to"
				+ " search for: ");
		searchValue = keyboard.nextLine();
		
		result = ObjectBinarySearcher.BinarySearch(firstNames, searchValue);
		
		if(result == -1)
			System.out.print("Invalid female first name out of 65 "
					+ "female names");
		else
			System.out.print(searchValue + " was found at element " + (result + 1));
	}

}
