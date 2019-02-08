package Sets_19_3;

import java.util.*;
public class TreeSetDemo2 
{

	public static void main(String[] args) 
	{
	   // Create a TreeSet and pass an instance of CarComparator to it.
		SortedSet<Car> carSet = new TreeSet<>(new CarComperator());
		
		// Add some Car objects to the the HashSet.
		carSet.add(new Car ("227H54", "1997 Wolkswagen"));
		carSet.add(new Car("448A69","1965 Mustang"));
		carSet.add(new Car("453B55", "2007 Porshe"));
		carSet.add(new Car("177R60","1980 BMW"));
		
		System.out.println("Here are the cars  osrted in order of their VINs:" );
		for(Car c: carSet)
			System.out.println(c);

	}

}
