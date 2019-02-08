package Passing_Objects_as_Arguments_to_Methods;

public class PassObject2 
{
	public static void main(String[] args)
	{
		Rectangle box = new Rectangle(12.00, 5.00);
		
		System.out.println("Length: " + box.getLength() + "\nWidth: " +box.getWidth());
		
		changeRectangle(box);
		
		System.out.println("\nHere is the new contents:\n"
				+ "Length: " + box.getLength() + "\nWidth: " +box.getWidth());
	}
	
	public static  void changeRectangle(Rectangle r)
	{
		r.setLength(0.0);
		r.setWidth(0.0);
	}

}
