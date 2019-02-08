package Intefaces;

public class InterfaceDemo 
{

	public static void main(String[] args)
	{
		// Interface cannot be instantiated 
		// Implemented class must be instantiated to use the Interface class
		// Create an instance of the Person class.
		Person demo = new Person("Emre");
		
		demo.diplay();
	}

}
