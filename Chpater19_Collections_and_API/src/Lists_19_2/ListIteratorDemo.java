package Lists_19_2;

import java.util.*;

public class ListIteratorDemo 
{

	public static void main(String[] args) 
	{
		String[] names = {"Emre","Yakup","Mert"};
		List<String> nameList = new ArrayList<>(Arrays.asList(names));
		
		System.out.println("Here are the original names:");
		System.out.println(nameList);
		
		// Get a list iterator
		ListIterator<String> list = nameList.listIterator();
		
		// Add "Messi" to the lsit right after Yakup
		while(list.hasNext())
		{
			String str = list.next();
			
			// If the last name retrieved was "Yakup", then add "Messi"
			if(str.equalsIgnoreCase("Emre"))
			{	
				list.add("Messi");
				break;
			}
		}	
		System.out.println("\nHere are the new names:");
		System.out.println(nameList);
		
			

	}

}
