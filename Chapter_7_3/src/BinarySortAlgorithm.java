
public class BinarySortAlgorithm 
{
	public static void main(String[] args) 
	{
		int[] numbers = { 3, 2, 8, 9, 1, 4};
		System.out.println("The unsorted values are:");
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();
		
		binarySort(numbers, 4);
		
		System.out.println("The sorted values are:");
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();	
	}
	
	public static int binarySort(int[] array,int value)
    {
		int first = 0;
		int last = array.length - 1;
		int middle;
		int position = -1;
		boolean found = false;
		
		while(!found && first <= last)
		{
			// Calculate the midpoint
			middle = (first + last) / 2;
		
			// If value is found at midpoint..,
			if(array[middle] == value)
			{
				found = true;
				position = middle;
			}
			// Else if value is in lower half...
			else if(array[middle] > value)
				last = middle - 1;
			//Else if value is in upper half...
			else
				first = middle + 1;		
		}
		
		// Return the position of the item, or -1
		// If it was not found.
		return position;
	}
   
}
