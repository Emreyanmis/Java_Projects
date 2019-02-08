import java.util.Scanner;

public class CubeDemo 
{

	public static void main(String[] args)
	{
		 Scanner keyboard = new Scanner(System.in);
		 double height;
		 double width;
		 double length;
		 
		 System.out.print("Enter the height of the cube in meters: ");
		 height = keyboard.nextDouble();
		 
		 System.out.print("Enter the width of the cube in meters: ");
		 width = keyboard.nextDouble();
		 
		 System.out.print("Enter the length of the cube in meters: ");
		 length = keyboard.nextDouble();
		 
		 Cube demo = new Cube(length, width, height);
		 
		 System.out.println("The area of the cube is: " + demo.getArea() + " meters squared.");
		 System.out.println("The surface area of the cube is: " + demo.getSurfaceArea() + " meters squared.");
		 System.out.println("The volume of the cube is: " + demo.getVolume() + " meters cubic.");
		 
	}

}
