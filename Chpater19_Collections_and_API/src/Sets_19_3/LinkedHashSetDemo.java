package Sets_19_3;

import java.util.*;
public class LinkedHashSetDemo 
{

	public static void main(String[] args) 
	{
		// List of fruits to put in hash sets.
		List<String> fruitList = Arrays.asList("Apple","Strawberry","Pear","Banana");
		
		// Create the HashSet.
		Set<String> set1 = new HashSet<>(fruitList);
		
		// Now create the LinkedHashSet.
		Set<String> set2 = new LinkedHashSet<>(fruitList);
		
		// Display the elements in the HashSet.
		System.out.println("Here are the elements in the HashSet:");
		System.out.println(set1);
		System.out.println("==========================================");
		
		// Display the elements in the HashSet.
		System.out.println("Here are the elements in the LikedHashSet:");
		System.out.println(set2);
		
			
			
			

	}

}
