package Maps_19_4;

import java.util.*;

public class CarHashMap3 {

	public static void main(String[] args) 
	{
		// Create a HashMap to store Car objects
		Map<String, Car> carMap = new HashMap<>();
		
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
		
		// Get a set containing the mappings in this map
		Set<Map.Entry<String, Car>> cars = carMap.entrySet();
		
		System.out.println("Here are the mappings:\n");
		for(Map.Entry<String, Car> entry : cars)
		{
			System.out.println("Key = " + entry.getKey());
			System.out.println("Value = " + entry.getValue());
			System.out.println();
		}

	}

}
