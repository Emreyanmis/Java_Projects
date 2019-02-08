package Question14_PC;

public class Word_Separator 
{
	
	public static String format(String str)
	{
		StringBuilder strb = new StringBuilder(str);
		
		int j = str.length();
		for(int i = 1; i < j; i++)
		{
			
			if(Character.isUpperCase(strb.charAt(i)))
			{	
				strb.insert(i, " ");
			    strb.insert(i + 1, Character.toLowerCase(strb.charAt(i + 1)));
			    strb.deleteCharAt(i + 2);
			 
			    j = str.length();
			}	
			
		
	
		}
		
		return strb.toString();
	}

}
