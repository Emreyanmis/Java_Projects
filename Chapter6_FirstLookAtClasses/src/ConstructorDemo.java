
public class ConstructorDemo 
{

	public static void main(String[] args)
	{
		Rectangle4 box = new Rectangle4(5.0, 15.00);
		
		System.out.println("The length of the box: " + box.getLength());
		
		System.out.println("The width of the box: " + box.getWidth());
		
		System.out.println("The area of the box: " + box.getArea());	
	}

}
