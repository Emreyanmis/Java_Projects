package RecursionOnTheLinkedLists;

import java.util.*;
public class AdjacenyList1 
{

	public static void main(String[] args)
	{
		Map<String, List<String>> adjList = new HashMap<String, List<String>>();
		
		adjList.put("0", Arrays.asList("1", "2"));
		adjList.put("1", Arrays.asList("2", "3", "4"));
		adjList.put("2", Arrays.asList("0", "3"));
		adjList.put("3", Arrays.asList("4"));
		adjList.put("4", new ArrayList<String>());
		adjList.put("5", Arrays.asList("6"));
		adjList.put("6", new ArrayList<String>());
		
	    Set<Map.Entry<String, List<String>>> entries = adjList.entrySet();
	    
	    for(Map.Entry<String, List<String>> e : entries)
	    	System.out.println(e.getKey() + ": " + e.getValue());
     
	}

}
