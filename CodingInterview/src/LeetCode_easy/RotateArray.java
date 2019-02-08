package LeetCode_easy;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {-1,-100,3,99};
		int k = 1;
		rotate(arr, k);
	
	}
	
	public static void rotate(int[] nums, int k) {
		 int n = 0;
		 int[] nums1 = new int[nums.length];
		 
		 for(int i = 0; i < nums.length; i++) {
			 nums1[i]= nums[i];
		 }
	
		 while(n < k) {
	        for(int i = 1; i < nums.length; i++){
	        	System.out.print(nums[i- 1] + " ");
	        	System.out.print(nums[i] + " ");
	            nums[i] = nums[i - 1];
	            //ystem.out.print("\n" + nums[i] + " ");
	            
	            if((i+1) == nums.length){
	                 nums[0] = nums[i];
	                 System.out.println(nums[i] + " ");
	                 System.out.println(nums[0] + " ");
	            }
	        n++;
	        }   
		 for(int i = 0; i < nums.length; i++){
			 System.out.print(nums[i] + " ");
		 }
	  }
   }
}	
