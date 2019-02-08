public class IntSelectionSorter 
{
	// The array is sorted in ascending order.
	
	public static void selectionSort(int[] array)
	{
		int startScan;  // Starting position of the scan
		int index;      // To hold a subscript value
		int minIndex;   // Element with the smallest value in the scan
		int minValue;   // The smallest value found in the scan
		
		for(startScan = 0; startScan < (array.length - 1); startScan++)
		{
			minIndex = startScan;
			minValue = array[startScan];
			
			for(index = startScan + 1; index < array.length; index++)
			{
				if(array[index] < minValue)
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

