package RecursionOnTheLinkedLists;


import java.util.*;
/**
 * This program demonstrates how to initialize an adjacency list structure whose nodes are strings.
 *  It uses a map of strings (nodes) to Lists of strings (nodes)
 */
public class AdjacenyList 
{

	public static void main(String[] args)
	{
		Map<String, List<String>> adjList = new HashMap<String, List<String>>();
		
		// A node has neighbor/ neighbors if and only if the 
		// the node has edge/ edges to other nodes 
		adjList.put("A", Arrays.asList("B", "C"));
		adjList.put("B", Arrays.asList("C", "D", "E"));
		adjList.put("C", Arrays.asList("A", "D"));
		adjList.put("D", Arrays.asList("E"));
		adjList.put("E", new ArrayList<String>());
		adjList.put("F", Arrays.asList("G"));
		adjList.put("G", new ArrayList<String>());
		
		Set<Map.Entry<String, List<String>>> entries = adjList.entrySet();
		
		for(Map.Entry<String, List<String>> e : entries)
			System.out.println(e.getKey() + ": " + e.getValue());
	}

}
