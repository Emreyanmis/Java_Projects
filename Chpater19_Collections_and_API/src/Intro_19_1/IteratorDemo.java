package Intro_19_1;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class IteratorDemo 
{

	public static void main(String[] args)
	{
		String[] names = {"Anna","Chelsea","Claire","Tara","Emre"};
		
		ArrayList<String> nameList = new ArrayList<>();
		
		for(String name: names)
			nameList.add(name);
		
		Consumer<String> action = x ->
				{
				  System.out.printf("%s\n", x);
		        };
		 
		 Iterator<String> iter = nameList.iterator();
		 
		 while(iter.hasNext())
		 {
			 String name = iter.next();
			 System.out.printf("%s %d\n", name, name.length());
			 if(name.equals("Claire"))
			 {
				 // Act differently for names after "Bob".
				 iter.forEachRemaining(action);
			 }
		 }

	}

}
