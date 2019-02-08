/**
 * This Demo class demonstrates MyList class.
 * @author emreyanmis
 *
 */

public class MyListDemo 
{

	public static void main(String[] args)
	{
		MyList<Number> list = new MyList<>();
		
		System.out.println("Numbers in the ArrayList are:");
		list.add(2.5);
		list.add(2.1);
		list.add(5);
		list.add(3.9);
		list.add(1);
		
		list.display();
		
		Number largest = list.largest();
		System.out.println();
		System.out.println("The largest value in the ArrayList is: " + largest);
		
		Number smallest = list.smallest();
		System.out.println();
		System.out.println("The smallest value in the ArrayList is: " + smallest);
	}
}
