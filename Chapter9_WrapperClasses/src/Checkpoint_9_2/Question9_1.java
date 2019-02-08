package Checkpoint_9_2;

public class Question9_1
{

	public static void main(String[] args)
	{
		char big = 'P';
		char little;
		
		little = Character.toLowerCase(big);
		System.out.println(little);

		String str = "digi!termenffr3f204r242fh29f9!fh034fh4830";
		
		for(int i = 0; i < str.length();i++ )
		{	
			if(str.charAt(i) == '!')
				System.out.println("Charter: " + (i + 1) + " has a digit of: " + str.charAt(i));
			else
				System.out.println("Charter: " + (i + 1) + " does NOT have a digit");
				
		}		
	}

}
