public class ObjectSelectionSort<T extends Comparable<T>>
{
   public void selectionSort(T [] array)
   {
	   T minValue;
	   int minIndex;
	   int index;
	   int startScan;
	  
	   for(startScan = 0; startScan < (array.length - 1); startScan++)
	   {
		   minIndex = startScan;
		   minValue = array[startScan];
		   
		   for(index = startScan + 1; index < array.length; index++)
		   {
			   if(array[index].compareTo(minValue) < 0)
			   {
				   minValue = array[index];
				   minIndex = index;
			   }
		   }
		   
		   array[minIndex] = array[startScan];
		   array[startScan] = minValue;
	   }
   }
}
