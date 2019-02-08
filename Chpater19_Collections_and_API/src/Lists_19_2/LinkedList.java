package Lists_19_2;

import java.util.*;

public class LinkedList 
{
    public static void main(String[] args)
    {
    	String[] names = {"Anna","Chelsea","Claire","Tara","Emre"};
    	
       List<String> nameList = new ArrayList<>(Arrays.asList(names));
       ListIterator list1 = nameList.listIterator();
       
       for(int k = nameList.size() - 1; k >= 0; k--)
    	   System.out.printf("%s\n", nameList.get(k));
    	
    }
}
