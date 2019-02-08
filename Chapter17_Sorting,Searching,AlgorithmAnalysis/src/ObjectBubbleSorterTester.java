/**
 * This program tests ObjectBubbleSorter class
 * @author emreyanmis
 */

public class ObjectBubbleSorterTester 
{
	public static void main(String[] arg)
	{
		String[] names = {"emre" , "joseph", "dan", "david" , "mike"};
    
		System.out.println("The unsorted list is: ");
    
		for(	int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + " ");
		}
		
		ObjectBubbleSorter.bubbleSorter(names);
		
		System.out.println("\n\nThe sorted list is ");
		
		for(int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + " ");
		}
	}
}
