
public class SelectionSorterTest 
{

	public static void main(String[] args) 
	{
		int[] values = { 5, 1, 3 , 6, 4, 2};
		
		System.out.println("Original order");
		for(int i = 0; i < values.length; i++)
			System.out.print(values[i] + " ");
		
		IntSelectionSorter.selectionSort(values);
		
		System.out.println("\n\nThe sorted order");
		for(int i = 0; i < values.length; i++)
			System.out.print(values[i] + " ");
		

	}

}
