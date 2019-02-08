import java.util.Scanner;

public class RouletteWheelColorsDemo 
{

	public static void main(String[] args) 
	{
	   Scanner keybaord = new Scanner(System.in);
	   int choice;
	   
	   System.out.print("Enter a pocket number: ");
	   choice =  keybaord.nextInt();

	   RouletteWheelColors demo1 = new RouletteWheelColors(choice);   
	   System.out.println(demo1.getPocketColor());
	}

}
