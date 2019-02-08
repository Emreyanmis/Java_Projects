import java.util.Scanner; 

public class SearchBenchmarks 
{
	public static int binaryCount;
	public static int sequentialCount;
	public static int[] accountNumbers = {565884, 4520125, 7895122 , 8777541, 8451277,
							             1302850, 8080152, 4562555, 5552012, 5050552,
							             7825877,1250255, 1005231, 6545231, 3852085,
							             7576651,7881200,4581002};
	
	public static boolean searchNumbersSequantial(int chargeAccountNumber)
	{
		
		sequentialCount = 0;
		int index = 0;
		int position = -1;
		boolean found = false;
		
		while(!found && index < accountNumbers.length)
		{
			if(accountNumbers[index] == chargeAccountNumber)
			{
				found = true;
				position = index;
				sequentialCount++;
			}
			index++;
		}
		
		if(position == -1)
			found = false;
		else
			found = true;
		
		return found;
		
	}
	
	
	
	public static int searchNumbersBinary(int chargeAccountNumber)
	{		
		binaryCount = 0;
		int first = 0, last = accountNumbers.length - 1, middle, position = -1;
		boolean found = false;
		
		while(!found && first <= last)
		{
			middle = (first + last) / 2;
			
			if(accountNumbers[middle]  == chargeAccountNumber)
			{
				found = true;
				position = middle;
				binaryCount++;
			}
			else if(accountNumbers[middle] > chargeAccountNumber)
			{	
				last = middle - 1;
				binaryCount++;
			}	
			else
			{
				first = middle + 1;
				binaryCount++;
			}	
		}	
		return position;
	}
	
	public static void main (String[] args)
	{
		int searchValue;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter the number that you search for: ");
		searchValue = keyboard.nextInt();
		
		searchNumbersSequantial(searchValue);
		System.out.println("Number of comparisons by sequnetial serach: " + sequentialCount);
		
		IntSelectionSorter.selectionSort(accountNumbers);

		searchNumbersBinary(searchValue);
		System.out.println("Number of comparisons by binary serach: " + binaryCount);
		
	}

}
