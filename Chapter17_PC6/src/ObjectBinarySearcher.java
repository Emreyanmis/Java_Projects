
public class ObjectBinarySearcher 
{
	public static int BinarySearch(Comparable[] array, Comparable value)
	{
		int first = 0, last = array.length-1 , position = -1, middle;
		boolean found = false;
		
		while(!found && first <= last)
		{
			System.out.print(".");
			middle = (first + last) / 2;
			
			if(array[middle] == value)
			{
				found = true;
				position = middle;
			}
			else if(array[middle].compareTo(value) > 0)
				last = middle + 1;
			else
				first = middle - 1;	
		}
		
		return position;
	}

}
