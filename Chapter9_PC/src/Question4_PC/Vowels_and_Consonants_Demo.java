package Question4_PC;


import java.util.Scanner;
public class Vowels_and_Consonants_Demo 
{

	public static void main(String[] args)
	{
		Scanner keybaord = new Scanner(System.in);
		String input, choice;
		
		do 
		{
			System.out.print("Enter a string: ");
			input =  keybaord.nextLine();
			Vowels_and_Consonants demo = new Vowels_and_Consonants(input);
			int sum = demo.getConsonants() + demo.getVowels();
			
			System.out.print("a. Count the number of vowels in the string\nb. Count the number of consonants in the string"
					+ "\nc. Count both the vowels and consonants in the string\nd. Enter anohter string\ne. Exit the program"
					  +"\n\nEnter your choice: "      );
			choice =  keybaord.nextLine();
			choice = choice.toLowerCase();
			
			if(choice.charAt(0) == 'a')
				System.out.println("Number of vowels: "  + demo.getVowels() + "\n");
			else if(choice.charAt(0) == 'b')
				System.out.println("Number of consonants: "  + demo.getConsonants()+ "\n");
			else if(choice.charAt(0) == 'c')
				System.out.println("Number of both the vowels and consonants in the string: "  + sum + "\n");
			else if(choice.charAt(0) == 'd')
			{
				System.out.print("Enter a string: ");
				input =  keybaord.nextLine();
				System.out.print("a. Count the number of vowels in the string\nb. Count the number of consonants in the string"
						+ "\nc. Count both the vowels and consonants in the string\ne. Exit the program"
						  +"\n\nEnter your choice: "      );
				choice =  keybaord.nextLine();
				choice = choice.toLowerCase();
				
				Vowels_and_Consonants demo2 = new Vowels_and_Consonants(input);
				
				int sum1 = demo2.getConsonants() + demo2.getVowels();
				if(choice.charAt(0) == 'a')
					System.out.println("Number of vowels: "  + demo2.getVowels() + "\n");
				else if(choice.charAt(0) == 'b')
					System.out.println("Number of consonants: "  + demo2.getConsonants()+ "\n");
				else if(choice.charAt(0) == 'c')
					System.out.println("Number of both the vowels and consonants in the string: "  + sum1 + "\n");
				else if(choice.charAt(0) == 'e')
				{	
					System.out.println("Bye bye!");
					System.exit(0);
				}
			}
			
			else if(choice.charAt(0) == 'e')
			{	
				System.out.println("Bye bye!");
				System.exit(0);
			}	
			
		}while(choice.charAt(0) != 'e');
		
	
		
	}

}
