package AW;

import java.io.*;
public class AW3 
{

	public static void main(String[] args) throws Exception 
	{
		int numbers[] = {1,2,3,4,5};
		System.out.println(search(numbers, 5));

	}

	private static int search(int[] array, int number) throws Exception
	{
		int index = 0;
		
			for(int i = 0; i< array.length; i++)
			{	
				if(array[i] == number)
						index = i;
			}
			if(index == 0)
				throw new Exception("Element was not found");
			else
				System.out.print("The searhed value is at index #");
		return index;
		
	}

}
