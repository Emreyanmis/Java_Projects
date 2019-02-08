/**
 * This Demo class2 demonstrates MyList2 class.
 * @author emreyanmis
 *
 */

public class MyListDemo2 
{

	public static void main(String[] args)
	{
		MyList2<Integer> list2 = new MyList2<>();
		MyList2<String> list3 = new MyList2<>();

		
		System.out.println("Numbers in the ArrayList are:");
		list2.add(10);
		list2.add(20);
		list2.add(50);
		list2.add(30);
		list2.add(40);
		
		list2.display();
		
		Integer largest = list2.largest();
		System.out.println();
		System.out.println("The largest value in the ArrayList is: " + largest);
		
		Integer smallest = list2.smallest();
		System.out.println("The smallest value in the ArrayList is: " + smallest);
		System.out.println();
		System.out.println();
		
		
		System.out.println("Names in the ArrayList are:");
		list3.add("Yames");
		list3.add("Emre");
		list3.add("Jack");
		list3.add("Yakup");
		list3.add("Atevens");
		
		list3.display();
		
		String largest2 = list3.largest();
		System.out.println();
		System.out.println("The largest value in the ArrayList is: " + largest2);
		
		String smallest2 = list3.smallest();
		System.out.println("The smallest value in the ArrayList is: " + smallest2);
		System.out.println();
		System.out.println();	
	}
}
