package Question4;

public class LandTractDemo
{

	public static void main(String[] args) 
	{
		LandTract demo1 = new LandTract(21.00,94.76);
		LandTract demo2 = new LandTract(29.00,24.76);
		
		System.out.println(demo1 + "\n" + demo2);
		
		if(demo1.equals(demo2))
			System.out.println("Both objects have the same area.");
		else
			System.out.println("Both objects do NOT have the same area.");
		
	} 

}
