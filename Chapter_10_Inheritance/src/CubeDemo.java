import java.util.Scanner;

public class CubeDemo
{

	public static void main(String[] args) 
	{
	   double length,
	          width,
	          height;
	          
	    Scanner keybaord = new Scanner(System.in);
	    
	    System.out.println("Enter the following dimensions of a cube:");
	    
	    System.out.print("Length: ");
	    length = keybaord.nextDouble();
	    
	    System.out.print("Width: ");
	    width = keybaord.nextDouble();
	    
	    System.out.print("Height: ");
	    height = keybaord.nextDouble();
	    
	    Cube myCube = new Cube(length, width, height);
	    
	    System.out.println("Here are the properties of the cube: ");
	    
	    System.out.println("Width: " + myCube.getWidth());
	    
	    System.out.println("Length: " + myCube.getLength());
	    
	    System.out.println("Height " + myCube.getHeight());
	    
	    System.out.println("Area: " + myCube.getArea());
	    
	    System.out.println("Surface area: " + myCube.getSurfaceArea());
	    
	    System.out.println("Volume: " + myCube.getVolume());

	}

}
