package leetCode_interview_easy_collections_arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[]  ar = {8,9,9,9};
		plusOne(ar);

	}
	
	public static int[] plusOne(int[] digits) 
    {
        int n = digits.length;
        for(int i = n - 1 ;i >= 0; i--)
        {
            if(digits[i] < 9)
            {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] newNumber = new int [n+1];
		newNumber[0] = 1;
		for(int i: newNumber) {
			System.out.print(i + " ");
		}
		
		return newNumber;
    }

}
