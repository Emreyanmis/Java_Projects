package LeetCode_easy;

public class number7 {

	public static void main(String[] args) 
	{
		int[] sd = 
				{7,1,5,3,6,4};
		System.out.println(buy(sd));

	}
	public static int buy(int[] prices) 
	{
		if(prices.length == 0)
			return 0;
	
		int buy = prices[0];
		int sell = 0;
		int profit = 0;
		
		for(int i = 1; i < prices.length; i++)
		{
			if(prices[i] < buy)
				buy = prices[i];
			else 
			{
				if(prices[i] - buy > profit)
					profit = prices[i] - buy;
			}			
		}
		
		return profit;	
	}
}
