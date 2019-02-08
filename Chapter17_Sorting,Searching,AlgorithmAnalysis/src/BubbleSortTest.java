/**
 * This program tests IntBubbleSorter class
 * @author emreyanmis
 *
 */
public class BubbleSortTest
{

	public static void main(String[] args) 
	{
	   int[] values = { 1,9,4,5,2,3,8,7};
	   
	   System.out.println("The Orginial order:");
	   
	   for(int i = 0; i < values.length; i++)
		   System.out.print(values[i] + " ");
	   
	   IntBubbleSorter.bubbleSort(values);
	   
	   System.out.println("\nThe Sorted order: ");
	   
	   for(int i = 0; i < values.length; i++)
		   System.out.print(values[i] + " ");
	}
}
