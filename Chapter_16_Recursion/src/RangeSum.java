import java.util.Scanner;

public class RangeSum 
{
	public static void main(String[] args) 
	{  
		Scanner keybaord = new Scanner(System.in);
		
		int[]  numbers = {1,2,3,4,5,6,7,8,9};
		int sum;
		System.out.println("Enter the intial index you want to begin:");
		int x = keybaord.nextInt();
		System.out.println("Enter the final index you want to end: ");
		int y = keybaord.nextInt();
		sum = rangeSum(numbers,x,y);
		
		System.out.println("The sum of the array from index " + x + " to index " + y + " is: " + sum);

	}
	
	public static int rangeSum(int[]array, int start, int end)
	{
		if(start > end)
			return 0;
		else
			return array[start] + rangeSum(array,start+1,end);
	}

}
