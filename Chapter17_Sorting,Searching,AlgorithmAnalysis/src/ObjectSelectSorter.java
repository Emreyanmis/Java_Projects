
public class ObjectSelectSorter 
{
	public static void selectionSort(Comparable[] array)
	{
		int index;
		Comparable minValue;
		int minIndex;
		int startScan;
		
		for(startScan = 0; startScan < (array.length - 1); startScan++)
		{
			minIndex = startScan;
			minValue = array[startScan]; 
			
			for(index = 0; index < array.length; index++)
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
