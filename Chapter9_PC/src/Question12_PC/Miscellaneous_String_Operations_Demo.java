package Question12_PC;


import java.util.Scanner;
public class Miscellaneous_String_Operations_Demo
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
	    String input1, input2, input3;
	    
	    System.out.print("Write a sentence that has at least two same words: ");
	    input1 = keyboard.nextLine();
	    
	    System.out.print("Enter one of the same word: ");
	    input2 = keyboard.nextLine();
	    
	    
	    System.out.print("Enter the word that you want to replace with the same word: ");
	    input3 = keyboard.nextLine();
	    
	    System.out.println("\n\nWord Count: " + Miscellaneous_String_Operations.wordCount(input1));
	    System.out.println("Most frequent letter: " +  Miscellaneous_String_Operations.mostFrequent(input1));
	    System.out.println("The new sentence : " + Miscellaneous_String_Operations.replaceSubstring(input1,input2 , input3));

	}

}
