package Sets_19_3;

import java.util.*;
public class CarHashSet 
{

	public static void main(String[] args) 
	{
		// Create a HashSet to store Car objects
		Set<Car> carSet = new HashSet<>();
		
		// Add some Car objects to the the HashSet.
		carSet.add(new Car ("227H54", "1997 Wolkswagen"));
		carSet.add(new Car("448A69","1965 Mustang"));
		carSet.add(new Car("453B55", "2007 Porshe"));
		carSet.add(new Car("177R60","1980 BMW"));
		
		System.out.println("Here are the cars in the set" );
		for(Car c: carSet)
			System.out.println(c);
		
		System.out.println();
		
		Car mustang = new Car("448A69","1965 Mustang");
		System.out.println("Searchig for: " + mustang);
        if(carSet.contains(mustang))
        	System.out.println("The mustang is in the set");
        else 
        	System.out.println("The mustang is NOT in the set");
        
        System.out.println("============================================================");
        
        Car plymouth = new Car("911C87"," 2000 plymouth");
        System.out.println("Searchig for: " + plymouth);
        if(carSet.contains(plymouth))
        	System.out.println("The plymouth is in the set");
        else 
        	System.out.println("The plymouth is NOT in the set");
        
		
	}

}
