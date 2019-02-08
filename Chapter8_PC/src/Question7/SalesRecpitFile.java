package Question7;


import java.util.Scanner;
public class SalesRecpitFile 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int quantity;
		String choice;
		char option;
		
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
		
		System.out.println("=================================================="
				+ "=============================================\n");
		System.out.println("Would you like to buy Jacket, Designer Jeans, or Shirt? ");
		System.out.print("Enter your choice ( J, D, S): ");
		choice = keyboard.nextLine();
		option = choice.charAt(0);
		
		if(option == 'j')
		{
			System.out.println("SALES RECEIPT");
			System.out.println("Unit Price: " + retail1.getPrice());
			System.out.print("Enter the quantity of items purchased: ");
			quantity = keyboard.nextInt();

			CashRegistrer demo = new CashRegistrer(retail1, quantity);
			
			System.out.println("Quantity: " + quantity);
			System.out.println("Subtotal: $" + demo.getSubtotal());
			System.out.println("Sales Tax: $" + demo.getTax());
			System.out.println("Total: $" + demo.getTotal());
			
		}
		
		else if(option == 'd')
		{
			System.out.println("SALES RECEIPT");
			System.out.println("Unit Price: " + retail2.getPrice());
			System.out.print("Enter the quantity of items purchased: ");
			quantity = keyboard.nextInt();

			CashRegistrer demo = new CashRegistrer(retail2, quantity);
			
			System.out.println("Quantity: " + quantity);
			System.out.println("Subtotal: $" + demo.getSubtotal());
			System.out.println("Sales Tax: $" + demo.getTax());
			System.out.println("Total: $" + demo.getTotal());
		}
		
		else if(option == 's')
		{
			System.out.println("SALES RECEIPT");
			System.out.println("Unit Price: " + retail3.getPrice());
			System.out.print("Enter the quantity of items purchased: ");
			quantity = keyboard.nextInt();

			CashRegistrer demo = new CashRegistrer(retail3, quantity);
			
			System.out.println("Quantity: " + quantity);
			System.out.println("Subtotal: $" + demo.getSubtotal());
			System.out.println("Sales Tax: $" + demo.getTax());
			System.out.println("Total: $" + demo.getTotal());
		}
		else
			System.out.println("Invalid choice!");

	}

}
