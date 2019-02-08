
public class ObjectSelectSorterTester
{

	public static void main(String[] args)
	{
	   String[] names = {"emre" , "joseph", "dan", "david" , "mike"};
	   
	   System.out.println("Original order:");
	   
	   for(int i = 0; i < names.length; i++)
		   System.out.print(names[i] + " ");
	   
	   ObjectSelectSorter.selectionSort(names);
	   
	   System.out.println("\n\nThe sorted order:");
	   for(int i = 0; i < names.length; i++)
		   System.out.print(names[i] + " ");

	}

}
