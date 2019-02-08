package Intro_19_1;

import java.util.*;
public class Creating_and_Initializing_Lists_1 
{

	public static void main(String[] args)
	{
		String[] names = {"Emre","Yakup","Mert"};
        
		List<String> list1 = Arrays.asList(names);
		LinkedList list2 = new LinkedList<>(list1);
		
		list2.add("Musa");
		
		System.out.println(list2);
		
		
	}

}
