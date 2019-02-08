package Maps_19_4;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedCarHashMap 
{

	public static void main(String[] args)
	{
		// Create a HashMap to store Car objects
		SortedMap<String, Car> carMap = new TreeMap<>();
		
		// Create some Car objects
		Car vw = new Car("227H54", "1997 Wolkswagen");
		Car mustang = new Car("448A69","1965 Mustang");
		Car porshe = new Car ("453B55", "2007 Porshe");
		Car bmw = new Car ("177R60","1980 BMW");
		
		// put some mappings into the HashMap. In each mapping, the car's VIN is the key
		// and the Car object containing that VIN is the value.
		carMap.put(vw.getVin(), vw);
		carMap.put(mustang.getVin(), mustang);
		carMap.put(porshe.getVin(), porshe);
		carMap.put(bmw.getVin(), bmw);
		
		// Iterate through the mappings,printing each one.
		System.out.println("Here are the mappings:");
		carMap.forEach((key,value) ->
		{
		   System.out.println("Key = " + key);
		   System.out.println("Value = " + value);
		   System.out.println();

		});

	}

}
