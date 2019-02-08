package LeetCode_easy;

public class Best_Time_to_Buy_and_Sell_Stock_III_question_123 {

	public static void main(String[] args) {
		int[] array = {3,3,5,0,0,3,1,4};
		System.out.println(maxProfit(array));
	}
	
	public static int maxProfit(int[] prices) {
        int buyOne = Integer.MAX_VALUE;
        int SellOne = 0;
        int buyTwo = Integer.MAX_VALUE;
        int SellTwo = 0;
        for(int p : prices) {
            buyOne = Math.min(buyOne, p);
            System.out.println("buyOne: " + buyOne);
            
            SellOne = Math.max(SellOne, p - buyOne);
            System.out.println("sell one: " + SellOne);
            
            buyTwo = Math.min(buyTwo, p - SellOne);
            System.out.println("buyTwo: " + buyTwo);
                
            SellTwo = Math.max(SellTwo, p - buyTwo);
            System.out.println("SellTwo: " + SellTwo);
        }
        return SellTwo;   
	}
}
