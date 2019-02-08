package Question9;

import java.util.Scanner;
public class GeometryCalculatorDemo 
{

	public static void main(String[] args) 
	{
		Scanner keybaord = new Scanner(System.in);
		int choice;
		
	 do
	 {	 
		 System.out.print("Geometry Calculator\n1. Calculate the Area of a Circle"
					+ "\n2. Calculate the Area of a Rectangle"
					+"\n3. Calculate the Area of a Triangle"
					+"\n4. Quit" + "\n\nEnter your choice (1-4): ");
		 choice = keybaord.nextInt();
	 
		if(choice == 1)
		{
			double radius;
			
			System.out.print("Enter the radius of the circle in meters: ");
			radius = keybaord.nextDouble();
			
			double area =  Geometry.areaCircle(radius);
			
			if(area != -1)
				System.out.println("The area of the cirlce is: " + area + " meters squared.\n" );
			else	
				System.out.println("Invalid radius\n");
			
		}
		
		else if (choice ==  2)
		{
			double length, width;
			
			System.out.print("Enter the length of the rectangle in meters: ");
			length = keybaord.nextDouble();
			
			System.out.print("Enter the width of the rectangle in meters: ");
			width = keybaord.nextDouble();
			
			double area =  Geometry.areaRectangle(length, width);
			
			if(area != -1)
				System.out.println("The area of the rectanlge is: " + area + " meters squared.\n" );
			else	
				System.out.println("Invalid length or width\n");
		}
		
		else if (choice ==  3)
		{
			double base, height;
			
			System.out.print("Enter the base of the triangle in meters: ");
			base = keybaord.nextDouble();
			
			System.out.print("Enter the height of the triangle in meters: ");
			height = keybaord.nextDouble();
			
			double area =  Geometry.areaTriangle(base, height);
			
			if(area != -1)
				System.out.println("The area of the triangle is: " + area + " meters squared.\n" );
			else	
				System.out.println("Invalid base or height.\n");
		}
		else if(choice == 4)
			System.out.println("Bye bye!");
		else
			System.out.println("Invalid choice.\nTry Again!\n");
		
	 } while(choice != 4);
	  
		
		
			
		
	}

}
