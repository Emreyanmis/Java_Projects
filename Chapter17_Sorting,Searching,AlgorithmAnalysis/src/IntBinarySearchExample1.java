
public class IntBinarySearchExample1 
{
   public static int binarySearch(int[] array, int value)
   {
	   int first = 0;
	   int last = array.length -1;
	   int middle;
	   int position = -1;
	   boolean found = false;
	   
	   while(!found && first <= last)
	   {
		   middle = (first + last) / 2;
		   
		   if(array[middle] == value)
		   {
			   found = true;
			   position = middle;
		   }
		  else if(array[middle] > value)
			  last = middle - 1;
		  else
			  first = middle + 1;
	   }
	   return position;
   }
}
