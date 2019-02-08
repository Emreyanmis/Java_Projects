package Methods_That_Copy_Objects_8_6;

public class CopyConstructor 
{
	public static void main(String[] args) 
	{
		Stock demo1 = new Stock ("XYZ",49.34);
		Stock demo2 = demo1.copy();
		
		
		System.out.println("Company1: " + demo1 + "\nCompany2: " + demo2);
		
		if(demo1.equals(demo2))
			System.out.println("Both objects are the same.");
		else
			System.out.println("The objects are NOT the same.");
		
		
		// Confirm that we actually have two objects
		if(demo1 == demo2)
			System.out.println("Both variables reference the same objects");
		else
			System.out.println("The variables reference different objects.");

	}
}
