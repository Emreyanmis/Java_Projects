package Question11;


public class ArrayOperatinos 
{

	public static void main(String[] args) 
	{
	
		
		int[] scores = {12, 43, 76, 97, 56, 34, 99, 1};   
		

	    System.out.println("The sum of the array: " +  getTotal(scores) +
						  "\nThe average of the array: " + getAverage(scores) +
						  "\nThe highest value in the array: " + getHighest(scores) +
						  "\nThe lowest value in the array: " + getLowest(scores) +
						  "\nThe highest value location index in the array: " + getHighestLocation(scores) +
						  "\nThe lowest value location index in the array: " + getLowestLocation(scores));
	      
		
	}
	
	public static int getTotal(int[] array)
	{
		int sum = 0;
		
		for(int i = 0; i < array.length; i++)
			sum += array[i];
		
		return sum;
	}
	
	public static int getAverage(int[] array)
	{
		int average;
		int sum = 0;
		
		for(int i = 0; i < array.length; i++)
			sum += array[i];
		
		average = sum  / array.length;
		
		return average;	
	}
	
	public static int getHighest(int array[])
	{
		int highest = array[0];
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > highest)
				highest = array[i];
		}
		
		return highest;
	}
	
	public static int getLowest(int array[])
	{
		int lowest = array[0];
		
		for(int i = 0; i < array.length; i++)
		{
			if(lowest > array[i])
				lowest = array[i];
		}
		
		return lowest;	
	}
	
	public static int getHighestLocation(int[] array)
	{
		int highest = array[0];
		int h = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] > highest)
				h = i;
			     
		}
		
		return h;
		
	}
	
	public static int getLowestLocation(int[] array)
	{
		int lowest = array[0];
		int l = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(lowest > array[i])
				l = i;
		}
		
		return l;
	}
	


}
