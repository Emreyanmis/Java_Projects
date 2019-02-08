package LeetCode_easy;

public class number1 
{

	public static void main(String[] args)
	{
		int[] nums = {2,7,8,9};
		int target = 9;
		System.out.println("Target is: ");
		twoSum(nums, target);
	}
	
	 static  public int[] twoSum(int[] nums, int target) 
	    {
		 int result[] = new int[2];
	        
	        for(int i = 0; i < nums.length; i++)
	        {
	            for(int k = 0;k < nums.length; k++)
	            {
	                if(nums[i] + nums[k] == target)
	                {
	                	result[0] = i;
	                	result[1] = k;
		               	System.out.print(i + " ," + k);
	                	break;
	                }
	               	break;
	               	
	            }
	        }
  
			return result; 
	    }
	

}
