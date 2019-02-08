import java.util.Scanner;

public class RectangleArea 
{

	public static void main(String[] args) 
	{
	   double length,
	       width,
	       area;
	   
	    length = getLength();
	    width = getWidth();
	    
	    area = getArea(length, width);
	    
	    displayData(area); 
	}
	
	public static double getLength()
	{
		Scanner keybaord = new Scanner(System.in);
		
		double length;
		System.out.print("Enter the length of the rectangle in meters: ");
		length = keybaord.nextInt();
		
		return length;
	}
	
	public static double getWidth()
	{
		Scanner keybaord = new Scanner(System.in);
		
		double width;
		System.out.print("Enter the width of the rectangle in meters: ");
		width = keybaord.nextInt();
		
		return width;
	}
	
	public static double getArea(double length, double width)
	{
		double area;
		area = length * width;
		
		return area;	
	}
	
	public static void displayData(double area)
	{
		System.out.println("The area of this rectange is: " + area);
	}
}
