package LeetCode_easy;

import java.util.ArrayList;
public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] arr = {2,2,2,3,1};
		System.out.println(removeDuplicates(arr));
	}
	public static int removeDuplicates(int[] nums) {
		/**
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++){
        	System.out.println((nums[i]));
            if((list.contains(nums[i]))) {
            	break;
            }else {
            	list.add(nums[i]);
            	System.out.println(list);
            }
        }
         return list.size();
         */
		int dupes = 0;
        
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] == nums[i - 1])
                dupes++;
            
            nums[i - dupes] = nums[i];
            
            System.out.println("length: " + nums.length);
        }
       // System.out.println("length: " + nums.length);
        return nums.length - dupes;	
    }

}
