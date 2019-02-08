
import java.util.Scanner;


public class Project3HalisEmreYanmis
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int newGridSize;
		Grid daisyMap = new Grid();
		char answer = ' ';
		
		while(answer != 'Q')
		{
			System.out.println("You are in spot " + "[" + daisyMap.getCurrentRow() + ", " + daisyMap.getCurrentCol() + "]");
			System.out.println("There are " + daisyMap.getCurrentValue() + " daisies at this spot");
                        System.out.println("\nYou currently have a total of " + daisyMap.showDaisies() + " daisies");
			System.out.println("What would you like to do? (G, J, N, S, E, W, M, Q): ");

			answer = Character.toUpperCase(input.nextLine().charAt(0));
			
			
			switch(answer)
			{
				case 'N':
				    daisyMap.goNorth();
				    break;
				case 'S':
				    daisyMap.goSouth();
				    break;
				case 'E':
				    daisyMap.goEast();
				    break;
				case 'W':
			            daisyMap.goWest();
                                    break;
                                case 'G':
                                    daisyMap.gatherDaisies();
                                    break;
                                case 'J': 
                                    daisyMap.jump();
                                    break;
                                case 'M':
                                    System.out.println(daisyMap);
                                    break;
				case 'Q':
                                    break;
                                default:
                                         	
			}
                        
		}
	}
}