package Class_Collaboration_8_11;

import java.util.Scanner;
public class StockTrader 
{

	public static void main(String[] args)
	{
	   int sharesToBuy;
	   
	   Stock1 xyzCompany = new Stock1("XYZ", 9.62);
	   Scanner keyboard = new Scanner(System.in);
	   
	   System.out.printf("XYZ stock is currently $%,.2f\n",xyzCompany.getSharePrice() );
	   
	   
	   System.out.print("How many shares do you want to buy? ");
	   sharesToBuy = keyboard.nextInt();
	   
	   StockPurchase buy = new StockPurchase(xyzCompany, sharesToBuy);
	   
	   System.out.printf("The cost of the stock: $%,.2f ", buy.getCost());
	   
	}

}
