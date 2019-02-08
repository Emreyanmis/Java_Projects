
public class Question6Demo 
{

	public static void main(String[] args) 
	{
		Integer[] numbers = {3, 4, 5, 6, 9};
		
		String[] names= {"Joseph", "Christina", "Emre" , "Yusuf"};
		
		Question6<Integer> hall1 = new Question6<Integer>(numbers);
		Question6<String> hall2 = new Question6<String>(names);
		
		System.out.println("The elements in the numbers array: ");
		
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		
		
		Integer ih = hall1.highest();
		System.out.print("The highest value in the numbers array " + ih);
		
		Integer il = hall1.lowest();
		System.out.print("The lowest value in the numbers array " + il);
		
	
		System.out.println("The elements in the names array: ");
		
		for(int i = 0; i < names.length; i++)
			System.out.print(names[i] + " ");	
		
		String ij = hall2.highest();
		System.out.print("The highest value in the names array " + ij);
		
		String ip = hall2.lowest();
		System.out.print("The lowest value in the names array " + ip);
	}
}
