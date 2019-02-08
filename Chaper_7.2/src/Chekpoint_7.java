/**
 * This program answers the 3 questions on in the checkpoint 7.15
 * @author emreyanmis
 */
public class Chekpoint_7 
{

	public static void main(String[] args) 
	{
		String[] galaxies = {"Mercury", "Venus", "Earth", "Mars" };
		char letter;
		
		for(int i = 0; i < galaxies.length; i++)
		{
			System.out.print(galaxies[i] + " ");
		}	
		
		System.out.println("");
		
		for(int i = 0; i < galaxies.length; i++)
		{   
			letter = galaxies[i].charAt(0);
			System.out.print(letter + " ");
		}	

	}

}
