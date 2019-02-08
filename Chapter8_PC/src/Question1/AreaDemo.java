package Question1;


import java.util.Scanner;
public class AreaDemo 
{

	public static void main(String[] args) 
	{
		Scanner keybaord = new Scanner(System.in);
		double radius;
		float radius1;
		double height;
		double length;
		double width;
		
		
		System.out.print("Enter the radius of the circle to find its area: ");
		radius = keybaord.nextDouble();
		
		System.out.print("Enter the height of the cylinder to find its area: ");
		height = keybaord.nextDouble();
		
		System.out.print("Enter the radius of the cylinder to find its area: ");
		radius1 = keybaord.nextFloat();
		
		System.out.print("Enter the width of the rectangle to find its area: ");
		width = keybaord.nextDouble();
		
		System.out.print("Enter the length of the rectangle to find its area: ");
		length = keybaord.nextDouble();
		
		System.out.println("==================================================\n");
		System.out.printf("The area of the circle is: %.2f",Area.find(radius));
		System.out.printf("\nThe area of the cylinder is: %.2f",Area.find(radius, height));
		System.out.println("\nThe area of the rectangle is: " + Area.find(width, length));
		
		
		
	}

}
