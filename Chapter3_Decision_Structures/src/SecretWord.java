import java.util.Scanner;

public class SecretWord 
{

	public static void main(String[] args) 
	{
		Scanner keyboard =  new Scanner(System.in);
		
		String input;
		
		System.out.print("Enter the secret word:");
		input = keyboard.nextLine();
		
		if(input.equalsIgnoreCase("PROSPERO"))
			System.out.println("Congratulations! You know the secret word!");
		else
			System.out.println("I am sorry to inform you that it is NOT the "
					            + " secret word!");
	}
}
