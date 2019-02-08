package Question13;

public class ObjectBinarySearcher 
{
	public static int BinarySearch(String[] array,String value)
	{
		int first = 0, last = array.length -1 , position = -1, middle;
		boolean found = false;
		
		while(!found && first <= last)
		{
			
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
