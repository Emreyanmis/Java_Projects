
public class SelectionSortAlgorithm2
{

	public static void main(String[] args) 
	{
		int[] numbers = { 3, 2, 8, 9, 1, 4};
         
		System.out.println("The unsorted values are:");
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();
		
		selectionSort(numbers);
		
		System.out.println("The sorted values are:");
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		System.out.println();	
	}
	
	public static void selectionSort(int[] array)
	{
		int startScan, index, minValue, minIndex;
		
		for(startScan = 0; startScan < (array.length -1); startScan++)
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