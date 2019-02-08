
public class RetailItemClassDemo 
{

	public static void main(String[] args) 
	{
		RetailItemClass retail1 = new RetailItemClass("Jacket", 12, 59.95);
		RetailItemClass retail2= new RetailItemClass("Designer Jeans", 40, 34.95);
		RetailItemClass retail3 = new RetailItemClass("Shirt", 20, 24.95);
         
		System.out.println("\t\t\tDescription\t\t\t" + "Units on Hand\t\t\t" + "Price");
		System.out.println("====================================================="
							+ "====================");
		System.out.println("Item #1\t" + retail1.getDescription() + "\t\t"+ retail1.getUnitOnHand()
		                    + "\t\t" + retail1.getPrice());
		
		System.out.println("Item #2\t" + retail2.getDescription() + "\t\t"+ retail2.getUnitOnHand()
        + "\t\t" + retail2.getPrice());
		
		System.out.println("Item #3\t" + retail3.getDescription() + "\t\t"+ retail3.getUnitOnHand()
        + "\t\t" + retail3.getPrice());
	}

}
