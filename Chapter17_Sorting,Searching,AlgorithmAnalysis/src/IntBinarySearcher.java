
public class IntBinarySearcher 
{
  public static int binarySearch(int[] array, int value)
  {
	  int first;       // First array element
	  int last;		  // Last array element
	  int middle;	  // Mid point of search
	  int position;	  // Position of search value
	  boolean found;   // Flag
	  
	  first  = 0;
	  last = array.length - 1;
	  position = -1;
	  found = false;
	  
	  while(!found && first <= last)
	  {
		  middle = ( first + last) / 2;
		  
		  if(array[middle] == value)
		  {
			  found = true;
			  position = middle;
		  }
		  // else if value is in lower half
		  else if(array[middle] > value)
			  last = middle - 1;
		  // else if value is in upper half
		  else
			  first = middle + 1;
	  }
	 
	  return position;
  }
}
