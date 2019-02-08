import java.util.Scanner;

public class CircleClassDemo 
{

	public static void main(String[] args) 
	{
	   Scanner keyboard = new Scanner(System.in);
	   
	   int input;
	   
	   System.out.print("Enter the radius of the circle in meters: ");
	   input = keyboard.nextInt();
	   
	   CircleClass c1 = new CircleClass(input);
	   
	   System.out.println("The area of the circle: " + c1.getArea() + " meters square.\nThe diameter of the"
	   		+ " circle: " + c1.getDiameter() + " meters.\nThe Circumfernce of the circle: " + c1.getCircumference() + " meters.");

	}

}
