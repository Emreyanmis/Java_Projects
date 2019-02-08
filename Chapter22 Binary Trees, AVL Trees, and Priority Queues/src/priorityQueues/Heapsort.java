package priorityQueues;

import java.util.*;
public class Heapsort 
{
  public static void main(String[] args)
  {
	  Random rand = new Random();
	  int[] arr = new int[10];
	  System.out.println("Here is the array to be sorted: ");
	  for(int i = 0; i < arr.length; i++)
	  {
		  arr[i] = rand.nextInt(100);
		  System.out.print(arr[i] + " ");
	  }
	  
	  // Create a priority queue of integers and use it to sort the array
	  PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
	  
	  for(int x : arr)
		  pQueue.add(x);
	  
	  System.out.println();
	  for(int i = 0; i < arr.length; i++)
	  {	  
		  System.out.println("peek of " + (i + 1) +" : " + pQueue.peek());
		  arr[i] = pQueue.poll();
		 
	  }	  
	  
	  System.out.println("\nHere is the sorted array: ");
	  for(int x : arr)
		  System.out.print(x + " ");
	  
	  
  }
}
