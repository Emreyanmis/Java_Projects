package Sets_19_3;

import java.util.*;
public class ComputerHashSet 
{

	public static void main(String[] args) 
	{
		Set<Computer> computerList = new HashSet<>();
		
		computerList.add(new Computer("67IF234LP", "Apple"));
		computerList.add(new Computer("43VD435GF", "DEL"));
		computerList.add(new Computer("76PP39DGF", "HP"));
		computerList.add(new Computer("43AS64CTX", "Sony"));
		computerList.add(new Computer("34BO43JIO", "Microsoft"));
		
		System.out.println("Here are the computers: ");
		for(Computer c: computerList)
			System.out.println(c);
		
		
		Computer samsung = new Computer("32UG343IOP","Samsung");
		
		System.out.println("\nSearching for: " + samsung);
		
		if(computerList.contains(samsung))
			System.out.println("Samsung is in the list.");
		else
			System.out.println("Samsung is NOT in the list.");
		
		
		
		Computer Apple = new Computer("67IF234LPD", "Apple");
		System.out.println("\nSearching for: " +  Apple);
		
		if(computerList.contains(Apple))
			System.out.println("Apple is in the list.");
		else
			System.out.println("Apple is NOT in the list.");
		
		

	}

}
