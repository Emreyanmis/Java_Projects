public class GenericInsertationSort 
{
	public static void InsertationObjects(Comparable [] array)
	{
		Comparable unsortedValue = null;
		int scan;
		
		for(int i = 0; i < array.length; i++)
		{
			unsortedValue = array[i];
			
			scan = i;
			
			while(scan > 0 && array[scan - 1].compareTo(unsortedValue) > 0)
			{
				array[scan] = array[scan -1];
				scan--;
			}
			
			array[scan] = unsortedValue;
		}
		
	}
}
