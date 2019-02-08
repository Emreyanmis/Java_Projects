package Question15_P;


import java.util.Scanner;
public class PigLatin 
{

	public static void main(String[] args) 
	{
		 Scanner keyboard = new Scanner(System.in);
		 String input,latin;
		 
		 System.out.print("Enter a sentence:  ");
		 input = keyboard.nextLine();
		 
	
		 System.out.print("New sentence: ");
		 format1(input);
	}
	
	
	public static void format1(String str)
	{
		str = str.toUpperCase();
		String[] tokens = str.split(" ");
		
		String[] array = new String[tokens.length];
		String latin = " ";
		
		for(int i = 0; i < tokens.length; i++)
		{
			String st = tokens[i];
			String str1 = st.substring(0, 1);
			
			String str2 = st.substring(1, st.length() );
			
			str2 = str2.concat(str1);
			str2 = str2.concat("AY ");
			
			array[i] = str2;
			System.out.print(array[i]);
			
		}
  }

}
