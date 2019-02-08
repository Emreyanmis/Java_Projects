
public class SimpleMetod 
{

	public static void main(String[] args) 
	{
		System.out.println("Hello from the main method.");
		
		// when calling a method, only call the method's name
		displayMessage();
		System.out.println("Back in the main method.");
	}
	public static void displayMessage()
	{
		System.out.println("Hello from the diplayMessage method.");
	}
}
