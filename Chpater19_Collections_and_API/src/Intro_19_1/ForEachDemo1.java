package Intro_19_1;


import java.util.ArrayList;
public class ForEachDemo1 
{

	public static void main(String[] args) 
	{
		String[] cities = {"LA","San Francisco","New York City","Miami","Boston"};
		
		ArrayList<String> cityList =  new ArrayList<>();
		
		for(String city: cities)
		{
			cityList.add(city);
		}
		
		cityList.forEach(
				         x ->
				         {
				           System.out.printf("%s %d\n",x,x.length()); 
				         });
 
	}

}
