package Sets_19_3;

import java.util.*;
public class HashSetDemo2 
{

	public static void main(String[] args) 
	{  
		// Create a HashSet to hold names/
		List<String> nameList = Arrays.asList("Chris","Emre","David","Katherine","Kenny");
		
		Set<String> nameSet = new HashSet<>(nameList);
		
		// Get an iterator for the set.
		Iterator<String> it = nameSet.iterator();
		
		System.out.println("Here are the names in the set.");
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println();
		
		// Search for "Katherine"
		if(nameSet.contains("Katherine"))
			System.out.println("Katherine is in the list");
		else
			System.out.println("Katherine is NOT in the list");
		
		// Search for "Bethany"
		if(nameSet.contains("Bethany"))
			System.out.println("Bethany is in the list");
		else
			System.out.println("Bethany is NOT in the list");
		
			

		
		

	}

}
