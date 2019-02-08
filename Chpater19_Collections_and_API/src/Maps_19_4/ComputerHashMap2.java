package Maps_19_4;

import java.util.*;
public class ComputerHashMap2 
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
	    
	    Set<Map.Entry<String, Computer>> computers = computerList.entrySet();
	    
	    System.out.println("Here are the mappings: \n");
	    
	    for(Map.Entry<String, Computer> entry : computers )
	    {
	    	System.out.println("Key = " + entry.getKey());
	    	System.out.println("Value = "+ entry.getValue());
	    	System.out.println();
	    }

	}

}
