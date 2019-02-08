
public class SelectionSortExample2Tester 
{

	public static void main(String[] args) 
	{
		String[] names = {"Emre","emre","yagiz", "alp", "cenk" ,"wakif", "suleyman","AAA"};
		
        System.out.println("Original order:");
        for(int i = 0; i < names.length; i++)
        		System.out.print(names[i] + " ");
        
        SelectionSortExample2.selectionSort(names);
        
        System.out.println("\n\nSorted order:");
        for(int i = 0; i < names.length; i++)
    			System.out.print(names[i] + " ");

	}

}
