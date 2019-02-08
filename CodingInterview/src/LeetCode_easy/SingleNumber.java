package LeetCode_easy;

public class SingleNumber {

	public static void main(String[] args) {
		int[] arr = {4,6,2,6,2};
		System.out.println(singleNumber(arr));
	}
	
	public static int singleNumber(int[] nums) {
		int ans = 0;
	    
	    int len = nums.length;
	    for(int i=0;i < nums.length;i++){	
	    	System.out.println((ans ^ nums[i]));
	        ans = ans ^ nums[i];
	        System.out.println("ans: " + ans);
	    }
	    System.out.println(4 ^ 0);
	     return ans;
	    }
   

}
