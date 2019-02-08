package lab08;

// Programmed by  Didar Soyunov
// Date: 10/30/2018


public class Lab08DidarSoyunov 
{

	public static void main(String[] args)
	{
		displayColumnHeaders();
		
		displaySaleWithDiscount("Coke", 8 ,1.39, 20);
		displaySaleWithDiscount("Pepsi", 3 ,1.29, 15);
		displaySaleWithDiscount("Mountain Dew", 12 ,1.59, 25);


	}
	
	public static void displaySaleWithDiscount(String itemDescription, 
												int qty, 
												double cost, 
												int discountPercent) 
	{
		double subTotal, discountAmount, totalAmount;
		subTotal = qty * cost;
		discountAmount = subTotal * discountPercent / 100.0;
		totalAmount = subTotal - discountAmount;
		System.out.printf("%-20s %,5d %,8.2f %5d %,11.2f\n",
						itemDescription,qty,cost,discountPercent,totalAmount);
		
	}



	public static void displayColumnHeaders()
	{
		System.out.printf("%-20s %5s %8s %8s %8s\n",
							"Item Description","Qty",
							"Cost","Disc%","Total");
		System.out.printf("%-20s %5s %8s %8s %8s\n",
						"===================","======",
						"=======","========","======");
		
	}
}
