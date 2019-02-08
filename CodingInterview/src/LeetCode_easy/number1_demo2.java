package LeetCode_easy;

public class number1_demo2 
{
	 int [] numbers = {2,3,4,5,6,7,8,9};
	 
	
	 static int[] twoSum(int[] nums, int target) 
	   {
	        for (int i = 0; i < nums.length; i++) 
	        {
	            for (int j = i + 1; j < nums.length; j++) 
	            {
	                if (nums[j] + nums[i] == target)
	                {
	                    return new int[] { i, j };
	                } 
	            }
	         }
	     throw new IllegalArgumentException("No two sum solution");
	   }   

}
