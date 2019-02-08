package Question3;

import java.util.Scanner;
public class RoomCarpetDemo 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double length, 
				width,
				cost = 8;
		
		System.out.print("Enter the length of the floor: ");
		length = keyboard.nextDouble();
		
		System.out.print("Enter the width of the floor: ");
		width = keyboard.nextDouble();
		
		RoomDimension demo1 = new RoomDimension(length, width);
		
		RoomCarpet demo2 = new RoomCarpet(demo1,cost);
		
		System.out.println(demo2);

	}

}
