import java.util.Scanner;

/**
 * This program translates the English names of the seasons into Spanish.
 * @author emreyanmis
 */

public class Seasons 
{

	public static void main(String[] args) 
	{
	   Scanner keyboard = new Scanner(System.in);
	   
	   String input;
	   
	   System.out.println("Enter the name of the season:");
	   input = keyboard.nextLine();
	   
	   switch(input)
	   {
	   		case "spring":
	   		case "Spring":
	   			System.out.println("la primavera");
	   			break;
	   	    
	   		case "summer":
	   		case "Summer":
	   			System.out.println("el verano");
	   			break;
	   		
	   		case "autumn":
	   		case "fall":
	   		case "Autumn":
	   		case "Fall":		
	   			System.out.println("el otono");
	   			break;	
	   		
	   		case "winter":
	   		case "Winter":
	   			System.out.println("el verano");
	   			break;
	   	   
	   		default:
	   			System.out.println("Please enter one of these words:\n"
	   					    + "spring, summer, autumn, fall, or winter.");
	   }
	}
}
