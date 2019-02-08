package leetCode_interview_easy_collections_arrays;

public class SingleNumber {

	public static void main(String[] args) {
		int [] arr = {4,1,2,1,2,100, 100};
		single(arr);
	}
	public static int single(int [] nums) {
		int answer = 0;
		for(int i = 0; i < nums.length;i++) {
			System.out.print(answer + " ^ " + nums[i]);
			answer = answer ^ nums[i];
			System.out.println(" answer: " + answer);
		}
		
		return answer;
	}

}
