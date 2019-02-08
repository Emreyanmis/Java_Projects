package Question12_PC;

public class Miscellaneous_String_Operations 
{
	public static int wordCount(String str)
	{   
		int count;
		String[] tokens = str.split(" ");
		
	    count = tokens.length;
	    
	    return count;
	}
	
	public static String arrayToString(char[] ch)
	{
		String str;
		
		str = String.valueOf(ch);
		
		return str;
	}
	
	public static char mostFrequent(String str)
	{
	
		char mostOccurrance = ' ';
		
		str = str.trim();
		
		int most = 0;
		
		for(int i = 0; i < str.length(); i++)
		{
			
			char c = str.charAt(i);
			int count = 0;
			
			for(int j = 0; j < str.length(); j++)
			{
				
				
				if(c == str.charAt(j))
					count = count + 1;
			}
			
			if(count >= most)
			{	
				most = count;
				mostOccurrance = c; 
			}
		}
	
		return mostOccurrance;
	}
	
	public static String replaceSubstring(String str1, String str2, String str3)
	{
		
	    return  str1 = str1.replaceAll(str2, str3);
		
	}

}
