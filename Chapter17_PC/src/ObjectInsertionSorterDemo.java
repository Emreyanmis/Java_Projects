
public class ObjectInsertionSorterDemo 
{

	public static void main(String[] args) 
	{
		String[] names = {"yako","didar","mirac","emre","hasan"};
	     
		System.out.println("The unsorted order: ");
		for(int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");
		
		ObjectInsertionSorter.InsertationObjects(names);
		
		System.out.println("The sorted order by insertation sort algorithm: ");
		for(int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");

	}

}
