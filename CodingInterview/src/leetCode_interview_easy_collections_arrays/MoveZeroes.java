package leetCode_interview_easy_collections_arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		int[] arr = {0,5,10,12,3,0};
		int i =0;
		i = i++;
		System.out.println(i);
		moveZeroes2(arr);
	}
	public static void moveZeroes(int[] nums) {
		boolean flag = true;
        for(int i = 0, j = i + 1; i < nums.length; i++){
        	//System.out.println("Forloop, array["+(i) +"]: "+ nums[i]);
            if(nums[i] == 0 && (i+1 != nums.length)){
             j = i + 1;
             while(j < nums.length && nums[j] == 0)
             {
            	 j++;
             }    	
                while(j < nums.length && nums[j] != 0 && flag){
                    nums[i] =  nums[j];
                    nums[j] = 0;
                   // System.out.println("array["+(i) +"]: "+ nums[i]);
                	//System.out.println("j: " + j);
                    flag = false;
                 } 
             
            }
            flag = true;
        }  
       // System.out.println("ARRay:\n");
        //for(int i: nums) {
        //	System.out.print(i + "       ");
       // }
    }
	public static void moveZeroes2(int[] nums) {
		if (nums == null || nums.length == 0) return;        
	
	    int insertPos = 0;
	    for (int num: nums) {
	        if (num != 0) {
	        	//System.out.println("before: " + insertPos);
	        	nums[insertPos++] = num;
	        	//System.out.println("after: " + insertPos++);
	        }	
	    }        
	
	    while (insertPos < nums.length) {
	        nums[insertPos++] = 0;
	    }
   }
}
