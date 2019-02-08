
public class RecursiveBinarySearcher 
{
	public static int search(int[] array, int value)
	{
		return binarySearch(array, 0, array.length - 1, value);
	}
	
	private static int binarySearch(int[] array, int first, int last, int value)
	{
		int middle;
		
		if(first  >  last)
			return -1;
		
		middle = (first + last) / 2;
		
		if(array[middle] == value)
			return middle;
		else if(array[middle] > value)
			return binarySearch(array, first, middle - 1, value);
		else
			return binarySearch(array,middle + 1,last, value);
				
	}
	

}
