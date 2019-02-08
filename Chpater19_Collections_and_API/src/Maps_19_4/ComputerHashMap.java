package Maps_19_4;

import java.util.*;
public class ComputerHashMap 
{

	public static void main(String[] args) 
	{
		Map<String,Computer> computerList = new HashMap<>();
		
		Computer apple = new Computer("67IF234LP", "Apple");
		Computer del = new Computer("43VD435GF", "DEL");
		Computer hp = new Computer("76PP39DGF", "HP");
		Computer sony = new Computer("43AS64CTX", "Sony");
		Computer microsoft = new Computer("34BO43JIO", "Microsoft");
		
	    computerList.put(apple.getIP_number(),apple);
	    computerList.put(del.getIP_number(),del);
	    computerList.put(hp.getIP_number(), hp);
	    computerList.put(sony.getIP_number(), sony);
	    computerList.put(microsoft.getIP_number(), microsoft);
	    
	    // Get a set containing the keys in this map
	    Set<String> keys = computerList.keySet();
	    
		
		System.out.println("Here are the keys in this map: ");
		for(String c: keys)
			System.out.println(c);
		
		// Get a collection containing the values in this map
		Collection<Computer> values = computerList.values();
		

		System.out.println("\nHere are the values in this map: ");
		for(Computer c: values)
			System.out.println(c);
		
		
		

	}

}
