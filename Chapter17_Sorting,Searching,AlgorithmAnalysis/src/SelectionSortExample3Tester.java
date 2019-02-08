
public class SelectionSortExample3Tester 
{
	  public static void main(String[] args)
	  {
		  String[] names = {"nizo", "emin","kotil","acar" ,"sulo","Hamza"};
		  
		  System.out.println("Original order:");
		  
		  for(int i = 0; i < names.length; i++)
			  System.out.print(names[i] + " ");
		  
		  SelectionSortExample3.selectionSort(names);
		  
		  System.out.println("\n\nSorted order:");
				  
		  for(int i = 0; i < names.length; i++)
			 System.out.print(names[i] + " ");
			  
	  }
}
