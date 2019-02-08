package Question5;

import java.util.*;
public class PrimeNumberList 
{

	public static void main(String[] args) 
	{
		List<Integer> myList = new ArrayList<>();
		
		int count = 2;
		myList.add(2);
		myList.add(3);
		for(int i = 3; count < 100; i++)
		{  
			
			if(i % 2 != 0)		
			{	
				int dv = 3;
				while(i % dv != 0 && (dv<=((i - 1) / 2)) )
				{
					dv++;
				}
				
				if(i % dv != 0)
				{	
					myList.add(i);
					count++;
				}			
			}	
		}	
		
		ListIterator<Integer> it = myList.listIterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
