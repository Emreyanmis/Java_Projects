package LeetCode_easy;

import java.util.ArrayList;

public class number5
{
	public static void main(String[] args)
	{
	     int[] numbers = {3,2,2,3};
	     int target = 3;
	     System.out.println(removeElement(numbers, target));
	     
	     int[] numbers2 = {0,1,2,2,3,0,4,2};
	     int target2 = 2;
	     System.out.println("\n" +removeElement(numbers2, target2));
	}
	public static int removeElement(int[] nums, int val)
	{    
		int j = 0;
	    for(int i = 0; i < nums.length; i++)
	    {
	    	if(nums[i] != val)
	    	{	
	    		nums[i] = nums[j];
	    		j++;
	    	}
	    }
		
	   return j;  
	   
	}

}
