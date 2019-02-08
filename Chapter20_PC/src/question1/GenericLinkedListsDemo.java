package question1;

public class GenericLinkedListsDemo 
{

	public static void main(String[] args) 
	{
		GenericLinkedLists<Double> demo = new GenericLinkedLists<>();
		demo.add(12.00);
		demo.add(43.00);
		System.out.println(demo + "\n");
		
		System.out.println(demo.get(1));
		
		demo.clear();
		
		System.out.println(demo);
 
	}

}
