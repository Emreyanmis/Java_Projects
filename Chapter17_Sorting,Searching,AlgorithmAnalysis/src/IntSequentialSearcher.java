
public class IntSequentialSearcher 
{
	public static int search(int[] array, int value)
	{
		int index; 			// Loop control variable
		int position;       // Position the value is found at
		boolean found;       // flag indicating search results
		
		// Element 0 is the starting point of the search
		index = 0;
		
		position = -1;
		found = false;
		
		while(!found && index < array.length)
		{
			if(array[index] == value)
			{
				found = true;
				position = index;
			}
			index++;
			
		}	
		
		return position;
		
	}
	
}
