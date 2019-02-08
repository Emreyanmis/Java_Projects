package Passing_Objects_as_Arguments_to_Methods;

public class PassObject 
{

	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(12.00, 5.00);
		
		displayRectangle(box);
	}
	
	public static  void displayRectangle(Rectangle r)
	{
		System.out.println("Length: " + r.getLength() + "\nWidth: " + r.getWidth());
	}
}
