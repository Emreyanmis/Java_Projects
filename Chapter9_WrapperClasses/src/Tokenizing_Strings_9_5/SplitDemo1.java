package Tokenizing_Strings_9_5;

public class SplitDemo1 
{

	public static void main(String[] args)
	{
		String str = "one two three four";
		
	    // Get the tokens, using a space delimiter.
		String[] tokens  = str.split(" ");
		
		for(String s: tokens)
			System.out.println(s);

	}

}
