package Intro_19_1;

import java.util.*;
public class Creating_and_Initializing_Lists 
{

	public static void main(String[] args) 
	{
		String[] names = {"Emre","Yakup","Mert"};
		
		LinkedList<String> list1 = new LinkedList<>();
		
		for(String str: names)
			list1.add(str);
		
		System.out.println(list1);
		

	}

}
