import java.util.Scanner;

public class CellPhoneTester 
{

	public static void main(String[] args) 
	{   
		Scanner keyboard = new Scanner(System.in);
		
		String manu;
		String model;
		Double price;
		
		System.out.print("Enter the manufacturer: ");
		manu = keyboard.nextLine();
		
		System.out.print("Enter the model number: ");
		model = keyboard.nextLine();
		
		System.out.print("Enter the retail price: $");
		price = keyboard.nextDouble();
         
		CellPhone phone = new CellPhone(manu,model,price);
		
		System.out.println("\nHere is the data that you provided: ");
		System.out.println("Manufacturer: " + phone.getManufact());
		System.out.println("Model number: " + phone.getModel());
		System.out.println("Retail Price: " + phone.getRetailPrice());	
	}
}
