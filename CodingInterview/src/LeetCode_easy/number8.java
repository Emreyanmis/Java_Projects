package LeetCode_easy;

public class number8 
{
	public static void main(String[] args) 
	{
		int[] sd = 
				{1,2,4,2,5,7,2,4,9,0};
		System.out.println(maxProfit2(sd));

	}
		public static int maxProfit(int[] prices) 
	    {
	        if(prices.length == 0)
	            return 0;
	        
	        int profit1 = 0, profit11 = 0;
	        int profit2 = 0, profit22 = 0;
	        int p = 0;
	        int sum2; 
	        int profit = 0;
	        int buy = prices[0];
	        int j = 0;
	        int k = 0;
	        
	        for(int i = 1; i < prices.length; i++)
	        {
	        	if(prices[i] - prices[i - 1] > 0)
	        	{	
	        		 p = prices[i] - prices[i- 1];
	        	
		             if(p > profit1 && profit2 != 0)
		             {	 
			            	 int n = i;
			            	 while(n < prices.length && (prices[n] - prices[i - 1] >= profit1))
			            	 {	 
				            	profit1 = prices[n] - prices[i - 1];
				            	System.out.println("n: " + n +":" + profit1);
				            	profit11 = prices[n] - prices[i - 1];
				            	n++;

			            	 }
			            	 i = n;
			            	 System.out.println("profit1: " + profit11);
		            	 
		             }	
		             else if (p > profit2)
		             {	 
		            	 int m = i;
		            	 System.out.println("m: " + m);
		            	 while(m < prices.length && (prices[m] - prices[i - 1] >= profit2))
		            	 {	 
		            		 profit2 = prices[m] - prices[i - 1];  
		            		 System.out.println("m: " + m + ":"+ profit2);
		            		 profit22 = prices[m] - prices[i - 1]; 
		            		 m++;
		            	 }
		            	 i = m;
		            	 System.out.println("profit2: " + profit22);
		            	 
		             } 
	        	 }    
	        }
	        
	        int sum = profit11 + profit22;
	        
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
	        
	        sum2 = profit;
	        if(sum2 > sum)
	        	return sum2;
	        else
	            return sum;  
	   
	}
	public static int maxProfit2(int[] prices) 
	{
	        int buyOne = Integer.MAX_VALUE;
	        int SellOne = 0;
	        int buyTwo = Integer.MAX_VALUE;
	        int SellTwo = 0;
	        for(int p : prices) 
	        {
	        	System.out.println("p: " + p);
	            buyOne = Math.min(buyOne, p);
	            System.out.println("buy one: " + buyOne );
	            
	            SellOne = Math.max(SellOne, p - buyOne);
	            System.out.println("sell one: " + SellOne );
	            
	            buyTwo = Math.min(buyTwo, p - SellOne);
	            System.out.println("\nbuy two: " + buyTwo );
	            
	            SellTwo = Math.max(SellTwo, p - buyTwo);
	            System.out.println("sell two: " + SellTwo );
	        }
	        return SellTwo;
	    }

}
