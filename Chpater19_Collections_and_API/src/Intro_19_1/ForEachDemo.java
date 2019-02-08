package Intro_19_1;

import java.util.ArrayList;
public class ForEachDemo 
{

	public static void main(String[] args)
	{
		String[] names = {"Emre","Yusuf","Yakup","Sam"};
		
		ArrayList<String> nameList = new ArrayList<>();
		
		for(String name: names)
		{
			nameList.add(name);
		}
		
		// Use lambda expression to print.
		nameList.forEach(
				x ->
				{
					System.out.printf("%s %d\n",x, x.length());
				}
				);

	}

}
