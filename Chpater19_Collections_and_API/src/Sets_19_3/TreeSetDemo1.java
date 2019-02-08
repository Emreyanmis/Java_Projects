package Sets_19_3;

import java.util.*;
public class TreeSetDemo1 
{

	public static void main(String[] args) 
	{		
		SortedSet<String> fruitList =  new TreeSet<>();
		
		fruitList.add("Apple");
		fruitList.add("Strawberry");
		fruitList.add("Pear");
		fruitList.add("Banana");
		
		System.out.println("Here are the TreeSet elements in ascending order:");
		System.out.println(fruitList);
		
		System.out.println("\nAdding blueberry to the set.");
		fruitList.add("Blueberry");
		
		System.out.println("\nHere are the TreeSet elements again:");
		System.out.println(fruitList);





	}

}
