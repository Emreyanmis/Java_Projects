package Question13_PC;

public class PhoneNumber 
{
	
	public static void format(String str)
	{
	
		str = str.toUpperCase();
		String str1;
		System.out.println(str);
		
		StringBuilder strb = new StringBuilder(str);
		
		strb.deleteCharAt(3);
		strb.deleteCharAt(6);
		
	
		for(int i = 0; i < strb.length(); i++)
		{
			if(strb.charAt(i) == 'A' || strb.charAt(i) == 'B' || strb.charAt(i) == 'C')
			{	
				   strb.deleteCharAt(i);
				   strb.insert(i,"2");
			}	   
			else if(strb.charAt(i) == 'D' || strb.charAt(i) == 'E' || strb.charAt(i) == 'F')
			{	
					strb.deleteCharAt(i);
				   strb.insert(i, "3");
			}		   
			else if(strb.charAt(i) == 'G' || strb.charAt(i) == 'H' || strb.charAt(i) == 'I')
			{	
				  strb.deleteCharAt(i);
				   strb.insert(i, "4");	  
			}		   
			else if(strb.charAt(i) == 'J' || strb.charAt(i) == 'K' || strb.charAt(i) == 'L')
			{	
					strb.deleteCharAt(i);
				    strb.insert(i, "5");	   
			}	   
			else if(strb.charAt(i) == 'M' || strb.charAt(i) == 'N' || strb.charAt(i) == 'O')
			{	
				 	strb.deleteCharAt(i);
				   strb.insert(i, "6");
			}	   
			else if(strb.charAt(i) == 'P' || strb.charAt(i) == 'Q' || strb.charAt(i) == 'R'
					|| strb.charAt(i) == 'S')
			{	
				 	strb.deleteCharAt(i);
				    strb.insert(i, "7");
			}	    
			else if(strb.charAt(i) == 'T' || strb.charAt(i) == 'U' || strb.charAt(i) == 'V')
			{	
					strb.deleteCharAt(i);
				   strb.insert(i, "8");
			}		   
			else if(strb.charAt(i) == 'W' || strb.charAt(i) == 'X' || strb.charAt(i) == 'Y'
					|| strb.charAt(i) == 'Z')
			{	
				  strb.deleteCharAt(i);
				   strb.insert(i, "9");
			}		   
		}
		
		strb.insert(3, "-");
		strb.insert(7, "-");
		
		str1 = strb.toString();
		
		System.out.println(str1);	
		
	}
	
}
