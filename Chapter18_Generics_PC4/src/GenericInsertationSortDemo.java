public class GenericInsertationSortDemo
{

		public static void main(String[] args) 
		{    
			GenericInsertationSort<Integer> demo1 = new GenericInsertationSort<Integer>();
			GenericInsertationSort<String> demo2 = new GenericInsertationSort<String>();
			
			
			
			Integer [] values = {34,453,6563,43,6456, 5443};
			String[] names = {"yako","didar","mirac","emre","hasan"};
		     
			
			System.out.println("The unsorted order: ");
			for(int i = 0; i < names.length; i++)
				System.out.print(names[i] + " ");
			
			demo2.InsertationObjects(names);
			
			System.out.println("\n\nThe sorted order by insertation sort algorithm: ");
			for(int i = 0; i < names.length; i++)
				System.out.print(names[i] + " ");
				
			System.out.println("\n\nThe unsorted order: ");
			for(int i = 0; i < values.length; i++)
				System.out.print(values[i] + " ");
			
			  demo1.InsertationObjects(values);
		
			System.out.println("\n\nThe sorted order by insertation sort algorithm: ");
			for(int i = 0; i < values.length; i++)
				System.out.print(values[i] + " ");

		}

	}
