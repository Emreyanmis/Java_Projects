package Wring_an_equals_Method_8_4;


public class StockCompare
{

	public static void main(String[] args) 
	{
		Stock demo1 = new Stock ("XYZ",49.34);
		Stock demo2 = new Stock ("XYZ",49.34);

		if(demo1.equals(demo2))
			System.out.println("Both objects are the same.");
		else
			System.out.println("The objects are NOT the same.");

	}

}
