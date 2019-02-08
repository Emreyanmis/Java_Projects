package Lists_19_2;

import java.util.*;

public class ListIteratorDemo2 
{

	public static void main(String[] args)
	{
		List<String> nameList = new ArrayList<>();
		
		nameList.add("Chris");
		nameList.add("David");
		nameList.add("Katherine");
		nameList.add("Kenny");
		
		System.out.println("Here are the original names:");
		System.out.println(nameList);
		
		ListIterator<String> list = nameList.listIterator();
		
		// Replace the first element with Alonso 
		if(list.hasNext())
		{
			// get the first element
			list.next();
			
			// replace it
			list.set("Alonso");	
		}
		
		// Move the iterator to the end of the list
		while(list.hasNext())
		{
			list.next();
		}
		
		// Remove the last element that was retrieved
		list.remove();
		
		System.out.println("\nHere are the new names:");
		System.out.println(nameList);

	}

}
