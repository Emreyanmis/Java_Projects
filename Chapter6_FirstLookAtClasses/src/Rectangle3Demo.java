
public class Rectangle3Demo
{

	public static void main(String[] args) 
	{
	   Rectangle3 box = new Rectangle3();
	   
	   box.setLength(10.00);
       
	   box.setWidth(20.00);
	   
       System.out.println("The length of the rectangle: " + box.getLength() +"\nThe width of the"
       		+ " rectangle is: " + box.getWidth() + "\nThe area of the rectangel is: "
       		   + box.getArea() );      
	}

}