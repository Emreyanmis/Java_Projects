/**
 * This program uses a generic method to sequentially search an array for a value.
 * @author emreyanmis
 */
public class GenericSearchArray 
{
	public static void main(String[] args)
	{
		int position;   // To hold a string's position in the array
		
		// Array of strings to search
		String[] names = { "Jack", "Yakup", "Yusuf", "Chris", "Emre", "Kenny" };
		
		// Search the array for Chris
		position = sequentialSearch(names, "Chris");
		
		// Determine whether Chirs was found
		if(position == -1)
			System.out.println("Chris was not found in the array.");
		else
			System.out.println("Chris is at position: " + position);
	}
	
	/**
	 * The sequentialSearch method searches an array for a value.
	 * @param array The array to search
	 * @param value The value to search
	 * @return The subscript of the value if found in the array, otherwise -1.
	 */
	
	public static<E extends Comparable<E> > int sequentialSearch(E[] array, E value)
	{
		int index;         // Loop control variable
		int position;      // Position the value was found at
		boolean found;     // Flag indicating search results
		
		// Position 0 is the starting point of the search.
		index = 0;
		
		// Store the default values for position and found.
		position = -1;
		found = false;
		
		// Search the array.
		while(!found &&  index < array.length)
		{
			if(array[index].compareTo(value) == 0)
			{
				found = true;
				position = index + 1;
			}
			
			index++;
		}		
		return position;
	}
}
