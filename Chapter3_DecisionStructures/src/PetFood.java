import java.util.Scanner;

public class PetFood 
{

	public static void main(String[] args) 
	{
	  Scanner keybaord = new Scanner(System.in);
	  
	  String input;
	  char foodGrade;
	  
	  System.out.println("Our pet food is available in three grades:");
	  System.out.print("A,B, and C. Which do you pricing for:");
	  input = keybaord.nextLine();
	  
	 foodGrade = input.charAt(0);
	 
	 switch(foodGrade)
	 {
	 	case 'a':
	 	case 'A':
	 		System.out.println("30 cent per lb.");
	 		break;
	   
	 	case 'b':
	 	case 'B':
	 		System.out.println("20 cent per lb.");
	 		break;
	    
	 	case 'c':
	 	case 'C':
	 		System.out.println("15 cent per lb.");
	 		break;
	    
	 	default:
	 		System.out.println("Invalid choice.");	 		
	 }
   }
}
