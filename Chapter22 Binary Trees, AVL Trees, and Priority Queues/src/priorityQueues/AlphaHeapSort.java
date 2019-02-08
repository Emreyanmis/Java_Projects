package priorityQueues;


import java.util.*;
public class AlphaHeapSort 
{
	
	/**
	 * Specialized Comparator
	 */
	static class AlphaOrder implements Comparator<Integer>
	{
		public int compare(Integer x, Integer y)
		{
			return x.toString().compareTo(y.toString());
		}
	}

	public static void main(String[] args)
	{
		Random rand = new Random();
		int[] arr = new int[10];
		String str = "Here is the original list of numbers: ";
		System.out.println(str);
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(1000);
			System.out.print(arr[i] + " ");
		}
		
		AlphaOrder c = new AlphaOrder();
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(arr.length, c);
		
		for(int x : arr)
			pQueue.add(x);
		for(int i = 0; i < arr.length; i++)
			arr[i] = pQueue.poll();
		
		System.out.println("\nHere are the numbers sorted in alphabetical order: ");
		for(int x : arr)
			System.out.print(x + " ");

	}

}
