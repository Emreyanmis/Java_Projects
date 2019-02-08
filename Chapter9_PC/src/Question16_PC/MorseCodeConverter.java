package Question16_PC;

import java.util.Scanner;
public class MorseCodeConverter 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		String input;
		
		 System.out.print("Enter a string:  ");
		 input = keyboard.nextLine();
		 System.out.print("New sentence: ");
		 format(input);
	}
	
	public static void format(String str)
	{
		str = str.toUpperCase();
		char[] ch = str.toCharArray();
		String[] st = new String[ch.length];
		
		for(int i = 0; i < ch.length; i++)
		{
			if(ch[i] == ' ')
				st[i] = " ";
			else if(ch[i] == ',')
				st[i] = "--..--";
			else if(ch[i] == '.')
				st[i] = ".-.-.-";
			else if(ch[i] == '?')
				st[i] = "..--..";
			else if(ch[i] == '0')
				st[i] = "-----";
			else if(ch[i] == '1')
				st[i] = ".----";
			else if(ch[i] == '2')
				st[i] = "..---";
			else if(ch[i] == '3')
				st[i] = "...--";
			else if(ch[i] == '4')
				st[i] = "....-";
			else if(ch[i] == '5')
				st[i] = ".....";
			else if(ch[i] == '6')
				st[i] = "-....";
			else if(ch[i] == '7')
				st[i] = "--...";
			else if(ch[i] == '8')
				st[i] = "---..";
			else if(ch[i] == '9')
				st[i] = "----.";
			else if(ch[i] == 'A')
				st[i] = ".-";
			else if(ch[i] == 'B')
				st[i] = "-...";
			else if(ch[i] == 'C')
				st[i] = "-.-.";
			else if(ch[i] == 'D')
				st[i] = "-..";
			else if(ch[i] == 'E')
				st[i] = ".";
			else if(ch[i] == 'F')
				st[i] = "..-.";
			else if(ch[i] == 'G')
				st[i] = "--.";
			else if(ch[i] == 'H')
				st[i] = "....";
			else if(ch[i] == 'I')
				st[i] = "..";
			else if(ch[i] == 'J')
				st[i] = ".---";
			else if(ch[i] == 'K')
				st[i] = "-.-";
			else if(ch[i] == 'L')
				st[i] = ".-..";
			else if(ch[i] == 'M')
				st[i] = "--";
			else if(ch[i] == 'N')
				st[i] = "-.";
			else if(ch[i] =='O')
				st[i] = "---";
			else if(ch[i] == 'P')
				st[i] = ".--.";
			else if(ch[i] == 'Q')
				st[i] = "--.-";
			else if(ch[i] == 'R')
				st[i] = ".-.";
			else if(ch[i] == 'S')
				st[i] = "...";
			else if(ch[i] == 'T')
				st[i] = "-";
			else if(ch[i] == 'U')
				st[i] = "..-";
			else if(ch[i] == 'V')
				st[i] = "...-";
			else if(ch[i] == 'W')
				st[i] = ".--";
			else if(ch[i] == 'X')
				st[i] = "-..-";
			else if(ch[i] == 'Y')
				st[i] = "-.--";
			else if(ch[i] == 'Z')
				st[i] = "--..";
			
			System.out.print(st[i]);
		}
		
		
	}

}
