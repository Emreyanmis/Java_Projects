package Intro_19_1;

import java.util.ArrayList;
import java.util.function.Predicate;
public class FilterDemo 
{

	public static void main(String[] args) 
	{
		
		String[] names = {"Anna","Chelsea","Claire","Tara","Emre"};
		
		ArrayList<String> nameList = new ArrayList<>();
		
		for(String name: names)
			nameList.add(name);
		
		Predicate<String> filter = x -> x.length() <= 4;
		 
		nameList.removeIf(filter);
		
		System.out.println(nameList);
		
	}

}
