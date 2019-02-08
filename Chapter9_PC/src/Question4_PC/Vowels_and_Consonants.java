package Question4_PC;

public class Vowels_and_Consonants 
{
	
	private String str;
	
	
	public Vowels_and_Consonants (String str)
	{
	   this.str = str;
	  
	   
	}
	
	public int getVowels()
	{
	   int count = 0; 
	   
	   str = str.toLowerCase();
	
	   
	   for(int i = 0; i < str.length(); i++)
	   {
		   if(str.charAt(i) == 'a' || str.charAt(i) == 'e'  || str.charAt(i) == 'i' 
			 || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			   count++;
	   }
	   
	   return count;
	   
	}
	
	public int getConsonants()
	{
		int count = 0;
		
		str = str.toLowerCase();
		
		for(int i = 0; i < str.length(); i++)
		   {
			   if( str.charAt(i) != 'a' && str.charAt(i) != 'e'  && str.charAt(i) != 'i' 
				 && str.charAt(i) != 'o' && str.charAt(i) != 'u' && str.charAt(i) != ' ')
				   count++;
		   }
		   
		   return count;
	}

}
