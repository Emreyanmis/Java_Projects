package Question3;

public class RetailItemClassDemo 
{

	public static void main(String[] args) throws InvalidPrice, InvalidUnitsOnHand 
	{
		RetailItemClass retail1 = new RetailItemClass("Jacket", 12, 59.95);
		RetailItemClass retail2= new RetailItemClass("Designer Jeans", 40, 34.95);
		RetailItemClass retail3 = new RetailItemClass("Shirt", 20, 24.95);
         
		System.out.println("\t\t\tDescription\t\t\t" + "Units on Hand\t\t\t" + "Price");
		System.out.println("=================================================="
							+ "=============================================");
		System.out.println("Item #1\t\t\t" + retail1.getDescription() + "\t\t\t\t"+ retail1.getUnitOnHand()
		                    + "\t\t\t\t" + retail1.getPrice());
		
		System.out.println("Item #2\t\t\t" + retail2.getDescription() + "\t\t\t"+ retail2.getUnitOnHand()
        + "\t\t\t\t" + retail2.getPrice());
		
		System.out.println("Item #3\t\t\t" + retail3.getDescription() + "\t\t\t\t"+ retail3.getUnitOnHand()
        + "\t\t\t\t" + retail3.getPrice());
	}

}
